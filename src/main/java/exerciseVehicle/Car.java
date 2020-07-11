package exerciseVehicle;

public class Car extends Vehicle{

    String person;

    int cargo;

    public Car(String person, int cargo) {
        this.person = person;
        this.cargo = cargo;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
}
