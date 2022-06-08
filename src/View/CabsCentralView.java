package View;
import Model.Cab;
import Model.Driver;
import java.util.ArrayList;
import java.util.Scanner;

public class CabsCentralView {
    Scanner input;
    public CabsCentralView() {
        this.input = new Scanner(System.in);
    }

    public void showWelcome(){
        System.out.println("---------------------------");
        System.out.println("Welcome to CALL-A-CAB!");
        System.out.println("---------------------------");
    }

    public void assignCabToClient(){}

    public void showDriversList(ArrayList<Driver> driversList){
        for (Driver driver:driversList){
            System.out.println(driver.toString());
        }
    }
}
