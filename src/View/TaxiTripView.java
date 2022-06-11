package View;

import Model.TaxiTrip;

import java.util.Scanner;

public class TaxiTripView {

    private Scanner scanner;

    public TaxiTripView(){
        this.scanner=new Scanner(System.in);
    }

    /**
     * First
     */
    public void taxiTripRequestMessage(){
        System.out.println("PLEASE ENTER YOUR DATES");
    }

    public String enterAddressMessage(){
        System.out.println("Enter your address");
        String adress = scanner.nextLine();
        return adress;
    }
    public String enterDestinyMessage(){
        System.out.println("Enter your destiny");
        String destiny = scanner.nextLine();
        return destiny;
    }
    public int enterPassengersMessage(){
        System.out.println("Enter the number of passengers");
        int passengers = scanner.nextInt();
        return passengers;
    }

    public void printTaxiTripDetails(String destiny,String address, int passengers, int cost){
        System.out.println("This is your dates");
        System.out.println("Destiny: " + destiny);
        System.out.println("Address: "+ address);
        System.out.println("Passengers: " + passengers);
        System.out.println("Cost: " + cost);
    }

    public String requestTaxiTripAgain(){
        String resetScanner = scanner.nextLine();
        return resetScanner;
    }

    public int menuTaxiTripMessage(){
        int opcion;
        System.out.println("Do you agree with the details?");
        System.out.println("1: Yes, I agree");
        System.out.println("2: No, I don't like the price");
        System.out.println("3: No, My dates are incorrect");

        opcion = scanner.nextInt();
        return opcion;
    }

    public void validatePassengersMessage(){
        System.out.println("The taxi don´t accept more of 5 people");
    }

    public void incorrectAnswer(){
        System.out.println("Incorrect answer");
    }

    public void finishMessage(){
        System.out.println("Thank you! Now we will assign you a driver");
    }
}
