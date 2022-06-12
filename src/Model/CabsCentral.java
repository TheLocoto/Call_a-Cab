/**
 * This class centralizes all classes used in the offer of cab service.
 *
 * This class manipulates our cabs and drivers list in real life and has logic to assign a cab to a user that need it.
 *
 */
package Model;

import DataBase.CabDataBase;
import DataBase.DriverDataBase;
import java.util.ArrayList;

public class CabsCentral {
    private ArrayList<Cab> cabsList;
    private ArrayList<Driver> driversList;
    private ArrayList<Driver> driverRecord;
    private ArrayList<Cab> cabRecord;
    private ArrayList<TaxiTrip> taxiTripsRecord;
    private CabDataBase cabDataBase = new CabDataBase();
    private DriverDataBase driverDataBase = new DriverDataBase();

    public CabsCentral(){
        this.taxiTripsRecord = new ArrayList<>();
        this.cabRecord = new ArrayList<>();
        this.driverRecord = new ArrayList<>();
    }

    /**
     * This is the main method to send a taxi cap to client.
     *
     * @param taxiTrip receives the taxi trip that is asking for a cab.
     * @return a free cab or a null cab if it does not exists free cabs.
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
     * Method to get an available cab from our cabs list.
     *
     * @return free cab or null cab if there isn't available cabs.
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
     * Method to create a list of available drivers.
     *
     * @return the list of available drivers.
     */
    public ArrayList<Driver> getDriversAvailableList(){
        ArrayList<Driver> driversAvailableList = new ArrayList<>();
        for(Driver driver:driversList){
            if(driver.isAvailable()) driversAvailableList.add(driver);
        }
        return driversAvailableList;
    }

    /**
     *
     * Method to get any random available driver from list of available drivers.
     *
     * @return an available driver or a null driver if there isn't.
     */
    private Driver getRandomDriverAvailable() {
        ArrayList<Driver> driversAvailableList = getDriversAvailableList();
        Driver driver = null;
        if(driversAvailableList.size()!=0)
            driver = driversAvailableList.get((int) (Math.random() * driversAvailableList.size()));
        return driver;
    }

    /**
     * Method to set free any busy cab, simulating that it arrives to his destiny.
     */
    private void setFreeAnyBusyCab() {
        for (Cab cab:cabsList){
            if(!cab.getAvailability()&&cab.driver!=null){
                cab.setAvailability(true);
                cab.driver.setAvailability(true);
                cab.driver=null;
                break;
            }
        }
    }

    /**
     * Method to initializes the cabs list with a database of cabs
     *
     * @param cabsList is the database of cabs.
     */
    public void setCabsList(ArrayList<Cab> cabsList){
        this.cabsList = cabsList;
    }

    /**
     * Method to get the cabs list.
     *
     * @return the cabs list.
     */
    public ArrayList<Driver> getDriversList() {
        return driversList;
    }
    /**
     * Method to initializes the drivers list with a database of drivers
     *
     * @param driversList is the database of drivers.
     */
    public void setDriversList(ArrayList<Driver> driversList){ this.driversList=driversList;}

    /**
     * Generate the database of cabs.
     */
    public void generateCabList(){
        cabDataBase.generateCabList();
        setCabsList(cabDataBase.getCabList());
    }
    /**
     * Generate the database of drivers.
     */
    public void generateDriverList(){
        driverDataBase.generateDriverList();
        setDriversList(driverDataBase.getDriverList());
    }

    /**
     * Method to get the drivers stored list.
     *
     * @return the drivers stored list.
     */
    public ArrayList<Driver> getDriverRecord() {
        return driverRecord;
    }

    /**
     * Method to get the cabs stored list.
     *
     * @return the cabs stored list.
     */
    public ArrayList<Cab> getCabRecord() {
        return cabRecord;
    }

    /**
     * Method to get the taxi stored trips.
     *
     * @return the taxi stored trips.
     */
    public ArrayList<TaxiTrip> getTaxiTripsRecord() {
        return taxiTripsRecord;
    }

    /**
     * Method to add a driver in drivers list store.
     *
     * @param driver that will be added to list.
     */
    public void addDriverInDriverRecord(Driver driver){driverRecord.add(driver);}
    /**
     * Method to add a cab in cabs list store.
     *
     * @param cab that will be added to list.
     */
    public void addCabInCabRecord(Cab cab){cabRecord.add(cab);}
    /**
     * Method to add a taxiTrip in taxiTrip list store.
     *
     * @param taxiTrip that will be added to list.
     */
    public void addTaxiTripRecord(TaxiTrip taxiTrip){taxiTripsRecord.add(taxiTrip);}

}
