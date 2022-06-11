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
                break;
            }
        }
        return driverFound;
    }

    private Driver getRandomDriverAvailable() {
        Driver randomDriver = null;
        boolean choosingARandomDriverAvailable = true;
        while (choosingARandomDriverAvailable) {
            randomDriver = driversList.get((int) (Math.random() * driversList.size()));
            if (randomDriver.isAvailable()) {
                choosingARandomDriverAvailable = false;
            }
        }
        return randomDriver;
    }

    private Cab getRandomCabAvailable() {
        Cab randomCab = null;
        boolean choosingARandomCabAvailable = true;
        while (choosingARandomCabAvailable) {
            randomCab = cabsList.get((int) (Math.random() * cabsList.size()));
            if (randomCab.getAvailability()) {
                choosingARandomCabAvailable = false;
            }
        }
        return randomCab;
    }

    private void assignDriverToCab(Cab cab, Driver driver) {
        cab.setDriver(driver);
        cab.setAvailability(false);
        cab.driver.setAvailability(false); //o driver.setAvailability(false)
    }

    private void addTaxiTripToCab(Cab cab, TaxiTrip taxiTrip) {
        //cab.addTaxiTrip(taxiTrip);
    }

    private Cab searchARandomCabBusy() {
        Cab cabToEvacuate = null;
        boolean choosingARandomCabBusy = true;
        while (choosingARandomCabBusy) {
            cabToEvacuate = cabsList.get((int) (Math.random() * cabsList.size()));
            if (!cabToEvacuate.getAvailability()) {
                choosingARandomCabBusy = false;
            }
        }
        return cabToEvacuate;
    }

    private void setFreeAnyBusyCab() {
        Cab cab = searchARandomCabBusy();
        cab.driver.setAvailability(true);
        cab.setDriver(null);
        cab.setAvailability(true);
    }

    public Cab verifyAvailableCab() {
        Cab cab = getCabAvailable();
        if (cab != null) {
            Driver driver = getDriverAvailable();
            //Driver driver = getRandomDriverAvailable();
            if (driver != null)
                assignDriverToCab(cab, driver);
                //else setFreeAnyBusyCab();
            else cab = null;
        }
        return cab;
    }

    public Cab sendCabToClient(TaxiTrip taxiTrip) {
        Cab cab = verifyAvailableCab();
        if (cab != null && cab.driver!=null) {
            cab.addTaxiTrip(taxiTrip);
            //imprimir datos del cab y driver
        }else setFreeAnyBusyCab();//imprimir lo sentimos intente de nuevo
        return cab;
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
