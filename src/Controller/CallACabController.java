package Controller;


public class CallACabController {

    private TaxiTripController taxiTripController;
    private CabsCentralController cabsCentralController;
    private DriverController driverController;
    private CabController cabController;

    public CallACabController(){
        this.taxiTripController = new TaxiTripController();
        //this.cabsCentralController = new CabsCentralController();
        //this.driverController = new DriverController();
        //this.cabController = new CabController();
    }

    public void callACabApp(){
        taxiTripController.taxiTrip();
    }

}
