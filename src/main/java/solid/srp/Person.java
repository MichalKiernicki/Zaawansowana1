package solid.srp;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //metoda sprawdzająca od kiedy można dostać prawo jazzdy
    //łamie srp bo zmiana logiki jest drugim powodem zmiany klasy
    //odmiennym od np dołożenia kolejnego pola
    public boolean canGetDrivingLicense() {
        return age >= 18;
    }
}
