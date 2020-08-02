package patterns.creational.silgleton;


//lazy singleton nie stosujemy do wielowątkowości

public class SingletonTest {
    public static void main(String[] args) {
        //najpierw , przy uruchomienu bezie utworzony obiekt klasy Eager singleton
        System.out.println("=====GRUBA KRECHA=====");

        EagerSingleton.getInstance();

        LazySingleton.getInstance();

        // wołanie innych metod na Singletonach

        EagerSingleton.getInstance().getYear2000();

        EagerSingleton localEagerSingleton = EagerSingleton.getInstance();
        localEagerSingleton.getYear2000();
    }
}
