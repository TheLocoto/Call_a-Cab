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
        System.out.println("This is your dates: ");
        System.out.println("Destiny: " + destiny);
        System.out.println("This is your address: "+ address);
        System.out.println("Number of passengers: " + passengers);
        System.out.println("Cost: " + cost);
    }

}
