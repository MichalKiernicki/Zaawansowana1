package patterns.creational.factory;

public class MacBookFactory {

    public static MacBook getMacBook(String type, String name, String disc, int memory) {
        if(type.equalsIgnoreCase("Air")) {
            return new MacBookAir(name,disc,memory);
        }else if (type.equals("Pro")) {
            return new MacBookPro(name,disc,memory);
        }
        return null;
    }
}
