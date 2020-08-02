package solid.dip.fixed;

public class DatabaseRepository implements Repository {

    @Override
    public void saveTask(String task) {
        System.out.println("Saving task " + task + " table");
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Deleting taskt " + task + " table");
    }
}
