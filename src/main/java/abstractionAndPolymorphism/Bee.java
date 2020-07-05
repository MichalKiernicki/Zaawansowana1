package abstractionAndPolymorphism;

public class Bee extends Worm{

    @Override
    public void hibernate() {
        System.out.println("Winter time");

    }

    @Override
    public void move() {
        System.out.println("Bee is flying");

    }
}
