package threads.basics;

import static threads.ThreadColor.ANSI_BLUE;

public class OtherThread extends Thread{

   @Override
    public void run(){
       //tu dajemy kod do wywołania w osobnym wątku
       System.out.println(ANSI_BLUE + " Another thread in action");
       System.out.println(ANSI_BLUE + currentThread().getName());
       try {
           sleep(4000);
           System.out.println(ANSI_BLUE + "Enough sleeping, back to work!!");
       }catch (InterruptedException e) {
           System.out.println(ANSI_BLUE + "I couldn't sleep enough");
       }
    }
}
