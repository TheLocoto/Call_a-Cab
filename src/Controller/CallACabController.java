package Controller;

import Model.Cab;
import Utils.CarTour;
public class CallACabController {

    private TaxiTripController taxiTripController;
    private CabsCentralController cabsCentralController;
    private DriverController driverController;
    private CabController cabController;
    private CarTour carTour;

    public CallACabController(){
        this.taxiTripController = new TaxiTripController();
        this.cabsCentralController = new CabsCentralController();
        //this.driverController = new DriverController();
        this.cabController = new CabController();
        this.carTour=new CarTour();
    }

    public void callACabClientApp(){
        int opcion = cabsCentralController.getClientMenuFirstView();
        int attemps = 0;
        cabsCentralController.generateCabList();
        cabsCentralController.generateDriversList();
        while (opcion!=2){
            attemps = taxiTripController.taxiTrip(attemps);
            Cab cabSent = cabsCentralController.sendCabToClient(taxiTripController.getTaxiTrip());
            cabsCentralController.showTaxiTripStatusMessage(cabSent);
            if(cabSent!=null)carTour.carTour();
            opcion = cabsCentralController.getClientMenuSecondView();

        }
    }
}
