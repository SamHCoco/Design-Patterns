package patterns.structural.composite;

public class Main {

    public static void main(String[] args) {
        Army army = new Army("Army 1");

        Division division = new Division("Division 1");

        ArmyComponent brigade1 = new Brigade("Brigade 1A", 250);
        ArmyComponent brigade2 = new Brigade("Brigade 1B", 500);

        division.addBrigade(brigade1);
        division.addBrigade(brigade2);

        army.addDivision(division);

        army.countSoldiers();
    }
}
