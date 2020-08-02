package patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilderDemo {
    public static void main(String[] args) {
        House house1 = new House.HouseBuilder("concrete", "wood", "wood")
                .build();

        House house2 = new House.HouseBuilder("blocks", "max", "tile")
                .whitGarage("Wiata")
                .build();

        House house3 = new House.HouseBuilder("wylewka", "YTONG", "papa")
                .whitGarage("w bryle")
                .withGarden("oczko wodne")
                .build();

        House house4 = new House.HouseBuilder("pustaki", "max", "tile")
                .withGarden("plac zabaw")
                .build();

        List<House> houses = new ArrayList<>();

        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
        houses.stream()
                .forEach(x->System.out.println(x.getBasement() + ' ' + x.getWalls() + ' ' + x.getRoof() + ' ' +x.getGarage() + ' ' + x.getGarden()));

    }
}
