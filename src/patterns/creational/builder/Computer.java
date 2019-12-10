package patterns.creational.builder;

public class Computer {

    private int ram;
    private String hdd;
    private String graphicsCard;
    private String cpu;

    public Computer(int ram, String hdd, String graphicsCard, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.graphicsCard = graphicsCard;
        this.cpu = cpu;
    }

    @Override
    public String toString(){
        return "Computer:\nRAM - " + ram +
                        "\nHDD - " + hdd +
                        "\nGraphics Card - " + graphicsCard +
                        "\nCPU - " + cpu;
    }
}
