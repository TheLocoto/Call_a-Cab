/**
 * This class centralizes all classes used in the offer of cab service.
 *
 * This class stores our cabs and drivers list in real life and has logic to assign a cab to a user that need it.
 *
 * @author JuanPabloA
 */
package Model;

import DataBase.CabDataBase;
import DataBase.DriverDataBase;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class contains necessary data for management tha cab central.
 * This class manages everything based on lists and instances of the other classes,
 * is also responsible for assigning a passenger to cab, and know if the cab is available.
 * <p>
 * All lists save objects of a specific class type.
 * With this we manage more easily
 *
 * @autor The Negasonic Teenage Warhead
 */
public class CabsCentral {
    private ArrayList<Cab> cabsList;
    private ArrayList<Driver> driversList;

    private ArrayList<Driver> driverRecord;
    private ArrayList<Cab> cabRecord;
    private ArrayList<TaxiTrip> taxiTripsRecord;

    private CabDataBase cabDataBase = new CabDataBase();
    private DriverDataBase driverDataBase = new DriverDataBase();

    /**
     * This method constructor is used for get the cabs, drivers and manage them.
     * All attributes cabsList and driversList are initialized based on the arguments
     * received in the parameters.
     * <p>
     * The taxiTripsRecord,cabRecord and driverRecord are for the registration
     * of each trip, cab and driver.
     *
     * @param cabsList         the cabs list of cab central management.
     *                         Can only be Cab type stored objects.
     * @param driversList      the drivers list of cab central management.
     *                         Can only be Driver type stored objects.
     */
    public CabsCentral(ArrayList<Cab> cabsList, ArrayList<Driver> driversList) {
        this.cabsList = cabsList;
        this.driversList = driversList;
        this.taxiTripsRecord = new ArrayList<>();
        this.cabRecord = new ArrayList<>();
        this.driverRecord = new ArrayList<>();
    }

    /**
     * This second method constructor is used for registration of trip, cab and driver.
     * The taxiTripsRecord,cabRecord and driverRecord are for the registration
     * of each trip, cab and driver.
     */
    public CabsCentral(){
        this.taxiTripsRecord = new ArrayList<>();
        this.cabRecord = new ArrayList<>();
        this.driverRecord = new ArrayList<>();
    }

    /**
     * This method constructor is used to verify and send a taxi to a customer.
     * This check if cab is availability or not for assign to a client, otherwise
     * it does not assign it to anyone.
     * <p>
     * the null is to know that the taxi has no one assigned and in case you are not busy,
     * set the availability of the driver and the taxi in false.
     *
     * @param taxiTrip         the cabs list of cab central management.
     *                         Can only be Cab type stored objects.
     * @return the cab state. whether it is with passenger or not.
     */
    public Cab sendCabToClient(TaxiTrip taxiTrip){
        Cab cab = getCabAvailable();
        Driver driver = getRandomDriverAvailable();
        if(cab!=null&&driver!=null){
            cab.setDriver(driver);
            driver.setAvailability(false);
            cab.setAvailability(false);
            cab.addTaxiTrip(taxiTrip);

            addTaxiTripRecord(taxiTrip);
            addCabInCabRecord(cab);
            addDriverInDriverRecord(driver);
        }else {
            setFreeAnyBusyCab();
            cab = null;
        }
        return cab;
    }

    /**
     * This method is used only to return if cab is available or not.
     * This method verify with a list tour of all cabs.
     *
     * @return  the cabFound if cab is available or not.
     */
    private Cab getCabAvailable() {
        Cab cabFound = null;
        for (Cab cab : cabsList) {
            if (cab.getAvailability() && cab.driver == null) {
                cabFound = cab;
                break;
            }
        }
        return cabFound;
    }

    /**
     * This method is used to return if driver the list of available drivers.
     * This method verify with a list tour of all driversList for see whether or no to put it in.
     *
     * @return  the list of available drivers. With this we ensure only to get
     *          the available drivers.
     *
     */
    public ArrayList<Driver> getDriversAvailableList(){
        ArrayList<Driver> driversAvailableList = new ArrayList<>();
        for(Driver driver:driversList){
            if(driver.isAvailable()) driversAvailableList.add(driver);
        }
        return driversAvailableList;
    }

