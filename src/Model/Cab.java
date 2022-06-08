package Model;
import java.util.ArrayList;

public class Cab {

    public Driver driver;
    public ArrayList<TaxiTrips> taxiTrips;
    private int licensePlate;
    private int fuelLevel;
    private boolean availability;

    public Cab(int licensePlate, int fuelLevel, boolean availability){
        this.licensePlate = licensePlate;
        this.fuelLevel = fuelLevel;
        this.availability = availability;

        driver = new Driver();
        taxiTrips = new ArrayList<TaxiTrips>();
    }

    public int getLicensePlate() {
        return licensePlate;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public boolean getAvailability(){
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}
