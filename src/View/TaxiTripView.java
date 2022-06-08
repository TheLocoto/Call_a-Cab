package View;

import Model.TaxiTrip;

import java.util.Scanner;

public class TaxiTripView {

    private Scanner scanner;

    public TaxiTripView(){
        this.scanner=new Scanner(System.in);
    }

    public void taxiTripRequestMessage(){
        System.out.println("PLEASE ENTER YOUR DATES");
    }

    public TaxiTrip taxiTripDates(){
        System.out.println("Enter your address");
        String adress = scanner.nextLine();
        System.out.println("Enter your destiny");
        String destiny = scanner.nextLine();
        System.out.println("Enter the number of people");
        int passenger = scanner.nextInt();
        return new TaxiTrip(passenger,adress,destiny);
    }
    
    public void printTaxiTripDetails(String destiny, int passengers, int cost){
        System.out.println("This is your dates: ");
        System.out.println("Destiny: " + destiny);
        System.out.println("Number of passengers: " + passengers);
        System.out.println("Cost: " + cost);
    }

}
