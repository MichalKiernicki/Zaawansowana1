package interfaces;

public interface Gaming {
    //definicje metod w interfejsie domyślnie są public abstract
    void playGame();

    default boolean isWinner (int pionts){
        return true;
    }
}
