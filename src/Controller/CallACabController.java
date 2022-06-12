package Controller;

import Model.Cab;
import Utils.CarTour;
public class CallACabController {

    private TaxiTripController taxiTripController;
    private CabsCentralController cabsCentralController;
    private CarTour carTour;

    public CallACabController(){
        this.taxiTripController = new TaxiTripController();
        this.cabsCentralController = new CabsCentralController();
        this.carTour=new CarTour();
    }

    public void callACabClientApp(){
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
    }
}
