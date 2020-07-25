package homeworks.exerciseVehicle;

public class TruckCar extends Car implements Freight{
    private int freightWeight;

    public TruckCar(String name, String kind, int freightWeight) {
        super(name, kind);
        this.freightWeight = freightWeight;
    }

    public int getFreightWeight() {
        return freightWeight;
    }

    public void setFreightWeight(int freightWeight) {
        this.freightWeight = freightWeight;
    }

    @Override
    public int carry() {
        return 0;
    }
}
