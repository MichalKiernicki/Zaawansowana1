package exceptions;

public class TryCatchSample {
    public  void sleepThread(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Blad w systemie");
            e.printStackTrace();
        }
    }
}
