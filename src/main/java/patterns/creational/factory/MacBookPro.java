package patterns.creational.factory;

public class MacBookPro extends MacBook {
    private String name;
    private String disc;
    private int memory;

    public MacBookPro(String name, String disc, int memory) {
        System.out.println("Mac Pro created");
        this.name = name;
        this.disc = disc;
        this.memory = memory;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDisc() {
        return disc;
    }

    @Override
    public int getMemory() {
        return memory;
    }
}