    /**
     * This method is used to get a random driver available.
     *
     * @return  the random driver available.
     */
    private Driver getRandomDriverAvailable() {
        ArrayList<Driver> driversAvailableList = getDriversAvailableList();
        Driver driver = null;
        if(driversAvailableList.size()!=0)
            driver = driversAvailableList.get((int) (Math.random() * driversAvailableList.size()));
        return driver;
    }

    /**
     * This set method is used to set free, any cab busy.
     * this method checks through a route on the list of taxis, and if he’s not busy,
     * but if there’s a driver, then he sets the cab free again.
     */
    private void setFreeAnyBusyCab() {
        for (Cab cab:cabsList){
            if(!cab.getAvailability()&&cab.driver!=null){
                cab.setAvailability(true);
                cab.driver.setAvailability(true);
                cab.driver=null;////
                break;
            }
        }
    }

    /**
     * This set method is used only for setting Cabs list.
     *
     * @param cabsList the cabs list, available or not.
     */
    public void setCabsList(ArrayList<Cab> cabsList){
        this.cabsList = cabsList;
    }

    /**
     * This method returns drivers list, whether they are available or not.
     *
     * @return the  drivers list, whether they are available or not.
     */
    public ArrayList<Driver> getDriversList() {
        return driversList;
    }

    /**
     * This set method is used only for setting drivers list.
     *
     * @param driversList the drivers list, available or not.
     */
    public void setDriversList(ArrayList<Driver> driversList){ this.driversList=driversList;}

    /**
     * This method generate Cab list in based to database of list cabs.
     */
    public void generateCabList(){
        cabDataBase.generateCabList();
        setCabsList(cabDataBase.getCabList());
    }

    /**
     * This method generate Drivers list in based on the drivers list database.
     */
    public void generateDriverList(){
        driverDataBase.generateDriverList();
        setDriversList(driverDataBase.getDriverList());
    }

    /**
     * This method returns the driver record or history.
     *
     * @return  the driver record or history.
     */
    public ArrayList<Driver> getDriverRecord() {
        return driverRecord;
    }

    public void setDriverRecord(ArrayList<Driver> driverRecord) {
        this.driverRecord = driverRecord;
    }

    /**
     * This method returns the cab record or history.
     *
     * @return  the cab record or history.
     */
    public ArrayList<Cab> getCabRecord() {
        return cabRecord;
    }

    public void setCabRecord(ArrayList<Cab> cabRecord) {
        this.cabRecord = cabRecord;
    }

    /**
     * This method returns taxi trips record or history.
     * this method can only return an attribute of the taxi trip class.
     *
     * @return  the taxi trips record or history.
     */
    public ArrayList<TaxiTrip> getTaxiTripsRecord() {
        return taxiTripsRecord;
    }

    public void setTaxiTripsRecord(ArrayList<TaxiTrip> taxiTripsRecord) {
        this.taxiTripsRecord = taxiTripsRecord;
    }

    /**
     * This method adds a driver in the driver record.
     *
     * @param driver    the driver in the driver record.
     */
    public void addDriverInDriverRecord(Driver driver){driverRecord.add(driver);}

    /**
     * This method adds a cab in the cab record.
     *
     * @param cab       the cab in the cab record.
     */
    public void addCabInCabRecord(Cab cab){cabRecord.add(cab);}

    /**
     * This method adds a taxi trip in the taxi trips record.
     *
     * @param taxiTrip    the taxi trip in the taxi trips record.
     */
    public void addTaxiTripRecord(TaxiTrip taxiTrip){
        TaxiTrip newTaxiTrip = new TaxiTrip(taxiTrip.getPassenger(), taxiTrip.getAddress(), taxiTrip.getDestiny(),
                taxiTrip.getCost());
        taxiTripsRecord.add(newTaxiTrip);}

}
