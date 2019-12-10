package patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                                  .setCPU("Intel i5")
                                  .setGraphicsCard("GTX 660")
                                  .setHDD("500 GB")
                                  .setRAM(8)
                                  .build();
        Computer computer1 = new ComputerBuilder()
                                 .setRAM(4)
                                 .setCPU("AMD E1")
                                 .build();
    }
}
