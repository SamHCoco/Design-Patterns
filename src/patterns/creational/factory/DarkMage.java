package patterns.creational.factory;

public class DarkMage extends Enemy {

    public DarkMage(){
        super("Dark Mage");
    }

    @Override
    public void attack(){
        System.out.println("\nA " + getSpecies() + " attacks you with DARK LIGHTNING!\nYou lose 10 HP.\n");
    }
}
