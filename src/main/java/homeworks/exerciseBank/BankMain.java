package homeworks.exerciseBank;

import java8.streams.HumanComparedByNameAndAge;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BankMain extends Bank {
    public static void main(String[] args) {

        Customer michal = new Customer("Michał", "Klocek","89101300000", 001);
        Customer pawel = new Customer("Paweł", "Kaktus","97122100000",002);
        Customer slawomir = new Customer("Sławomir", "Frycz","78122300000",003);

        customerList.add(michal);
        customerList.add(pawel);
        customerList.add(slawomir);

        System.out.println("\nLista naszych klientów\n");
        customerList.stream()
                .forEach(System.out::println);

        bankAccountList.add(new BankAccount(michal,TypeOfBankAccounts.ROZLICZENIOWE,"500"));
        bankAccountList.add(new BankAccount(michal,TypeOfBankAccounts.WALUTOWE,"20000"));
        bankAccountList.add(new BankAccount(pawel,TypeOfBankAccounts.OSZCZEDNOSCIOWE,"12000"));
        bankAccountList.add(new BankAccount(slawomir,TypeOfBankAccounts.ROZLICZENIOWE,"2000"));
        bankAccountList.add(new BankAccount(michal,TypeOfBankAccounts.POWIERNICZE,"25"));

        System.out.println("\nKonta naszych klientów\n");
        bankAccountList.stream()
                .forEach(System.out::println);
//        try {
//            Stream.of(bankAccountList)
//                    .flatMap(str -> str.stream())
//                    .sorted(new BankAccountsComparedByOwnerName())
//                    .collect(Collectors.toList())
//                    .forEach(System.out::println);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }

    }
}
