package Controller;
import Model.Cab;
import Model.CabsCentral;
import Model.Driver;
import View.CabsCentralView;

import java.util.ArrayList;


public class CabsCentralController {
    private CabsCentral model;
    private CabsCentralView view;

    public CabsCentralController() {
        this.model = new CabsCentral();
        this.view = new CabsCentralView();
    }

    public Cab getFreeCabCabsCentral(){
        return model.getFreeCab();
    }

    public Driver getDriverAvailableCabsCentral(){
        return model.getDriverAvailable();
    }

    public Cab getAssignedDriverCabsCentral(){
        return model.getAssignedDriver();
    }

    public Cab sendAssignedCabCabsCentral(){return model.sendAssignedCab();}

    //public void takeOffDriverCabsCentral(Cab cab){ model.takeOffDriver(cab); }

    public void setCabAvailability(Cab cab, boolean status){model.enableCab(cab);}

    public ArrayList<Cab> getCabsListCabsCentral() {return model.getCabsList();}

    public ArrayList<Driver> getDriversListCabsCentral() {
        return model.getDriversList();
    }

    public void showWelcome(){ view.showWelcome();}

    public void generateCabList(){
        view.insertingCabsMessage();
        model.generateCabList();
    }

    public void generateDriversList(){
        view.insertingDriversMessage();
        model.generateDriverList();
    }




}
