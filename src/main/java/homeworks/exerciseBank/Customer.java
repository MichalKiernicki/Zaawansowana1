package homeworks.exerciseBank;

import java.util.Scanner;

public class Customer {

    private String name;
    private String surname;
    private String pesel;
    private int customerNumber = 0;

    private String login;
    private String password;
    private Boolean userLogged = false;

    public Customer(String name, String surname, String pesel, int customerNumber) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.customerNumber = customerNumber;
    }

    public Customer(String login, String password) {
        this.login = login;
        this.password = password;
    }

    Boolean signIn(String login1, String password1) {
        if (this.login.equals(login1) && this.password.equals(password1)) {
            userLogged = true;
            return true;
        } else {
            return false;
        }
    }

    Boolean changePassword(String password2, String newPassowrd) {
        if (this.userLogged == true && this.password.equals(password2)) {
            this.password = newPassowrd;
            return true;
        } else {
            return false;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String toString() {
        return "Imię: " + name + ',' + " Nazwisko: " + surname
                + ',' + " pesel: " + pesel + ',' + " numer klienta: " + customerNumber;
    }
}
