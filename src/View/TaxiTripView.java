package View;

import Model.TaxiTrip;

import java.util.Scanner;

/**
 * This class contains necessary data of a taxi trip view.
 * Takes care of declaring, initializing, saving its values and
 * being able to obtain them.
 * @author The Negasonic Teenage Warhead.
 */
public class TaxiTripView {

    private Scanner scanner;

    /**
     * This constructor method of a taxi trip view, initialize the atributes in base to all parameters.
     * Initializes the scanner who help us to save user data
     */
    public TaxiTripView(){
        this.scanner=new Scanner(System.in);
    }

    /**
     * This method is used to print on the screen a message to ask the user for data.
     */
    public void taxiTripRequestMessage(){
        System.out.println("PLEASE ENTER YOUR DATES");
    }

    /**
     * This method is used to request the address of the user
     * makes use of the scanner so that the user can insert their data.
     * @return the address of the user
     */
    public String enterAddressMessage(){
        System.out.println("Enter your address");
        String address = scanner.nextLine();
        return address;
    }

    /**
     * This method is used to request the destiny of the user
     * makes use of the scanner so that the user can insert their data
     * @return the destiny of the user
     */
    public String enterDestinyMessage(){
        System.out.println("Enter your destiny");
        String destiny = scanner.nextLine();
        return destiny;
    }

    /**
     * This method is used to request the number of passengers of the user
     * makes use of the scanner so that the user can insert their data
     * @return the number of passengers of the user
     */
    public int enterPassengersMessage(){
        System.out.println("Enter the number of passengers");
        int passengers = scanner.nextInt();
        return passengers;
    }

    /**
     * This method is used to print on screen the details of the taxi trip
     * @param destiny the destiny of the user
     * @param address the address of the user
     * @param passengers the number of passengers
     * @param cost the cost of taxi trip
     */
    public void printTaxiTripDetails(String destiny,String address, int passengers, int cost){
        System.out.println("This is your dates");
        System.out.println("Address: "+ address);
        System.out.println("Destiny: " + destiny);
        System.out.println("Passengers: " + passengers);
        System.out.println("Cost: " + cost);
    }

    /**
     * This method is used to reset the scanner
     * We create us because sometimes the scanner did not work.
     * @return a reset of scanner
     */
    public String requestTaxiTripAgain(){
        String resetScanner = scanner.nextLine();
        return resetScanner;
    }

    /**
     * This method is used to show the user a menu of option to verify their data
     * make use of the scanner so that the user can insert the required option.
     * @return the option the user chose.
     */
    public int menuTaxiTripMessage(){
        int opcion;
        System.out.println("Do you agree with the details?");
        System.out.println("1: Yes, I agree");
        System.out.println("2: No, I don't like the price");
        System.out.println("3: No, My dates are incorrect");

        opcion = scanner.nextInt();
        return opcion;
    }

    /**
     * This method is used to display an error message when inserting a number that is too high
     */
    public void validatePassengersMessage(){
        System.out.println("The taxi don´t accept more of 5 people");
    }

    /**
     * This method is used to display an error message when the user insert an option greater than three
     */
    public void incorrectAnswer(){
        System.out.println("Incorrect answer");
    }

    /**
     * This method is used to display a message when the user confirm their data.
     */
    public void finishMessage(){
        System.out.println("Thank you! Now we will assign you a driver");
    }
}
