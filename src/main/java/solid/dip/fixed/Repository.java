package solid.dip.fixed;

public interface Repository {

    void saveTask(String task);

    void deleteTask(String task);
}
