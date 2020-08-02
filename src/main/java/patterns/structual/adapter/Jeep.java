package patterns.structual.adapter;

public class Jeep extends AmericanCar {
    private String name;

    public Jeep(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
