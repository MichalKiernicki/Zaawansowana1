package threads.notifier;

import java.util.Random;

import static threads.ThreadColor.ANSI_PURPLE;

public class Reader implements Runnable{

    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (String latestMessage = message.read(); latestMessage != "EOF"; latestMessage = message.read()) {
            System.out.println(ANSI_PURPLE + "Odczytano " + latestMessage);
            try {
                Thread.sleep(random.nextInt(6000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
