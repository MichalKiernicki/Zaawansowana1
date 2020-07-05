package Basics;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;
    private final int ADULT_AGE = 18;//słowo kluczowe final które nie pozwala modyfikować zmiennej

    public Person(String name, String surname, int age,String city, String street, String country) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = new Address(city, street, country);
    }
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public boolean isAdult(){ return age >= ADULT_AGE ? true : false; } // uproszczona alternatywa dla "if else"

}

