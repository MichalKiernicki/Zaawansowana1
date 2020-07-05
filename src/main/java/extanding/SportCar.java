package extanding;

public class SportCar extends Car{

    private int accelerationTo100;
    private int topSpeed;


    public SportCar(int accelerationTo100, int topSpeed) {
        this.accelerationTo100 = accelerationTo100;
        this.topSpeed = topSpeed;

    }
    public int getAccelerationTo100() {
        return accelerationTo100;
    }
    public void setAccelerationTo100(int accelerationTo100) {
        this.accelerationTo100 = accelerationTo100;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }


}
