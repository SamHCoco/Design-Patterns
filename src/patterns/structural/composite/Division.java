package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Division implements ArmyComponent{

    private String name;
    private List<ArmyComponent> components;

    public Division(String name){
        this.name = name;
        components = new ArrayList<>();
    }

    public void addBrigade(ArmyComponent brigade){
        components.add(brigade);
    }

    @Override
    public int countSoldiers() {
        int result = -1;
        if(components.size() != 0){
            result = 0;
            for(ArmyComponent component : components){
                result += component.countSoldiers();
            }
            System.out.println("Brigade " + name + " has " + result + " soldiers");
        }
        return result;
    }
}
