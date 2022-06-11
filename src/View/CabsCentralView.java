package View;
import Model.Cab;
import Model.Driver;
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
        if(cab!=null && cab.driver!=null) System.out.println("They assigned him a taxi with a license plate "+cab.getLicensePlate()+"\nconducted by "+cab.driver.getName());
        else System.out.println("No taxi found please try again later");
    }

    public void assignCabToClient(){}

    public void showDriversList(ArrayList<Driver> driversList){
        for (Driver driver:driversList){
            System.out.println(driver.toString());
        }
    }

    public void insertingCabsMessage(){
        System.out.println("Assigning you a taxi and driver");
        chargeBar.chargeBar();
        System.out.println("Finish");
    }

    public void insertingDriversMessage(){
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

}
