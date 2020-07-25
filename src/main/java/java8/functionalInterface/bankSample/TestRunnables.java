package java8.functionalInterface.bankSample;

import java.util.LinkedList;
import java.util.List;

public class TestRunnables {
    public static void main(String[] args) {

        Runnable mailSender = new MailSender("PREZES");
        Runnable reportGen = new ReportGenertor("Outsource company");
        Runnable counter = new InterestCounter("Standart interest counter");

        ((MailSender) mailSender).addAddress(" księgowy ");
        ((MailSender) mailSender).addAddress(" informatyk ");
        ((MailSender) mailSender).addAddress(" recepcja ");
        ((MailSender) mailSender).addAddress(" administracja ");


        List<Runnable> runnables = new LinkedList<>();
        runnables.add(mailSender);
        runnables.add(reportGen);
        runnables.add(counter);

        for (Runnable runnable : runnables) {
            Thread thread = new Thread(runnable);
            thread.start();

        }
    }
}
