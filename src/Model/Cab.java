package Model;
import java.util.ArrayList;

/**
 * This class contains necessary data of a taxi.
 *
 * @autor Group.
 *
 */
public class Cab {

    public Driver driver;
    public ArrayList<TaxiTrip> taxiTrips;
    private String brand;
    private String model;
    private String licensePlate;
    private boolean availability;
    private int fuelLevel;

    /**
     * This is the constructor method of the Cab class.
     *
     * Initializes the driver but makes it null, because we will assign a driver to it in another class.
     * Initializes a list of taxi trips, they are the trips that the taxi completes.
     *
     * @param brand this is the name of the car.
     * @param model this is the model of the car.
     * @param licensePlate this is the license Plate of the car.
     * @param fuelLevel this is the fuel Level of the Car.
     * @param availability indicates the status of the taxi.
     */
    public Cab(String brand, String model, String licensePlate, int fuelLevel, boolean availability){
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.fuelLevel = fuelLevel;
        this.availability = availability;

        this.driver = null;
        taxiTrips = new ArrayList<TaxiTrip>();
    }

    /**
     * This is a getter method for the brand attribute.
     *
     * @return the brand attribute.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This is a getter method for the model attribute.
     *
     * @return the model attribute.
     */
    public String getModel() {
        return model;
    }

    /**
     * This is a getter method for the licensePlate attribute.
     *
     * @return the licensePlate attribute.
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * This is a getter method for the fuelLevel attribute.
     *
     * @return the fuelLevel attribute.
     */
    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * This is a setter method for the fuelLevel attribute.
     *
     * @param fuelLevel this is the fuel Level of the Car.
     */
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    /**
     * This is a getter method for the availability attribute.
     *
     * @return availability attribute.
     */
    public boolean getAvailability(){
        return availability;
    }

    /**
     * This is a setter method for the availability attribute.
     *
     * @param availability this is the availability of the Car.
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public void resetDriver(){
        this.driver=null;
    }

}
