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
        driver = null;
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

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public void resetDriver(){
        this.driver=null;
    }

}
