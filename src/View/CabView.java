package View;

import DataBase.CabDataBase;
import Utils.ChargeBar;

import java.util.Scanner;

/**
 * This class contains the methods to display the data of the Cab class.
 * Cab class is inside the Model package
 *
 * @author The Negasonic Teenage Warhead
 */
public class CabView {

    Scanner scanner;
    CabDataBase cabDataBase;
    ChargeBar chargeBar;

    public CabView(){
        this.scanner = new Scanner(System.in);
        this.cabDataBase = new CabDataBase();
        this.chargeBar=new ChargeBar();
    }

    /**
     * This method shows the information of the taxi.
     *
     * This method uses escape characters like "\n" and "\t", to make it look aesthetic in the console.
     *
     * @param brand        this is the name of the car.
     * @param model        this is the model of the car.
     * @param licensePlate this is the license Plate of the car.
     * @param availability indicates the status of the taxi.
     */
    public void showInfoTaxi(String brand, String model, String licensePlate, boolean availability) {
        System.out.println("\n" + "\t" + "Brand: " + brand);
        System.out.println("\t" + "Model: " + model);
        System.out.println("\t" + "License Plate: " + licensePlate);
        System.out.println("\t" + "Availability: " + availability);
    }

}
