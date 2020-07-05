package abstractionAndPolymorphism;

public class PolymorphysmAnimalTest {
    public static void main(String[] args) {

        Bee bee = new Bee();
        bee.move();

        Penguin penguin = new Penguin();
        penguin.move();

        //polimorfizm w praktyce
        Animal animal = new Bee();
        animal.move();
        //wywoływanie moetody specyficznej dla klasy Bee
        //wymaga tzw. rzutowania
        ((Bee) animal).hibernate();

        Animal animal2 = new Penguin();
        animal2.move();


        Animal[] animals;
    }
}
