package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Army implements ArmyComponent {

    private String name;
    private List<ArmyComponent> armyComponents;

    public Army(String name){
        this.name = name;
        armyComponents = new ArrayList<>();
    }

    public void addDivision(Division division){
        armyComponents.add(division);
    }

    @Override
    public int countSoldiers() {
        int soldierCount = -1;
        if(armyComponents.size() > 0){
            soldierCount = 0;
            for(ArmyComponent component : armyComponents){
                soldierCount += component.countSoldiers();
            }
            System.out.println(name + ": " + soldierCount + " soldiers");
        }
        return soldierCount;
    }
}
