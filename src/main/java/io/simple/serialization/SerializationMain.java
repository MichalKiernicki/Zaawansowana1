package io.simple.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationMain {
    public static void main(String[] args) {

        //w ten sposób działa ale plik zostaje nadpisany i mamy info o jednym człowieku
        SerialPerson person = new SerialPerson(22,"Jan", "Kowalski", 24);
        SerialPerson person2 = new SerialPerson(23,"Michał", "Kot",33);

        //zapis pliku w postaci binarnej
        try {
            FileOutputStream fout = new FileOutputStream("SerializedPerson.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(person);
            oos.close();
            fout.close();

            FileOutputStream fout2 = new FileOutputStream("SerializedPerson.dat");
            ObjectOutputStream oos2 = new ObjectOutputStream(fout2);

            oos2.writeObject(person2);
            oos2.close();
            fout2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();;

        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
