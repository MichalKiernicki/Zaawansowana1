package threads.notifier;

import java.util.Random;

public class Writer implements Runnable{

    private Message message;
    private String[] messegesToWrite = {"Linia 1", "Linia 2", "Linia 3"};

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();

        for(int i = 0; i < messegesToWrite.length; i++) {
            message.write(messegesToWrite[i]);
            try {
                Thread.sleep(random.nextInt(4000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.write("EOF");
    }
}
