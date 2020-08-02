package patterns.creational.abstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {

        Ford fiesta1 = FordFactory.getFord(new FordFietsaFactory("Fiesta 1.1 2022", "1.0 EcoBoost", "winter pack"));
        Ford fiesta2 = FordFactory.getFord(new FordFietsaFactory("Fiesta 0.9 2021", "0.9", "Titanium"));
        Ford focus1 = FordFactory.getFord(new FordFocusFactory("Focus 1.6 2020", "1.6 EcoBoost", "winter pack, alu wheels"));

        System.out.println(fiesta1.getName() + ' ' + fiesta1.getAddons());
        System.out.println(fiesta2.getName() + ' ' + fiesta2.getAddons());
        System.out.println(focus1.getName() + ' ' + focus1.getAddons());

    }
}
