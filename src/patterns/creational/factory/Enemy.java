package patterns.creational.factory;

public class Enemy {

    private String species;

    public Enemy(String species){
        this.species = species;
    }

    public String getSpecies(){
        return species;
    }

    public void attack(){
        System.out.println(species + " attacks you!");
    }
}
