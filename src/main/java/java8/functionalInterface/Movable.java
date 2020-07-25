package java8.functionalInterface;

// Java 8 wprowadziła interfejsy funkcyjne
// Określlają one że jest tylko jedna metoda abstrakcyjna w interfejsie
// Tą jedną metode należy obsłużyć czyli zaimplementować (inne można ale nie trzeba)

@FunctionalInterface
public interface Movable {

    public abstract String move();

    default String moveWith(String partner) {
        return move() + " " + partner;
    }
    default String moveAlone (String reason) {
        return "Travelling alone because of" + reason;
    }
}
