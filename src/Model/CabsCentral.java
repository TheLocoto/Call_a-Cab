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
    ArrayList<Cab> cabsList;
    ArrayList<Driver> driversList;

    CabDataBase cabDataBase = new CabDataBase();
    DriverDataBase driverDataBase = new DriverDataBase();

    public CabsCentral(ArrayList<Cab> cabsList, ArrayList<Driver> driversList) {
        this.cabsList = cabsList;
        this.driversList = driversList;
    }

    public CabsCentral(){
    }

    public Cab sendCabToClient(TaxiTrip taxiTrip){
        Cab cab = getCabAvailable();
        Driver driver = getDriverAvailable();
        if(cab!=null&&driver!=null){
            cab.setDriver(driver);
            driver.setAvailability(false);
            cab.setAvailability(false);
            cab.addTaxiTrip(taxiTrip);
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

    private Driver getDriverAvailable() {
        Driver driverFound = null;
        for (Driver driver : driversList) {
            if (driver.isAvailable()) {
                driverFound = driver;
                driverFound.setAvailability(false);
                break;
            }
        }
        return driverFound;
    }

    private void assignDriverToCab(Cab cab, Driver driver) {
        cab.setDriver(driver);
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
}
