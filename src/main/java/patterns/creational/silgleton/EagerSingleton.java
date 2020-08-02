package patterns.creational.silgleton;

public class EagerSingleton {
    public final int YEAR_2000 = 2000;
    private final int MINIMUM_SALARY = 2000;
    private static final EagerSingleton ES_INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println(" utworzony obiekt klasy " + EagerSingleton.class.getName());
    }

    public static EagerSingleton getInstance() {
        System.out.println("Eager singleton Jestem w getInstance()");
        return ES_INSTANCE;
    }

    public int getYear2000() {
        return YEAR_2000;
    }

}
