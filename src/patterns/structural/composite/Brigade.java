package patterns.structural.composite;

public class Brigade implements ArmyComponent{

    private String name;
    private int numberOfSoldiers;

    public Brigade(String name, int numberOfSoldiers) {
        this.name = name;
        this.numberOfSoldiers = numberOfSoldiers;
    }

    @Override
    public int countSoldiers() {
        System.out.println(name + ": " + numberOfSoldiers + " soldiers");
        return numberOfSoldiers;
    }
}
