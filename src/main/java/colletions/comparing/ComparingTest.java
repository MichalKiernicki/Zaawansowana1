package colletions.comparing;

import colletions.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingTest {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "Diesel", 180);
        Car car2 = new Car("Ford", "Gasoline", 190);
        Car car3 = new Car("BMW", "Diesel", 240);
        Car car4 = new Car("Fiat", "Gasoline", 150);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        System.out.println("\nDrukujemy liste niposrtowana wg prędkości");
        for (Car car : carList) {
            System.out.println(car);
        }
        System.out.println("\nDrukujemy posortowane wg prędkości");
        Collections.sort(carList);
        for (Car car : carList) {
            System.out.println(car);

        }

        System.out.println("\nDrukujemy posortowane wg silnika");
        Collections.sort(carList, new CarComparedByEngine());
        for (Car car : carList) {
            System.out.println(car);

        }
        System.out.println("\nDrukujemy posortowane wg prędkości i silnika");

        Car car6 = new Car("Ford", "Gasoline + gas", 190);
        carList.add(new Car("Volvo", "Gasoline", 180)); //dodawanie do listy i tworzenie nowego obiektu w jednym zapisie
        carList.add(car6);
        Collections.sort(carList, new CarComparedBySpeedAndEngine());

        for (Car car : carList) {
            System.out.println(car);

        }

    }
}
