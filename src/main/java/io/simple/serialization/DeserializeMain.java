package io.simple.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMain {
    public static void main(String[] args) {
        SerialPerson person = null;
        SerialPerson person2 = null;

        try {
            FileInputStream fis = new FileInputStream("SerializedPerson.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            person = (SerialPerson) ois.readObject();
            System.out.println(person.getAge() + " " + person.getSurname());
            System.out.println(person.toString());

            FileInputStream fis2 = new FileInputStream("SerializedPerson.dat");
            ObjectInputStream ois2 = new ObjectInputStream(fis2);

            person2 = (SerialPerson) ois2.readObject();
            System.out.println(person2.getAge() + " " + person2.getSurname());
            System.out.println(person2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
