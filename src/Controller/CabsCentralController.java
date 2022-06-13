package Controller;
import Model.Cab;
import Model.CabsCentral;
import Model.Driver;
import Model.TaxiTrip;
import View.CabsCentralView;

import java.util.ArrayList;


/**
 * This class is the central cabs controller where centralizes cabs central model and view.
 *
 * @author The Negasonic Teenage Warhead
 */
public class CabsCentralController {
    private CabsCentral model;
    private CabsCentralView view;

    /**
     * The constructor method initializes the model and view of cabs central.
     */
    public CabsCentralController() {
        this.model = new CabsCentral();
        this.view = new CabsCentralView();
    }

    /**
     * This method get the view of cabsCentralView and return it.
     * @return the view of cabsCentralView.
     */
    public CabsCentralView getView(){return view;}


    /**
     * This method get the driver list from cabsCentral.
     * @return the driver list from cabsCentral.
     */
    public ArrayList<Driver> getDriversListCabsCentral() {
        return model.getDriversList();
    }

    /**
     * This method shows the welcome of cabsCentralView.
     */
    public void showWelcome(){ view.showWelcome();}

    /**
     * This method communicates the model logic to send a cab to a client with the user.
     * @param taxiTrip taxi trip that is requested.
     * @return the cab that will be sent.
     */
    public Cab sendCabToClient(TaxiTrip taxiTrip){return model.sendCabToClient(taxiTrip);}

    /**
     * This method prints if the Taxi Trip was given successfully or if it was not possible to do that.
     *
     * @param cab receives an object cab if the process was successful and null if not.
     */
    public void showTaxiTripStatusMessage(Cab cab){view.showTaxiTripStatusMessage(cab);}

    /**
     * This method prints the question for continue the app run or not.
     *
     * @return an int value which will facilitate us to count the number of executions.
     */
    public int getClientMenuSecondView(){
        return view.clientMenuSecondView();}

    /**
     * This method prints the question for continue the app run or not.
     *
     * @return an int value which will facilitate us to count the number of executions.
     */
    public int  getClientMenuFirstView(){
        return view.clientMenuFirstView();
    }

    /**
     * This method returns the taxi trips record or history.
     *
     * @return  the taxi trips record or history.
     */
    public ArrayList<TaxiTrip> getTaxiTripsRecordModel(){return model.getTaxiTripsRecord();}
    /**
     * This method returns the cab record or history.
     *
     * @return  the cab record or history.
     */
    public ArrayList<Cab> getCabRecordModel(){return model.getCabRecord();}
    /**
     * This method returns the driver record or history.
     *
     * @return  the driver record or history.
     */
    public ArrayList<Driver> getDriverRecordModel(){return model.getDriverRecord();}
    /**
     * This method allows us to show the taxi trips information at the final of execution.
     */
    public void showRecordList(){view.showRecordList(getTaxiTripsRecordModel(),getDriverRecordModel(),getCabRecordModel());}

    /**
     * This method generate our cabs and driver lists from the database.
     */
    public void generateLists(){
        model.generateCabList();
        model.generateDriverList();
    }

    /**
     * This method generate and print a charge bar animation with characters
     */
    public void generateChargeBarMessage(){
        view.confirmShipmentMessage();
        view.assigningTaxiMessage();
    }

}
