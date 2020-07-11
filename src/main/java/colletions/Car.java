package colletions;



import java.util.Comparator;
import java.util.Objects;

// klasa bez seeterów i innej możliwej opcji na modyfikowanie jej nazywa się : immutable class
//Comparable wymusza implementacje metody compareTo
//powinien być stosowany do uzyskiwania najbardziej naturalnego porządkowania obiektów
public class Car implements Comparable<Car> {
    private String name;
    private String engine;
    private int maxspeed;

    public Car(String name, String engine, int maxspeed) {
        this.name = name;
        this.engine = engine;
        this.maxspeed = maxspeed;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' +
                ", maxspeed=" + maxspeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        //sprawdzanie referencji czyli miejsca w pamieci
        //to samo miejsce = ten samo obiekt

        if (this == o) return true;

        // sprawdzanie z której klasy pochodzi sprawdzany obiekt
        //musi być ta sama klasa

        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;

        //jak powyzsze porównania przeszły to porównujemy wszystkie pola
        // które chcemy brać jako określające niepowtarzalność naszego obiektu

        return maxspeed == car.maxspeed &&
                name.equals(car.name) &&
                engine.equals(car.engine);
    }

    @Override
    //zwraca niepowtarzalny numer identyfikujący nasz obiekt
    public int hashCode() {
        //liczony na podstawie hashkodów wskazanych pol obiektu
        return Objects.hash(name, engine, maxspeed);
        //return ; ---> można się spotkać z takim zapisem i jest porównywalny każde pole ze sobą
    }

    @Override
    public int compareTo(Car car) {
        return this.maxspeed - car.getMaxspeed();
    }
}
