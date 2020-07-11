package colletions.comparing;

import colletions.Car;

import java.util.Comparator;

public class CarComparedBySpeedAndEngine implements Comparator<Car> {
    @Override
    public int compare(Car car, Car t1) {
        if(car.getMaxspeed() != t1.getMaxspeed()){
            return car.getMaxspeed() - t1.getMaxspeed();
        }
        return car.getEngine().compareTo(t1.getEngine());
    }
}
