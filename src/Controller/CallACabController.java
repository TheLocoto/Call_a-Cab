package Controller;

import Model.Cab;
import Utils.CarTour;

/**
 * This is the principal class of the call-a-cab.
 * Takes care of declaring, initializing, saving its values and
 * being able to obtain them or setting all its call-a-cab controller.
 */
public class CallACabController {

    private TaxiTripController taxiTripController;
    private CabsCentralController cabsCentralController;
    private CarTour carTour;

    /**
     * This is the principal controller
     * Initializes all important controllers like taxiTripController, CabsCentralController and an utils carTour
     * to show the route of the car.
     */
    public CallACabController(){
        this.taxiTripController = new TaxiTripController();
        this.cabsCentralController = new CabsCentralController();
        this.carTour=new CarTour();
    }

    /**
     * This is the method of our app
     * We join all the necessary methods within this in order to be able to generate a taxi order where at the
     * end a history of all our trips is shown
     */
    public void callACabClientApp(){
        cabsCentralController.showWelcome();
        int opcion = cabsCentralController.getClientMenuFirstView();
        int attemps = 0;
        cabsCentralController.generateLists();
        while (opcion!=2){
            attemps = taxiTripController.taxiTrip(attemps);
            cabsCentralController.generateChargeBarMessage();
            Cab cabSent = cabsCentralController.sendCabToClient(taxiTripController.getTaxiTrip());
            cabsCentralController.showTaxiTripStatusMessage(cabSent);
            if(cabSent!=null)carTour.carTour();
            opcion = cabsCentralController.getClientMenuSecondView();
        }
        cabsCentralController.showRecordList();
    }
}
