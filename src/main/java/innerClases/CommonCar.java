package innerClases;

public class CommonCar {
    private String name;

    public String getName() {
        return name;
    }

    class Engine {
        public  String getCarNameFromEngine(){
            //klasa wewnęrzna ma dostęp do wszystkich pól klasy zewnętrznej i wszystkich metod
            return name + getName();
        }
    }
}
