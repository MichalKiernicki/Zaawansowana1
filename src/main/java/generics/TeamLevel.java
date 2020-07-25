package generics;

//enum czyli typ wyliczeniowy ze ściśle określoną, predefiniowaną listą wartości
//dodanie kolejnej wartości jest możliwe tylko wewnątrz enum, nie ma mozliwości
//dorobienia przez new()

public enum TeamLevel {

    // "AMATEUR" jest obiektem klasy enum (nie jest to zmienna)
    AMATEUR("stadion", 200, "A"),
    PROFFESIONAL("arena", 20000, "P");

    private String place;
    private int fans;
    private String abbreviation;

    TeamLevel(String place, int fans, String abbreviation) {//konstruktora z klasy enum nigdzie nie wywołamy
        this.place = place;                                 //zakaładamy go po to żęby zdefiniować kolejność w obiektach
        this.fans = fans;                                   //klasy enum w tym przypadku np "AMATEUR"
        this.abbreviation = abbreviation;
    }

    public String getPlace() {
        return place;
    }

    public int getFans() {
        return fans;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static TeamLevel getByAbbrevation(String abbrev){
        for (TeamLevel level : TeamLevel.values()) {
            if(abbrev.equalsIgnoreCase(level.abbreviation)) {
                return level;
            }

        }
        return null;
    }
}
