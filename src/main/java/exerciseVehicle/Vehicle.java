//Zadanie domowe
//        Założyć klasę Vehicle z
//        polem przechowującym nazwę ( i metodą do jej zwracania)
//        Z klasy Vechicle nie może być możliwości tworzenia obiektów
//        Założyć klasy Car, Plane, Ship dziedziczące po Vehicle
//        W klasie Car dodać pole przechowujące informację : osobowy / towarowy
//        W klasie Plane dodać pole przechowujące informację o napędzie: śmigłowy, turbośmigłowy, odrzutowy
//        W klasie Ship dodać pole przechowujące informację czy statek rzeczny czy morski
//        Dodać inerfejs
//        Transport z metodą określającą miejsce startowe i docelowe podróży
//        Gdzie najlepiej go nałożyć? Jak coś to priv na Slacku :)
//        Dodać interfejsy :
//        Passenger (pasażerski) z metodą transport określającą liczbę pasażerów,
//        Freight (towarowy) z metodą carry określającą wagę towaru
//        Jakieś pomysły gdzie i jak je nałożyć? (Slack prv)
//        Dodać możliwość zaczytania danych dotyczących poszczególnych pojazdów z pliku
//        (może być jeden plik, może być więcej, poszczególne pola oddzielać | i założenie jest że wszystkie pola są wypełnione)
//        Dodać wyjątek rzucany przy dodawaniu samochodu jeśli liczba pasażerów > 70
//        Wyjątek może rozszerzać IllegalArgumentException chyba że ktoś znajdzie sensowniejszy
//        Sprawdzić powyższe w jakimś Main
//        Jak dacie radę to wystawić na GitHuba i dać mi namiary

package exerciseVehicle;

import io.simple.ReadWriteFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Vehicle implements Transport, Passenger {

    ReadWriteFile vehicleName;

    public ReadWriteFile getVehName() {
        return vehicleName;
    }

    public void setVehicleName(ReadWriteFile vehicleName) {
        this.vehicleName = vehicleName;
    }


    public static void main(String[] args) {

        ReadWriteFile reader1 = new ReadWriteFile();
        reader1.readWithBuffer("audi.txt");

        Car audi = new Car("Michal",600);
        audi.setVehicleName(reader1);
//        System.out.println(audi.getVehName());

        ReadWriteFile reader2 = new ReadWriteFile();
        reader1.readWithBuffer("man.txt");

        Car man = new Car("Jan",30000);
        man.setVehicleName(reader2);
//        System.out.println("Na imię mam "+ man.person + " i jeżdżę samochodem dostawczym " + man.getVehName());
    }
    public void carReader(String filename) {
        String input;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            while ((input = reader.readLine()) != null)
                System.out.println(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void transport(int manyPeople) {

    }

    @Override
    public void start(String startPosition) {

    }

    @Override
    public void end(String endPosition) {

    }
}
