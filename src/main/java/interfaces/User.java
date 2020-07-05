package interfaces;

public class User implements Gaming, Coding {
    String game;

    public User(String game) {
        this.game = game;
    }

    @Override
    public void playGame() {
        System.out.println("Playing " + game);

    }

    @Override
    public void code(String language) {
        System.out.println("Coding in lanuage " + language);

    }
}
