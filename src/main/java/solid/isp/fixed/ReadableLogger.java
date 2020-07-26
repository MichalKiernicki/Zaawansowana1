package solid.isp.fixed;

import java.util.Collection;

public interface ReadableLogger extends Logger {

    Collection<String> readMessages();
}
