package Controller;


import Model.Cab;

import java.util.ArrayList;

public class CallACabController {

    private TaxiTripController taxiTripController;
    private CabsCentralController cabsCentralController;
    private DriverController driverController;
    private CabController cabController;

    public CallACabController(){
        this.taxiTripController = new TaxiTripController();
        this.cabsCentralController = new CabsCentralController();
        //this.driverController = new DriverController();
        this.cabController = new CabController();
    }

    public void callACabClientApp(){
        taxiTripController.taxiTrip();
    }

    public void callACabWorkerApp(){
        cabsCentralController.generateCabList();
        cabsCentralController.generateDriversList();
        System.out.println(cabsCentralController.getCabsListCabsCentral().size());
        System.out.println(cabsCentralController.getDriversListCabsCentral().size());
    }

}
