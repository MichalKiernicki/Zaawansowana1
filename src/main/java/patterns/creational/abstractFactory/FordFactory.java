package patterns.creational.abstractFactory;

public class FordFactory {
    public static Ford getFord(FordAbstractFactory factory) {
        return factory.createFord();
    }
}
