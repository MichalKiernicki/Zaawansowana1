package threads.counter;

import static threads.ThreadColor.*;

public class Counter {
    private int i;

    public void performCountdown() {
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread1":
                color = ANSI_CYAN;
                break;
            case "Thread2":
                color = ANSI_PURPLE;
                break;
            default:
                color = ANSI_BLUE;
        }
        //synchronized (this) {
        // kod otoczony ma się wykonać w całości dla danego wątku
        // bez możliwości przerywania wykonania prze inny wątek
        // analogicznie dla metody zdeklarowanej jako synchronized
            doRealCounting(color);
        //}
    }

    private synchronized void doRealCounting(String color) {
        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + " i+ " + i);
        }
    }
}