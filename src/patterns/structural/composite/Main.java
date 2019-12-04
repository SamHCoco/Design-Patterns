package patterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        Division div1 = new Division("Division 1");

        ArmyComponent brig1 = new Brigade("Storm Brigade", 250);
        ArmyComponent brig2 = new Brigade("Shock Brigade", 500);

        div1.addBrigade(brig1);
        div1.addBrigade(brig2);

        div1.countSoldiers();
    }
}
