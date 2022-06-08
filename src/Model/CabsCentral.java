/**
 * This class centralizes all classes used in the offer of cab service.
 *
 * This class stores our cabs and drivers list in real life and has logic to assign a cab to a user that need it.
 *
 * @author JuanPabloA
 */
package Model;

import java.util.ArrayList;

public class CabsCentral {
    ArrayList<Cab> cabsList;
    ArrayList<Driver> driversList;

    public CabsCentral(ArrayList<Cab> cabsList, ArrayList<Driver> driversList) {
        this.cabsList = cabsList;
        this.driversList = driversList;
    }

    private boolean checkCabAvailability(Cab cab){
        return cab.getAvailable();
    }

    /**
     * This method looks for a free taxi car in the cabs list and return it.
     * @return if it finds a free cab return it, if it does not return null.
     */
    public Cab getFreeCab(){
        int i=0;
        Cab freeCab = null;
        while(i< cabsList.size() && freeCab == null){
            if(cabsList.get(i).getAvailable()){
                freeCab = cabsList.get(i);
            }
            i++;
        }
        return freeCab;
    }

    /**
     * This method looks for a driver available in the drivers list and return it.
     * @return if it finds a driver available return it, if it does not return null.
     */
    public Driver getDriverAvailable(){
        int i=0;
        Driver driverAvailable = null;
        while(i< driversList.size() && driverAvailable == null){
            if(driversList.get(i).isAvailable()){
                driverAvailable = driversList.get(i);
            }
            i++;
        }
        return driverAvailable;
    }

    /**
     * This method gets a free cab, if it exists we set the driver and return the cab with the updated driver,
     * if there isn't, it returns null
     * @return a cab with an updated driver or a null object.
     */
    public Cab getAssignedDriver(){
        Cab freeCab = getFreeCab();
        if(freeCab != null)
            freeCab.setDriver(getDriverAvailable());
        return freeCab;
    }

    public ArrayList<Cab> getCabsList() {
        return cabsList;
    }

    public ArrayList<Driver> getDriversList() {
        return driversList;
    }
}
