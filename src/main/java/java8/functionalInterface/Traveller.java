package java8.functionalInterface;

public class Traveller implements Movable{
    private String name;

    public Traveller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
// metoda abstrakcyjna w interfejsie, musimy zdefiniować w klasie
    @Override
    public String move() {
        return name + " is moving";
    }
// metoda
    @Override
    public String moveAlone(String reason) {
        return "whatever";
    }
}
