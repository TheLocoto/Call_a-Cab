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

public class CabsCentral {
    private ArrayList<Cab> cabsList;
    private ArrayList<Driver> driversList;

    private ArrayList<Driver> driverRecord;
    private ArrayList<Cab> cabRecord;
    private ArrayList<TaxiTrip> taxiTripsRecord;

    private CabDataBase cabDataBase = new CabDataBase();
    private DriverDataBase driverDataBase = new DriverDataBase();

    public CabsCentral(ArrayList<Cab> cabsList, ArrayList<Driver> driversList) {
        this.cabsList = cabsList;
        this.driversList = driversList;
        this.taxiTripsRecord = new ArrayList<>();
        this.cabRecord = new ArrayList<>();
        this.driverRecord = new ArrayList<>();
    }

    public CabsCentral(){
        this.taxiTripsRecord = new ArrayList<>();
        this.cabRecord = new ArrayList<>();
        this.driverRecord = new ArrayList<>();
    }

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

    public ArrayList<Driver> getDriversAvailableList(){
        ArrayList<Driver> driversAvailableList = new ArrayList<>();
        for(Driver driver:driversList){
            if(driver.isAvailable()) driversAvailableList.add(driver);
        }
        return driversAvailableList;
    }

    private Driver getRandomDriverAvailable() {
        ArrayList<Driver> driversAvailableList = getDriversAvailableList();
        Driver driver = null;
        if(driversAvailableList.size()!=0)
            driver = driversAvailableList.get((int) (Math.random() * driversAvailableList.size()));
        return driver;
    }

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

    public void setCabsList(ArrayList<Cab> cabsList){
        this.cabsList = cabsList;
    }

    public ArrayList<Driver> getDriversList() {
        return driversList;
    }

    public void setDriversList(ArrayList<Driver> driversList){ this.driversList=driversList;}

    public void generateCabList(){
        cabDataBase.generateCabList();
        setCabsList(cabDataBase.getCabList());
    }

    public void generateDriverList(){
        driverDataBase.generateDriverList();
        setDriversList(driverDataBase.getDriverList());
    }


    public ArrayList<Driver> getDriverRecord() {
        return driverRecord;
    }

    public void setDriverRecord(ArrayList<Driver> driverRecord) {
        this.driverRecord = driverRecord;
    }

    public ArrayList<Cab> getCabRecord() {
        return cabRecord;
    }

    public void setCabRecord(ArrayList<Cab> cabRecord) {
        this.cabRecord = cabRecord;
    }

    public ArrayList<TaxiTrip> getTaxiTripsRecord() {
        return taxiTripsRecord;
    }

    public void setTaxiTripsRecord(ArrayList<TaxiTrip> taxiTripsRecord) {
        this.taxiTripsRecord = taxiTripsRecord;
    }

    public void addDriverInDriverRecord(Driver driver){driverRecord.add(driver);}

    public void addCabInCabRecord(Cab cab){cabRecord.add(cab);}

    public void addTaxiTripRecord(TaxiTrip taxiTrip){taxiTripsRecord.add(taxiTrip);}

}
