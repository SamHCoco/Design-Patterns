package patterns.creational.builder;

public class ComputerBuilder {

    private int ram;
    private String hdd;
    private String graphicsCard;
    private String cpu;

    public ComputerBuilder setCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setRAM(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public ComputerBuilder setHDD(String hdd) {
        this.hdd = hdd;
        return this;
    }

    public Computer build(){
        Computer computer = new Computer(ram, hdd, graphicsCard, cpu);
        System.out.println(computer);
        return computer;
    }
}
