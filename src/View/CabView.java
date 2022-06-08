package View;

import java.util.ArrayList;

public class CabView {

    /*private void showTaxisList(ArrayList<Cab> taxisList){
        for (Cab cab : taxisList) {
            int licensePlate = cab.getLicensePlate();
            boolean availability = cab.getAvailability();
        }
    }*/

    public void showTaxisList(int licensePlate, boolean availability){
        System.out.println("\t" + "License Plate: " + licensePlate);
        System.out.println("\t" + "Availability: " + availability + "\n");
    }
}
