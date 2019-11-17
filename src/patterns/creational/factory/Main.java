package patterns.creational.factory;

import patterns.creational.factory.Enemy;
import patterns.creational.factory.EnemyFactory;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Random random = new Random();
	    String input;
	    Scanner scanner = new Scanner(System.in);

        EnemyFactory enemyFactory = new EnemyFactory();
	    while(true){
	        System.out.println("Step forward into the dungeon? y/n");

	        if(scanner.hasNext()){
	            input = scanner.next();
	            if(input.equals("y")){
                    Enemy enemy =  enemyFactory.createEnemy(random.nextInt(2));
                    enemy.attack();
                } else {
	                break;
                }
            }
        }
    }
}
