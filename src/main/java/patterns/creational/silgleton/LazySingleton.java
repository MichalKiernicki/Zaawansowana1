package patterns.creational.silgleton;

public class LazySingleton {
    public static LazySingleton LS_INSTANCE;

    private LazySingleton() {
        System.out.println("Lazy Singleton initialized " + LazySingleton.class.getName());
    }

    public static LazySingleton getInstance(){
        System.out.println("Lazy singleton getInstance() called");
        if(LS_INSTANCE == null) {
            LS_INSTANCE = new LazySingleton();
        }
        return LS_INSTANCE;
    }
}
