package solid.dip.fixed;

public class TaskServie {

    Repository repository;

    public TaskServie(Repository repository) {
        this.repository = repository;
    }

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task) {
        repository.deleteTask(task);
    }
}
