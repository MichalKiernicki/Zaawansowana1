package patterns.creational.prototype;

import java.lang.ref.SoftReference;
import java.util.List;

public class PrototypeDemo {
    public static void main(String[] args) {
        //template
        ShoppingList shoppingList = new ShoppingList();

        //shopping today
        ShoppingList shoppingListToday = null;
        try {
            shoppingListToday = (ShoppingList) shoppingList.clone();
            List<String> todayShoppings = shoppingListToday.getShoppings();
            todayShoppings.add("piwo");
            todayShoppings.add("kiełbasa");
            shoppingListToday = new ShoppingList(todayShoppings);
            System.out.println("Zakupy na dziś");
            shoppingListToday.getShoppings()
                    .stream()
                    .forEach(System.out::println);
            System.out.println("temp listy zakupów");
            shoppingList.getShoppings()
                    .stream()
                    .forEach(System.out::println);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
