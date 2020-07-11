package basics;
//dziedziczenie przez słowo kluczowe extends
public class Polish extends Person{

    private boolean hasKDR;

    public Polish(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Polish(String name, String surname, int age, Address address, boolean hasKDR) {
        super(name, surname, age, address);
        this.hasKDR = hasKDR;
    }
}
