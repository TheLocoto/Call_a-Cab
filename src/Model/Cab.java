package Model;
import DataBase.CabDataBase;

import java.util.ArrayList;

/**
 * This class contains necessary data of a taxi.
 * Takes care of declaring, initializing, saving its values and
 * being able to obtain them or setting all its cab attributes.
 *
 * @author The Negasonic Teenage Warhead .
 */
public class Cab {

    public Driver driver;
    public ArrayList<TaxiTrip> taxiTrips;
    private String brand;
    private String model;
    private String licensePlate;
    private boolean availability;
    private CabDataBase cabDataBase;

    /**
     * This constructor method of Cab, initialize the attributes in base to all parameters.
     * Initializes the driver but makes it null, because we will assign a driver to it in another class.
     * Initializes a list of taxi trips, they are the trips that the taxi completes.
     *
     * @param brand         the name of the cab brand.
     * @param model         the name of the cab model.
     * @param licensePlate  the license Plate of the car.
     * @param availability  the state of accessibility the cab, if the cab is available,
     *                      can be assigned to a customer, otherwise no.
     */
    public Cab(String brand, String model, String licensePlate,boolean availability){
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.availability = availability;
        this.cabDataBase = new CabDataBase();
        this.driver = null;
        taxiTrips = new ArrayList<TaxiTrip>();
    }

    /**
     * this constructor method, is only for creating cab objects without defined attributes.
     */
    public Cab(){
    }

    /**
     * This method is used only to return the cab brand name.
     *
     * @return  the value of the brand attribute.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method is used only to return the cab model name.
     *
     * @return  the value of the taxi model name.
     */
    public String getModel() {
        return model;
    }

    /**
     * This method is used only to return cab license attribute.
     *
     * @return  the value of the cab licensePlate attribute.
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * This method returns if the cab is available or not with a boolean value.
     *
     * @return the availability attribute of the cab.
     */
    public boolean getAvailability(){
        return availability;
    }

    /**
     * This set method is used to set or change the availability of the cab.
     * this is only measured with a boolean value.
     *
     * @param availability The availability of the Car. If is available,
     *                     the cab will work, otherwise no.
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * This set method is used to set or change a driver to cab.
     *
     * @param driver The driver assigned of the Car.
     *               This attribute driver is only of the class Driver.
     */
    public void setDriver(Driver driver){
        this.driver = driver;
    }

    /**
     * This set method is used to add a cab in taxiTrip list.
     *
     * @param taxiTrip The taxiTrip that stored the cab in list.
     */
    public void addTaxiTrip(TaxiTrip taxiTrip){
        taxiTrips.add(taxiTrip);
    }


}
