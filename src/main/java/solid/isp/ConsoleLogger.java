package solid.isp;

import java.util.Collection;

public class ConsoleLogger implements Logger {
    @Override
    public void writeMessage(String message) {
        System.out.println("Adding " + message + " to console");
    }

    @Override
    public Collection<String> readMessages() {
        throw new UnsupportedOperationException();
    }
}
