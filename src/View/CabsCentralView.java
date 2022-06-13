package View;
import Model.Cab;
import Model.Driver;
import Model.TaxiTrip;
import Utils.ChargeBar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class contains the methods to display the data of the Cab Central class.
 *
 * @author The Negasonic Teenage Warhead
 */
public class CabsCentralView {
    Scanner input;
    ChargeBar chargeBar;

    /**
     * This is the constructor method that initializes the Scanner for inputs and the ChargeBar for printing animation.
     */
    public CabsCentralView() {
        this.input = new Scanner(System.in);
        this.chargeBar = new ChargeBar();
    }

    /**
     * This method prints a little message with a welcome text.
     */
    public void showWelcome(){
        System.out.println("---------------------------");
        System.out.println("Welcome to CALL-A-CAB!");
        System.out.println("---------------------------");
    }

    /**
     * This method prints if the Taxi Trip was given successfully or if it was not possible to do that.
     *
     * @param cab receives an object cab if the process was successful and null if not.
     */
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

    /**
     * This method shows the animation when it is assigning a cab and a driver to any client.
     */
    public void assigningTaxiMessage(){
        System.out.println("Assigning you a taxi and driver");
        chargeBar.chargeBar();
        System.out.println("Finish");
    }

    /**
     * This method shows the animation simulating that it is confirming that will send a cab.
     */
    public void confirmShipmentMessage(){
        System.out.println("Confirming the shipment of your taxi trip");
        chargeBar.chargeBar();
        System.out.println("Finish");
    }

    /**
     * This method prints the question for continue the app run or not.
     *
     * @return an int value which will facilitate us to count the number of executions.
     */
    public int clientMenuSecondView(){
        int opcion;
        System.out.println("Do you need another taxi?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        opcion = input.nextInt();
        return  opcion;
    }

    /**
     * This method prints the question for continue the app run or not.
     *
     * @return an int value which will facilitate us to count the number of executions.
     */
    public int clientMenuFirstView(){
        int opcion;
        System.out.println("Do you need a taxi?");
        System.out.println("1: Yes");
        System.out.println("2: No");
        opcion = input.nextInt();
        return  opcion;
    }

    /**
     * This method allows us to show the taxi trips information at the final of execution.
     *
     * @param taxiTripsRecord receives a list with the taxi trip historic data.
     * @param DriverRecord receives a list with the drivers historic data.
     * @param cabRecord receives a list with the cabs historic data.
     */
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
