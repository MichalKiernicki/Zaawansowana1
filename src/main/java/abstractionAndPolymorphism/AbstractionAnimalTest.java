package abstractionAndPolymorphism;

public class AbstractionAnimalTest {
    public static void main(String[] args) {

        //Animal animal = new Animal() {} --- to nie zadziała bo nie można robić obiektów z klas abstrakcyjnych

        Bird bird = new Bird();
        bird.move();

        Fish fish = new Fish();
        fish.move();


        Penguin penguin = new Penguin();
        penguin.move();
    }
}
