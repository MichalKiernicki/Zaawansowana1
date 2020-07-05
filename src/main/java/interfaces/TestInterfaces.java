package interfaces;

public class TestInterfaces {
    public static void main(String[] args) {

        User user = new User("Witcher 3 Wild Hunt");
        user.playGame();
        user.code("C#");

        Coding coder = new User("RDR2");
        coder.code("JAVA");
        ((User)coder).playGame();
    }
}
