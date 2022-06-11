package Controller;


import DataBase.TaxiTripDataBase;
import Model.Cab;
import Model.TaxiTrip;
import Utils.CarTour;

import java.util.ArrayList;
import java.util.Scanner;

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
        int opcion = cabsCentralController.getClientMenuFirstView();
        int attemps = 0;
        while (opcion!=2){
            attemps = taxiTripController.taxiTrip(attemps);
            //SE PUEDE INSERTAR EL GENERATE LISTS EN ALGUNA FUNCION DEL CABCENTRAL? PARA Q NO SE VEA TAN GRANDE
            //ESTA PARTE XD
            cabsCentralController.generateCabList();
            cabsCentralController.generateDriversList();
            //INTENTAR IGUAL REDUCIR ESTA PARTE PARA Q TOOODA ESTA LOGICA ESTE EN UNA SOLA FUNCION COMO EN EL TAXI TRIP
            Cab cabSent = cabsCentralController.sendCabToClient(taxiTripController.getTaxiTrip());
            cabsCentralController.showTaxiTripStatusMessage(cabSent);
            //Y ARREGLAR LA PARTE DONDE NO RESETEA LOS AUTOS, TENDRIAS QUE RESETEAR DIRECTAMENTE EN LA LISTA DE AUTOS
            //DEL CAB CENTRAL
            carTour.carTour();
            opcion = cabsCentralController.getClientMenuSecondView();
        }
    }
}
