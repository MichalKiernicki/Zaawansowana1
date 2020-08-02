package patterns.structual.adapter;

public class Test {
    public static void main(String[] args) {
        AmericanMovable jeep = new Jeep("Renegade",145);

        Volvo volvo = new Volvo("V50", 220);

        System.out.println("Jeep" + ((Jeep) jeep).getName() + " " +jeep.getSpeed());
        System.out.println("Jeep" + ((Jeep) jeep).getName() + " " +((Jeep)jeep).getSpeedKMH());

        System.out.println("Volvo " + volvo.getName() + " " + volvo.getSpeed());
    }
}
