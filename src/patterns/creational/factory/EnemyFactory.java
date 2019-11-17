package patterns.creational.factory;

public class EnemyFactory {

    public Enemy createEnemy(int choice){
        switch(choice){
            case 0:
                return new DarkMage();
            case 1:
                return new Slime();
            default:
                return null;
        }
    }
}
