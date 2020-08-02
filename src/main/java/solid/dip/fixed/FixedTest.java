package solid.dip.fixed;

public class FixedTest {

    public static void main(String[] args) {

        Repository repository = new FileRepository();
        TaskServie servie = new TaskServie(repository);

        servie.addTask("NewFile.txt");
        servie.removeTask("OtherFile.txt");

        //==========

        repository = new DatabaseRepository();
        servie = new TaskServie(repository);
        servie.addTask("Customers");
        servie.removeTask("Cars");

        //==========

        Repository dbRepository = new DatabaseRepository();
        TaskServie forDBService = new TaskServie(dbRepository);
        forDBService.addTask("Customers");
        forDBService.removeTask("Cars");
    }
}
