package patterns.structural.adapter;

public class AircraftAdapter implements IRaceCar {

    private Aircraft aircraft;

    public AircraftAdapter(Aircraft aircraft){
        this.aircraft = aircraft;
    }

    @Override
    public void turnSteeringWheel(){
        aircraft.turnControlStick();
    }

    @Override
    public void floorAccelerator(){
        aircraft.pushThrustLevers();
    }
}
