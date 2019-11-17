package patterns.creational.factory;

public class Slime extends Enemy {

    public Slime(){
        super("Slime");
    }

    @Override
    public void attack(){
        System.out.println("\nA " + getSpecies() + " uses WEIRD LICK!\nYou lose 1 HP, but gain a friend.\n");
    }
}
