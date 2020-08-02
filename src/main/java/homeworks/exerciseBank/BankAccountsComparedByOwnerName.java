package homeworks.exerciseBank;

import java.lang.reflect.Field;
import java.util.Comparator;

public class BankAccountsComparedByOwnerName implements Comparator<BankAccount> {

//    @Override
//    public int compare(Customer customer1, Customer customer2) {
//
//        if (!customer1.getName().equals(customer2.getName())) {
//
//        }
//        return customer1.getName().compareTo(customer2.getName());
//    }

    Class<?> customerClas;

    {
        try {
            customerClas = Class.forName("homeworks.exerciseBank.Customer");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    Field[] allFields = customerClas.getFields();
    Customer customer = (Customer) customerClas.newInstance();


    public BankAccountsComparedByOwnerName() throws IllegalAccessException, InstantiationException {
    }

    @Override
    public int compare(BankAccount bankAccount, BankAccount bankAccount1) {
        if (customer.getName().equals(customer.getName())) {

        }
        return customer.getName().compareTo(customer.getName());
    }
}

