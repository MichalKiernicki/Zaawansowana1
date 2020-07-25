package java8.functionalInterface.bankSample;

import java.util.ArrayList;
import java.util.List;

public class MailSender implements Runnable{
    private String senderName;
    private List<String> adresses;

    public MailSender(String senderName) {
        this.senderName = senderName;
        adresses = new ArrayList<>();
    }
    public void addAddress(String address){
        adresses.add(address);

    }

    @Override
    public void run() {
        System.out.println("Start sending mails!");
        for (String adress : adresses) {
            System.out.println(senderName + ": Sending mail to " + adress);

        }
    }
}
