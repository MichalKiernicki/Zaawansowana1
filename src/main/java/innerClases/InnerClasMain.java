package innerClases;

public class InnerClasMain {
    public static void main(String[] args) {

        //najpierw obiekt zewnętrzny
        CommonCar commonCar = new CommonCar();

        //potem na nim wołamy new dla obiektu klasy wewnętrznej
        CommonCar.Engine engine = commonCar.new Engine();
    }
}
