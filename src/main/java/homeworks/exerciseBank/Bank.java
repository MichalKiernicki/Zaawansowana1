package homeworks.exerciseBank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String nameOFBank;

    static List<Customer> customerList = new ArrayList<>();
    static List<BankAccount> bankAccountList = new ArrayList<>();

    public String getNameOFBank() {
        return nameOFBank;
    }
}
    