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
        if(cab != null) System.out.println("Se le asigno el taxi con matricula "+cab.getLicensePlate()+"\nConducido por "+cab.driver.getName());
        else System.out.println("No se puede en este momento, intente mas tarde");
    }

    public void assignCabToClient(){}

    public void showDriversList(ArrayList<Driver> driversList){
        for (Driver driver:driversList){
            System.out.println(driver.toString());
        }
    }

    public void insertingCabsMessage(){
        System.out.println("Inserting list of cabs wait a moment");
        chargeBar.chargeBar();
        System.out.println("Finish");
    }

    public void insertingDriversMessage(){
        System.out.println("Inserting list of drivers wait a moment");
        chargeBar.chargeBar();
        System.out.println("Finish");
    }

}
