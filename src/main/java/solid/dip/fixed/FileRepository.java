package solid.dip.fixed;

public class FileRepository implements Repository{

    @Override
    public void saveTask(String task) {
        System.out.println("Saving file " + task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Deleting file " + task);
    }
}
