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

    public Cab sendCabToClient(TaxiTrip taxiTrip){return model.sendCabToClient(taxiTrip);}

    public void showTaxiTripStatusMessage(Cab cab){view.showTaxiTripStatusMessage(cab);}

    public int getClientMenuSecondView(){
        return view.clientMenuSecondView();}

    public int  getClientMenuFirstView(){
        return view.clientMenuFirstView();
    }

    public ArrayList<TaxiTrip> getTaxiTripsRecordModel(){return model.getTaxiTripsRecord();}

    public ArrayList<Cab> getCabRecordModel(){return model.getCabRecord();}

    public ArrayList<Driver> getDriverRecordModel(){return model.getDriverRecord();}

    public void showRecordList(){view.showRecordList(getTaxiTripsRecordModel(),getDriverRecordModel(),getCabRecordModel());}

    public void generateLists(){
        model.generateCabList();
        model.generateDriverList();
    }

    public void generateChargeBarMessage(){
        view.confirmShipmentMessage();
        view.assigningTaxiMessage();
    }

}
