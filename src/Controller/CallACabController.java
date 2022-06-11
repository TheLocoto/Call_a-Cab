package Controller;


import DataBase.TaxiTripDataBase;
import Model.Cab;
import Model.TaxiTrip;

import java.util.ArrayList;
import java.util.Scanner;

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

    /*public void callACabClientApp(){


        System.out.println("DESEAS PEDIR UN TAXI?");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        /*while (opcion != 1) {

            taxiTripController.createTaxiTrip();
            cabsCentralController.generateCabList();
            cabsCentralController.generateDriversList();
            //Cab cabSent = cabsCentralController.sendCabToClient(taxiTrip);
            //cabsCentralController.showTaxiTripStatusMessage(cabSent);

            Cab cabSent = cabsCentralController.sendCabToClient(taxiTripController.getTaxiTrip());
            cabsCentralController.showTaxiTripStatusMessage(cabSent);

            System.out.println("¿DESEAS SEGUIR PIDIENDO?");
            opcion = scanner.nextInt();
        }

    }*/

    public void callACabClientApp(){
        int opcion = cabsCentralController.getView().clientMenuFirstView();
        while (opcion!=2){
            taxiTripController.createTaxiTrip();
            cabsCentralController.generateCabList();
            cabsCentralController.generateDriversList();
            Cab cabSent = cabsCentralController.sendCabToClient(taxiTripController.getTaxiTrip());
            cabsCentralController.showTaxiTripStatusMessage(cabSent);
            opcion = cabsCentralController.getView().clientMenuSecondView();
        }
    }
}
