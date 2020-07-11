package exerciseVehicle;

public class Ship extends Vehicle{

    String seaBoat;

    String riverBoat;

    public Ship(String seaBoat, String riverBoat) {
        this.seaBoat = seaBoat;
        this.riverBoat = riverBoat;
    }

    public String getSeaBoat() {
        return seaBoat;
    }

    public void setSeaBoat(String seaBoat) {
        this.seaBoat = seaBoat;
    }

    public String getRiverBoat() {
        return riverBoat;
    }

    public void setRiverBoat(String riverBoat) {
        this.riverBoat = riverBoat;
    }
}
