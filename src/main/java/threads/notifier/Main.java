package threads.notifier;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();

        (new Thread(new Writer(message))).start(); // anonimowe wywołanie wątku

        Thread readThred = new Thread(new Reader(message)); //alternatywny zapis tego co powyrzej ale do tego mozna sie
        readThred.start();                                  // jeszcze odwołać bo ma swoją nazwę
    }
}
