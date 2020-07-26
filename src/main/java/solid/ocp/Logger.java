package solid.ocp;

public class Logger {

    private LogDestination destination;

    public Logger(LogDestination destination) {
        this.destination = destination;
    }

    public void log(String message) throws IllegalArgumentException {
        switch (destination) {
            case CONSOLE:
                System.out.println("Writing " + message + " to console!");
                break;
            case DB:
                System.out.println("Saving " + message + " to datebase table");
                break;
            case FILE:
                //...
            default:
                throw new IllegalArgumentException("Not supported logging type");
        }
    }
}
