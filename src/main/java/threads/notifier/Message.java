package threads.notifier;

import static threads.ThreadColor.ANSI_BLUE;
import static threads.ThreadColor.ANSI_GREEN;

public class Message {
    private String content;
    private boolean empty;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(ANSI_GREEN + "Błąd odczytu");
            }
        }
        System.out.println(ANSI_GREEN + "Wiadomość odczytana więc moge przekazać kolejną");
        System.out.println(content);
        empty = true;
        notifyAll();//powiadom wszystkie inne wątki że skończyłem prace
                    //notify(); powiadom 1 wątek (losowy) że skonczyłem pracę
        return content;
    }
    public synchronized void write(String newContent) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(ANSI_BLUE + "Błąd zapisu");
            }
        }
        System.out.println(ANSI_BLUE + "Wiadomość zapisana więc mogę zapisać nową");
        System.out.println(ANSI_BLUE + newContent);
        empty = false;
        this.content = newContent;
        notifyAll();
    }
}
