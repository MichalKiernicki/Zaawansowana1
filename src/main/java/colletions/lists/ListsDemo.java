package colletions.lists;

import colletions.Car;

import java.util.*;

public class ListsDemo {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "Diesel", 180);
        Car car2 = new Car("Ford", "Gasoile", 190);
        Car car3 = new Car("BMW", "Diesel", 240);
        Car car4 = new Car("Fiat", "Gasoile", 150);

        //definicja wszelkich struktur kolekcji w Java 1.6 i niżej
        //List<Car> carArrayList = new ArrayList<>(Car);

        //List to interfejs
        //elementy w uporządkowanej kolejności
        //można pobrać na podstawie indeksu
        //może zawierać duplikaty
        //ArrayList jedna z implementacji oparta o strukturę tablicową
        List<Car> carArrayList = new ArrayList<>();
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car4);
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        System.out.println("Zawartość array listy ( z powturzeniami)");
        for (Car car : carArrayList) {
            System.out.println(car);

        }
        //LinkedList oparta jest o węzły i powiązania między nimi
        List<Car> carLinkedList = new LinkedList<>();
        carLinkedList.add(car1);
        carLinkedList.add(car2);
        carLinkedList.add(car4);
        carLinkedList.add(car1);
        carLinkedList.add(car2);
        carLinkedList.add(car3);
        System.out.println("Zawartość array listy ( z powturzeniami)");
        for (Car car : carLinkedList) {
            System.out.println(car);
        }

        /**
         * Kiedy która lista będzie stosowana
         *
         * Najczęściej ArrayList bo więksozść operacji jak na tabeli
         *
         * pobieranie elementu na podstawie indeksu bedzie szybsze w ArrayList O(1) vs O(n)
         *
         * dodawanie elemetu na koniec struktury jest tak samo szybkie chyba ze dojdzie do
         * przepełnienia bufora w ArrayList to wtedy LinkedList bedie szybsza
         *
         * dodawanie na konkretny indeks jest szybsze dla LinkedList
         */

        //dodawanie do listy na konkterty indeks
        carArrayList.add(3,car1);
        carLinkedList.add(2,car4);

        //dodawanie na koniec do add(carX)

        //carArrayList.contains() ---> sprawdzanie czy lement jest na liście
        //carArrayList.remove(3); ---> alternatywnys sposób usuwania elementów
        carArrayList.remove(car3);

        //List<List<Car>> listOfListOfCars; ---> tworzenie listy zawierające zbiór innych list

        }
    }
