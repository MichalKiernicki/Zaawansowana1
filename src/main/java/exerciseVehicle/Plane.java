package exerciseVehicle;

public class Plane extends Vehicle{

    String drive;

    int numberOfPassengers;

    public Plane(String drive, int numberOfPassengers) {
        this.drive = drive;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
