package java8.streams;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExamples {
    // JAVA 8 wprowadziła Optional czyli opakowanie na obiekt gdzie w środku jest obiekt lub może go nie być
    public static void main(String[] args) {
        Human human = getDefaultHuman("Jan", "Kowalski", 35);
        Human humanNull = null;

        //pusty kontener na obiekt human
        Optional<Human> humanOptional = Optional.empty();

        // kontener tworzony na niepustym obiekcie
        // jak obiekt jest pusty to poniższe rzuci wyjątkiem Null Pointer Exception
        Optional<Human> humanOptional1 = Optional.of(human);

        // kontener tworzony na (być może pustym) obiekcie
        // jak obiekt jest null to też ok, nie będzie NPE
        Optional<Human> humanOptional2 = Optional.ofNullable(human);

        if(humanOptional1.isPresent()) {
            System.out.println("Obiekt niepusty, pobieram");
            humanOptional1.get();
        } else {
            System.out.println("Obiekt pusty, nie ma co pobrać");
        }
        System.out.println(human.getName());
        //System.out.println(humanNull.getName()); rzuca NPE

        // ArrayList vs LinkedList
        // dodawanie nowych elementów na koniec listy
        // dodawanie nowych elementów w dowolnym miejscu listy
        List<Human> humanList = new LinkedList<>();
        humanList.add(human);
        humanList.add(human);
        humanList.add(human);
        humanList.add(human);

        System.out.println("===Co znależliśmy===");
        String found = humanList.stream()
                .filter(el-> "JAN".equalsIgnoreCase(el.getName()))
                .findFirst() // optional od Human
                .map(x->x.getName() + " " + x.getSurname())
                .orElse("Nikt");
        System.out.println(found);

        System.out.println("===Jan czy Anna===");
        Human foundButGetElse = humanList.stream()
                .filter(el-> "JAN".equalsIgnoreCase(el.getName()))
                .findFirst() // optional od Human
                .orElse(getDefaultHuman("Anna", "German", 44));
        System.out.println(foundButGetElse);

        System.out.println("===Jan czy Anna vol 2===");
        Human foundOrElseGet = humanList.stream()
                .filter(el-> "JAN".equalsIgnoreCase(el.getName()))
                .findFirst() // optional od Human
                .orElseGet(() -> getDefaultHuman("Anna", "German", 44));
        System.out.println(foundOrElseGet);

        Optional<Human> optionalPerson = getOptionalHuman("MAria","Janik",22);
        if(optionalPerson.isPresent()) {
            System.out.println("Hoorray!! Someone inside box");
            Human humanFromBox = optionalPerson.get();
            System.out.println(humanFromBox);
        }

    }

    private static Human getDefaultHuman(String name, String surname, int age) {
        System.out.println("Adding default human");
        return new Human(name, surname, age);
    }
    private static Optional<Human> getOptionalHuman(String name, String surname, int age){
        return Optional.ofNullable(getDefaultHuman(name,surname,age));
    }
}
