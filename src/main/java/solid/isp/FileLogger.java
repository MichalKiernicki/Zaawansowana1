package solid.isp;

import java.util.Collection;
import java.util.Collections;

public class FileLogger implements Logger {
    @Override
    public void writeMessage(String message) {
        System.out.println("Writig " + message + " to file");
    }

    @Override
    public Collection<String> readMessages() {
        return Collections.EMPTY_LIST;
    }
}
