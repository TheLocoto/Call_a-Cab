package Controller;


import DataBase.TaxiTripDataBase;
import Model.Cab;
import Model.TaxiTrip;

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
        //taxiTripController.taxiTrip(); corregiR
        /*
         *
         *
         * */
        TaxiTrip firstTrip = new TaxiTrip(3, "Circunvalacion esq. Robles", "Terminal de buses", 20);
        TaxiTrip secondTrip = new TaxiTrip(2, "Atahuallpa esq. Semapa", "Hupermall", 15);

        cabsCentralController.generateCabList();
        cabsCentralController.generateDriversList();
        //Cab cabSent = cabsCentralController.sendCabToClient(taxiTrip);
        //cabsCentralController.showTaxiTripStatusMessage(cabSent);

        Cab cabSent1 = cabsCentralController.sendCabToClient(firstTrip);
        cabsCentralController.showTaxiTripStatusMessage(cabSent1);

        Cab cabSent2 = cabsCentralController.sendCabToClient(secondTrip);
        cabsCentralController.showTaxiTripStatusMessage(cabSent2);

    }

    public void callACabWorkerApp(){
        cabsCentralController.generateCabList();
        cabsCentralController.generateDriversList();
        //System.out.println(cabsCentralController.getCabsListCabsCentral().size());
        //System.out.println(cabsCentralController.getDriversListCabsCentral().size());
    }

}

//  ANTIGUO