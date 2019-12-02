package patterns.structural.adapter;

public class Main {

    public static void main(String[] args) {
        // Object adapter illustration: operating aircraft with interface (methods) used for a car.
        RaceCar car = new RaceCar();
        IRaceCar aircraftAdapter = new AircraftAdapter(new Aircraft());

        car.floorAccelerator();
        aircraftAdapter.floorAccelerator();

        System.out.print("\n");

        car.turnSteeringWheel();
        aircraftAdapter.turnSteeringWheel();
    }
}
