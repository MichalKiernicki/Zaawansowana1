package patterns.structual.adapter;

public class Volvo {
    private String name;
    private double speed;

    public Volvo(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
}
