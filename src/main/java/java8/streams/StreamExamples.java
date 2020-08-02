package java8.streams;

import colletions.Car;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*zasadą działania strumieni jest PANTHA REI
generowanie strumienia:
- metoda stream() na kolekcjach
- metoda of(elements) na elementach wyliczonych
- Arrays.stream(Object[]) - strumien na elementach tabeli

metody pośrednie:
- map - przekształcanie / wykonywanie działania
- flatMap - spłaszczenie z kilku strumieni do jedngo
- filter - filtrowanie po zadanych kryteriach
- limit - max iliść elementów zwracanych
- distinct - przechodzą tylko eleenty niepowtarzalne

metody kończące:
- toArray - zwraca tabelę
- collect - zwraca coś - może być kolekcja lub pojedyńcza wartość
- reduce - zwraca 1 wartość
- count - zwraca ilość elementów
- max - zwraca wartość max wg zadanych kryteriów
- findFirst - zwraca Optional<cośtam>
- findAny - zwraca Optional<cośtam>
 */

public class StreamExamples {
    public static void main(String[] args) {

        //DTO ---> data transfer object
        // używany do przekazywania danych obiektu do plików, przez sieć itp.
        class HumanDTO {
            String name;
            String surname;

            public HumanDTO(String name, String surname) {
                this.name = name;
                this.surname = surname;
            }
        }

        List<Human> people = new LinkedList<>();
        people.add(new Human("Jan", "Kowalski", 22));
        people.add(new Human("Marian", "Nowak", 33));
        people.add(new Human("Paweł", "Wiewiór", 55));
        people.add(new Human("Anna", "Jalewska", 25));

        System.out.println("===Traditional way===");
        for (Human person : people) {
            System.out.println(person);
        }
        System.out.println("===Stream Way===");
        people.stream().forEach(x -> System.out.println(x));

        //Stream
        // 1 - operacja generująca strumień np. metoda stream()
        // 2 - operacje pośrednie - wykonująca jakieś prrzekształcenia
        // 3 - operacje kończące - zwracające wartość albo void
        people.stream() // stream() powołuje strumień obiektów z elementów listy people
                .forEach(x -> System.out.println(x)); // operacja kończąca, wypisująca elementy na ekran

        System.out.println("===filter old way===");
        for (Human person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }

        }
        //filter with JAVA 8 stream
        System.out.println("===filter stream way===");
        people.stream().filter(x -> x.getAge() > 20) // metoda pośrednia
                .forEach(System.out::println); // kończenie strumienia

        //first two elements
        System.out.println("===Limit two first elements===");
        people.stream()
                .limit(2).
                forEach(System.out::println);

        System.out.println("===Limit 2 and under 30===");
        people.stream()
                .limit(2)
                .filter(x -> x.getAge() < 30)
                .forEach(System.out::println);

        System.out.println("===Print names===");
        people.stream()
                .map(x -> x.getName())
                // przekształcamy strumień human na strumień String
                //bo map() zwraca obiekty zwracane prez wywołaną operację (u nas getName)
                .forEach(System.out::println);

        System.out.println("===Move to another object===");
        List<HumanDTO> listDTOs = people.stream()
                //dla każdego strumienia map
                //woła kostruktor klasy HumanDTO
                //przekazując dane z aktualnego strumienia (obiektu Human)
                .map(x -> new HumanDTO(x.getName(), x.getSurname()))
                .collect(Collectors.toList());//wszystkie elementy strumienia są przekształcane w jakąś liste

        listDTOs.forEach(x -> System.out.println(x.name + " " + x.surname));

        System.out.println("===");
        //łączenie kilku kolekcji i wykonywanie operacji na ich elementach

        Set<Human> peopleset = new HashSet<>();
        peopleset.add(new Human("Anna", "Wilkowaska", 18));
        peopleset.add(new Human("Piotr", "Bania", 33));
        peopleset.add(new Human("Agata", "Ruwier", 45));
        peopleset.add(new Human("Karolina", "Inglot", 11));

