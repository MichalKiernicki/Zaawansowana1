package threads.basics;

import static threads.ThreadColor.ANSI_RED;

public class RunnableSample implements Runnable{// implementacja interfejs Runnable która jest bardziej elastyczna niż dziedziczenie

    @Override
    public void run() {
        System.out.println(ANSI_RED + "****Implementacja wątku Runnable****");
        System.out.println(ANSI_RED + "Runnable sample working as well!!");

    }
}
