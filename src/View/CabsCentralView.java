package View;
import Model.Cab;
import Model.Driver;
import Model.TaxiTrip;
import Utils.ChargeBar;

import java.util.ArrayList;
import java.util.Scanner;

public class CabsCentralView {
    Scanner input;
    ChargeBar chargeBar;

    public CabsCentralView() {
        this.input = new Scanner(System.in);
        this.chargeBar = new ChargeBar();
    }

    public void showWelcome(){
        System.out.println("---------------------------");
        System.out.println("Welcome to CALL-A-CAB!");
        System.out.println("---------------------------");
    }

    public void showTaxiTripStatusMessage(Cab cab){
        if(cab!=null && cab.driver!=null) System.out.println("We assigned you a cab with a license plate "+cab.getLicensePlate()+"\nconducted by "+cab.driver.getName());
        else System.out.println("No taxi found please try again later");
    }

    public void assignCabToClient(){}

    public void showDriversList(ArrayList<Driver> driversList){
        for (Driver driver:driversList){
            System.out.println(driver.toString());
        }
    }

    public void assigningTaxiMessage(){
        System.out.println("Assigning you a taxi and driver");
        chargeBar.chargeBar();
        System.out.println("Finish");
    }

    public void confirmShipmentMessage(){
        System.out.println("Confirming the shipment of your taxi trip");
        chargeBar.chargeBar();
        System.out.println("Finish");
    }

    public int clientMenuSecondView(){
        int opcion;
        System.out.println("Do you need another taxi?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        opcion = input.nextInt();
        return  opcion;
    }

    public int clientMenuFirstView(){
        int opcion;
        System.out.println("Do you need a taxi?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        opcion = input.nextInt();
        return  opcion;
    }

    public void showRecordList(ArrayList<TaxiTrip> taxiTripsRecord,ArrayList<Driver> DriverRecord,
                               ArrayList<Cab> cabRecord){
        for (int i=0;i<taxiTripsRecord.size();i++){
            System.out.println("The trip with destiny " + taxiTripsRecord.get(i).getDestiny() + " address " +
                    taxiTripsRecord.get(i).getAddress() + "\nand a cost of " + taxiTripsRecord.get(i).getCost() +
                    "\nwas given by " + DriverRecord.get(i).getName() + " in a license plate car " +
                    cabRecord.get(i).getLicensePlate());
        }
    }

}
