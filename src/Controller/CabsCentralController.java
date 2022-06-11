package Controller;
import Model.Cab;
import Model.CabsCentral;
import Model.Driver;
import Model.TaxiTrip;
import View.CabsCentralView;

import java.util.ArrayList;


public class CabsCentralController {
    private CabsCentral model;
    private CabsCentralView view;

    public CabsCentralController() {
        this.model = new CabsCentral();
        this.view = new CabsCentralView();
    }

    public CabsCentralView getView(){return view;}

    public ArrayList<Driver> getDriversListCabsCentral() {
        return model.getDriversList();
    }

    public void showWelcome(){ view.showWelcome();}

    //public Cab verifyAvailableCab() {return model.verifyAvailableCab();}
    public Cab sendCabToClient(TaxiTrip taxiTrip){return model.sendCabToClient(taxiTrip);}

    public void showTaxiTripStatusMessage(Cab cab){view.showTaxiTripStatusMessage(cab);}

    public void generateCabList(){
        view.insertingCabsMessage();
        model.generateCabList();
    }

    public void generateDriversList(){
        view.insertingDriversMessage();
        model.generateDriverList();
    }

    public void requestATaxi(){
        int opcion = view.clientMenuFirstView();
        while (opcion!=1){


            opcion = view.clientMenuSecondView();
        }
    }




}
