package java8.lambdas;

public class Samples {
    public static void main(String[] args) {

        //PRE JAVA 8
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Doing some stuff multithread");
            }
        });
        thread.start();

        //SINCE JAVA 8
        // () -> {}
        // (args) -> {work on args}
        Thread threadNew = new Thread(() -> {
            System.out.println("Doing another stuff multithread!!!");
        });
        threadNew.start();

        //LAMBDAS
        // (jakieś argumenty) -zero lub więcej, można podać typ ale nie koniecznie
        // -> operator pomiędzy lstą argumentów a wykonaniem
        // {jakaś akcja} - wykonywana akcja (metoda, proces)

        String argument1 = "aaa";
        String argument2 = "bbb";
        StringAdding adding = (arg1, arg2) -> {return argument1 + " " + argument2;};
        StringAdding addingWithTypes = (String arg1,String arg2) -> {return argument1 + " " + argument2;};


    }
}
