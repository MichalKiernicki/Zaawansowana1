package solid.isp.fixed;

public class ConsoleLogger implements Logger {

    @Override
    public void writeMessage(String message) {
        System.out.println("Write new message " + message + " to console");
    }
}
