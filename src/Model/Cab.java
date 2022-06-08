package Model;
import java.util.ArrayList;

public class Cab {

    public Driver driver;
    public ArrayList<TaxiTrip> taxiTrips;
    private int licensePlate;
    private int fuelLevel;
    private boolean isAvailable;

    public Cab(int licensePlate, int fuelLevel, boolean isAvailable){
        this.licensePlate = licensePlate;
        this.fuelLevel = fuelLevel;
        this.isAvailable = isAvailable;
        this.driver = null;
        taxiTrips = new ArrayList<TaxiTrip>();
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

    public boolean getAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

}
