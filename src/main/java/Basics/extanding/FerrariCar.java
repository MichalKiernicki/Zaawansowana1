package Basics.extanding;

public class FerrariCar extends SportCar {

    private String modelName;

    public FerrariCar(int accelerationTo100, int topSpeed, String modelName) {
        super(accelerationTo100, topSpeed);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override// nadpisywanie metody z innej klasy dla tej klasy
    public String getColor() {
        return "RED";
    }
}