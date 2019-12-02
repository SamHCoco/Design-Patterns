package patterns.structural.adapter;

public class Aircraft {

    public void pushThrustLevers(){
        System.out.println("Aircraft thrust levers pushed: aircraft accelerates to 200 mph.");
    }

    public void turnControlStick(){
        System.out.println("Aircraft control stick turned left.");
    }
}
