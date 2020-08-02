package patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList implements Cloneable{
    private List<String> shoppings;

    public ShoppingList() {
        shoppings = new ArrayList<>();
        shoppings.add("ser");
        shoppings.add("chlep");
        shoppings.add("pomidor");
        shoppings.add("masło");
    }

    public ShoppingList(List<String> shoppings) {
        this.shoppings = shoppings;
    }

    public List<String> getShoppings() {
        return shoppings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempShopings = new ArrayList<>();
        for (String shopping : this.shoppings) {
            tempShopings.add(shopping);

        }
        return new ShoppingList(tempShopings);
    }
}
