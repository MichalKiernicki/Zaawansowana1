package solid.ocp.fixed;

public class Logger1Test {
    public static void main(String[] args) {

        //MessageLogger messageLogger = spring.getLogger();
        MessageLogger messageLogger = new ConsoleLogger();
        Logger logger = new Logger(messageLogger);
        try {
            logger.log("aaa");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //2 logowanie
        MessageLogger messageLogger1 = new DatabaseLogger();
        Logger anotherLogger = new Logger(messageLogger1);
        try {
            anotherLogger.log("bbb");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
