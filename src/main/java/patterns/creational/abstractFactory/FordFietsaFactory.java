package patterns.creational.abstractFactory;

public class FordFietsaFactory implements FordAbstractFactory {
    private String name;
    private String engine;
    private String addons;

    public FordFietsaFactory(String name, String engine, String addons) {
        this.name = name;
        this.engine = engine;
        this.addons = addons;
    }

    @Override
    public Ford createFord() {
        return new FordFiesta(name,engine,addons);
    }
}
