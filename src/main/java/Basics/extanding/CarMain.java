package Basics.extanding;

public class CarMain {
    public static void main(String[] args) {

        TruckCar truckCar = new TruckCar(500);
        truckCar.setName("MAN");
        truckCar.setColor("CZarny");
        System.out.println("Moje firmowe auto to " + truckCar.getName() + " w kolorze " + truckCar.getColor());

        FerrariCar ferrariCar = new FerrariCar(3,300,"B12");
        ferrariCar.setName("Ferrari");
        System.out.println("\nMoja fura to " + ferrariCar.getName() + " " + ferrariCar.getModelName() +
                " w kolorze "+ ferrariCar.getColor() + ". Przeyśpiesza w " + ferrariCar.getAccelerationTo100() +
                "s do 100km/h i jege prędkość max to " + ferrariCar.getTopSpeed() + "km/h");
    }
}
