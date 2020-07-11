package colletions.sets;

import colletions.Car;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "Diesel", 180);
        Car car2 = new Car("Ford", "Gasoile", 190);
        Car car3 = new Car("BMW", "Diesel", 240);
        Car car4 = new Car("Fiat", "Gasoile", 150);

        //Set przechowuje zestaw niepowtarzalnych obiektów, nie można zapisać w niej dwuch takich samych obiektów

        //Set to interfejs
        //HashSet to konktetna implementacja
        //najbardziej podstawowa, najczaściej używana
        //przechowyje dane nieposortowane, bez gwarancji kolejności odczytu
        //przechowywanie w tabeli hashującej

        Set<Car> cars = new HashSet<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car3);
        cars.add(car1);
        cars.add(car4);
        System.out.println("Dodałem 6 elementów a rozmiar seta to " + cars.size());

        for (Car car : cars) {
            System.out.println(car.getName() + " speed: " + car.getMaxspeed());
            ;

        }
        cars.remove(car2);
        if (cars.contains(car2)) {// contains sprawdza czy w kolekcji znajduje się dany obiekt
            System.out.println("miało usunąć car2 a nie usunęło");
        } else {
            System.out.println("car2 usunięte");
        }

        //TreeSet pozwala przechowywać w porzątku naturalnym lub według zadanego Comparatora
        Set<Car> carTreeSet = new TreeSet<>();
        System.out.println("Czy set pusty " + carTreeSet.isEmpty());

//        carTreeSet.add(car1);
//        carTreeSet.add(car2);
//        carTreeSet.add(car1);
//        carTreeSet.add(car3);
//        carTreeSet.add(car4);

        for (Car car : carTreeSet) {
            System.out.println(carTreeSet.size());

        }
        //LinkedHashSet pamięta kolejność dodawania obiektów
        Set<Car> linkedCars = new LinkedHashSet<>();
        linkedCars.add(car1);
        linkedCars.add(car2);
        linkedCars.add(car3);
        linkedCars.add(car4);
        System.out.println("LinkedHashSet");
        for (Car linkedCar : linkedCars) {
            System.out.println(linkedCar);

        }
        System.out.println("Wyswietlenie tylko car3 jak jest w kolekcji");
        for (Car linkedCar : linkedCars) {
            if (linkedCar.equals(car3)) {
                System.out.println(linkedCar);
            }
        }

    }
}