        List<Human> humanConcat = Stream.of(people, peopleset) // of() składa strumień z podanych kolekcji
                // flatmap przekształca złożoną strukturę w prostszą (jednowymiarową)
                // z strumienia dwóch kolekcji robi jeden strumień z wszystkich elementów obu kolekcji
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        humanConcat.forEach(System.out::println);

        System.out.println("===Wydruk wspólne imię + wiek");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .forEach(el -> System.out.println(el.getName() + " " + el.getAge()));

        System.out.println("===Ludzie z Przedziału 23 - 40");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .filter(x -> x.getAge() < 40)
                .filter(x -> x.getAge() > 23)
                .forEach(System.out::println);

        System.out.println("===");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList())
                //po collect powyższy strumień się kończy i jak chcemy robić coś strumieniowo dalej to znowu wołamy stream()
                //i teraz odnosi się to do listy wyplutej przez .collect()
                .stream()
                .filter(x -> x.getAge() > 30)
                .map(el -> el.getSurname())
                .filter(a -> a.length() > 6)
                .forEach(System.out::println);

        System.out.println("===Sortowanie w strumieniu===");
        Stream.of(people, peopleset)
                .flatMap(x -> x.stream())
                .sorted() // używamy komparatora z klasy Human z Comparable
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("===Sortowanie z zewnętrznym komparatorem===");
        Stream.of(people, peopleset)
                .flatMap(str -> str.stream())
                .sorted(new HumanComparedByNameAndAge())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("===Ilość lat wszystkich razem===");
        // po staremu
        int oldWaySum = 0;
        for (Human person : people) {
            oldWaySum += person.getAge();
        }
        System.out.println("Old way sum = " + oldWaySum);
        int ageSum = people.stream()
                .map(a -> a.getAge())
                // do reduce przeazujesz stan początkowy (w naszym przypadku 0)
                //(sum, el) -> sum + el określa jakie działanie należy wukonać na kolejnych elementach
                .reduce(0, (sum, el) -> sum + el);
        System.out.println("Age sum = " + ageSum);

        System.out.println("==============");
        System.out.println("===łączenie stringów===");

        String namesJoined = people.stream()
                .map(Human::getSurname)
                .collect(Collectors.joining());
        System.out.println("Names joined " + namesJoined);

        System.out.println("===Lączenie stringów z comma");
        String namesJoinedWithComma = people.stream()
                //przy wywolaniu przez referencje (::)
                //odnosimy sie do klasy a nie do elementu strumienia
                .map(Human::getSurname)
                .collect(Collectors.joining(","));
        System.out.println("names joined = " + namesJoinedWithComma);

        System.out.println("===łączenie stringów z comma i nawiasami");
        String namesJoinedWithCommaAndBrackets = people.stream()
                //przy wywolaniu przez referencje (::)
                //odnosimy sie do klasy a nie do elementu strumienia
                .map(Human::getSurname)
                .collect(Collectors.joining(",","{","}"));
        System.out.println("names joined = " + namesJoinedWithComma);

        System.out.println("===Najwyższa wartość wiek===");
        Optional<Integer> maxAge = peopleset.stream()
                .map(Human::getAge)
                .max(Integer::compareTo);
        System.out.println(maxAge.isPresent() ? "Max wiek " + maxAge.get() : "Nie znaleziono");

        System.out.println("===full name print===");
        people.stream()
                .map(x -> x.getName() + " " + x.getSurname())
                .forEach(System.out::println);

        System.out.println("===function info===");
        Object[] peopleArray = people.stream()
                .map(StreamExamples::returnHumanInfo)
                .toArray();
        for (Object o : peopleArray) {
            System.out.println(o);

        }


    }
    private static String returnHumanInfo(Human human) {
        return human.getSurname() + " " +
                human.getName() + " " +
                human.getAge();
    }

}
