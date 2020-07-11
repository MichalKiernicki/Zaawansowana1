package colletions.comparing;

import colletions.Car;

import java.util.Comparator;
//comparator do porównania innym niż naturalny porządek
//albo do porównan jednorazowych za pomocą klasy anonimowej

public class CarComparedByEngine implements Comparator<Car> {

    @Override
    public int compare(Car car, Car t1) {
        return car.getEngine()// w tym miejscu mam silnik car1
                //i ten string "silnik car1" jest porównywany z "silnik car2"
                .compareTo(t1.getEngine());
    }
}
