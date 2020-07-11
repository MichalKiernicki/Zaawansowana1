package colletions.maps;

import colletions.Car;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", "Diesel", 180);
        Car car2 = new Car("Ford", "Gasoile", 190);
        Car car3 = new Car("BMW", "Diesel", 240);
        Car car4 = new Car("Fiat", "Gasoile", 150);

        //mapa(klucz, wartość) ---> struktura mapy, przechowuje dwie wartości
        Map<String, Car> mapOFCarsByName = new HashMap<>();
        mapOFCarsByName.put(car1.getName(), car1);
        mapOFCarsByName.put(car2.getName(), car2);
        mapOFCarsByName.put(car3.getName(), car3);
        mapOFCarsByName.put(car4.getName(), car4);


        //iterowanie po mapie #1

        mapOFCarsByName.values();// zwraca zestsaw wartości
        System.out.println("\nPrint from map by values\n");
        for (Car value : mapOFCarsByName.values()) {
            System.out.println(value);

        }
        //iterowanie po mapie #2

        mapOFCarsByName.keySet();//zwraca zestaw kluczy
        System.out.println("\n*** keySet ***\n");
//        for (String s : mapOFCarsByName.keySet()) { ---> jeden sposób
//            System.out.println(s);
        for (String s : mapOFCarsByName.keySet()) {
            System.out.println("Map key " + s);
            System.out.println(mapOFCarsByName.get(s));

        }
        //iterowanie po mapie #3

        mapOFCarsByName.entrySet();//zwraca zestaw wpisów Entry<Key, Value>
        System.out.println("\n*** EntrySet ***\n");
        for (Map.Entry<String, Car> stringCarEntry : mapOFCarsByName.entrySet()) {

            System.out.println("\nKey : " + stringCarEntry.getKey()+"\n");
            System.out.println(stringCarEntry.getValue());

//        System.out.println("\nPrint from map by entry\n");
//        for(
//                Map.Entry<String, Car> stringCarEntry :mapOFCarsByName.entrySet()) ---> jeden sposób
//
//        {
//            System.out.println(stringCarEntry);
    }
        //klucz musi być unikalny więc pod kluczem poniżej następuje podmiana wartości
        mapOFCarsByName.put(car1.getName(), new Car("Volvo V50", "Diesel", 220));
        mapOFCarsByName.put(car3.getName(), car3);
        for (String key : mapOFCarsByName.keySet()) {
            System.out.println("Key is : " + key);
            System.out.println(mapOFCarsByName.get(key));

        }
        if(mapOFCarsByName.containsKey("BMW")){//sprawdzanie po kluczu
            System.out.println("BMW on there");
        }
        if(mapOFCarsByName.containsValue(car2)) {//sprawdzanie czy jest tam obiekt car2
            System.out.println("car2 on there :"+ car2);
        }

        mapOFCarsByName.isEmpty();// sprawadzanie czy pusta
        mapOFCarsByName.size();//sprawdzanie rozmiaru

        mapOFCarsByName.remove("Fiat");// usuwa po kluczu
        mapOFCarsByName.remove("Volvo",car1);//usuwa po kluczy pod warunkiem że jest tam car1
    }
}

