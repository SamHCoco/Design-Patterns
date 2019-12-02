package patterns.structural.adapter;

public class RaceCar implements IRaceCar {

    public void floorAccelerator(){
        System.out.println("Accelerator peddle pressed: car accelerates to 50 mph.");
    }

    public void turnSteeringWheel(){
        System.out.println("Car wheel turned: car turns.");
    }
}
