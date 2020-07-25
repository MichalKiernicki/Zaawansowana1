package threads.basics;

import static threads.ThreadColor.*;





        public class MainThread {

            public static void main(String[] args) {

                //kolejność wykonywania wątków jest nieokreślona
                //na x wywołań możemy dostać x różnych kolejnośći logu na konsoli
                System.out.println(ANSI_PURPLE + "Main thread in action!!");
                OtherThread otherThread = new OtherThread();
                //do uruchomienia jest potrzebna metoda start


                otherThread.setName("****Nowy zajefajny osobny wątek****");

                //otherThread.run();
                otherThread.start();

                Thread runnableSample = new Thread(new RunnableSample());
                runnableSample.start();

                //wątek w klasie anonimowej jeżeli chcemy tylko w tym miejscu i tylko raz
                //do uruchonienia jednorazowego

                new Thread() {
                    public void run() {
                        System.out.println(ANSI_GREEN + "Anonymous class in action too!!");
                    }
                }.start();

                //wątek na nadpisanej definicji

//        runnableSample = new Thread(new RunnableSample() {
//            @Override
//            public void run() {
//                System.out.println(ANSI_RED + "Overwritten RunnablSample working!!");
//            }
//        });
//        runnableSample.start();
//        System.out.println(ANSI_PURPLE + "End of Main!!");

                //łączenie wątków metodą .join -- robimy to jeśli chcemy połączyć jakieś wątki które kożystają z siebie nawzajem
                // np jeden wątek pobiera dane z drugiego

                runnableSample = new Thread(new RunnableSample() {
                    @Override
                    public void run() {
                        System.out.println(ANSI_RED + "Overwritten RunnablSample working!!");
                        try {
                            otherThread.join();
                            System.out.println(ANSI_RED + " Other thread finished so I work again!!!");
                        } catch (InterruptedException e) {
                            System.out.println(ANSI_RED + "Other thread interrupted");
                        }
                    }
                });
                runnableSample.start();
                otherThread.interrupt(); // przerwanie sleep w wątku otherThread
                System.out.println(ANSI_PURPLE + "End of Main!!");

            }
        }
