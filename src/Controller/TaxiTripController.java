package Controller;

import Model.TaxiTrip;
import View.TaxiTripView;

/**
 * TaxiTripController
 */
public class TaxiTripController {

    private TaxiTrip model;
    private TaxiTripView view;

    public TaxiTripController() {
        this.model = new TaxiTrip();
        this.view = new TaxiTripView();
    }

    public void setTaxiTripCost(){
        model.setCost();
    }

    public int getTaxiTripCost(){
        return model.getCost();
    }

    public void setTaxiTripPassengers(int passengers){
        model.setPassenger(passengers);
    }

    public int getTaxiTripPassengers(){
        return model.getPassenger();
    }

    public void setTaxiTripDestiny(String destiny){
        model.setDestiny(destiny);
    }

    public String getTaxiTripDestiny(){
        return model.getDestiny();
    }

    public void setTaxiTripAddress(String address){
        model.setAddress(address);
    }

    public String getTaxiTripAddress(){
        return model.getAddress();
    }



    public void informationAboutTaxiTrip(){
        setTaxiTripCost();
        view.printTaxiTripDetails(getTaxiTripDestiny(),getTaxiTripAddress(),getTaxiTripPassengers(),getTaxiTripCost());
    }

    public void requestTaxiTrip(){
        view.taxiTripRequestMessage();
        String address = view.enterAddressMessage();
        setTaxiTripAddress(address);
        String destiny = view.enterDestinyMessage();
        setTaxiTripDestiny(destiny);
        int passengers = view.enterPassengersMessage();
        while (passengers>5) {
            view.validatePassengersMessage();
            passengers = view.enterPassengersMessage();
        }
        setTaxiTripPassengers(passengers);
    }

    public void requestTaxiTripAgain() {
        view.requestTaxiTripAgain();
        requestTaxiTrip();
    }

    public void confirmTaxiTrip(){
        informationAboutTaxiTrip();
        int opcion = view.menuTaxiTripMessage();
        while(opcion!=1) {
            incorrectDates(opcion);
            incorrectPrice(opcion);
            incorrectAnswer(opcion);
            opcion = view.menuTaxiTripMessage();
        }
        view.finishMessage();
    }

    public void incorrectDates(int opcion){
        if (opcion==3){
            requestTaxiTripAgain();
            informationAboutTaxiTrip();
        }
    }

    public void incorrectPrice(int opcion){
        if (opcion==2){
            setTaxiTripCost();
            informationAboutTaxiTrip();
        }
    }

    public void incorrectAnswer(int opcion){
        if (opcion > 3){
            view.incorrectAnswer();
        }
    }

    public void createTaxiTrip(){
        requestTaxiTrip();
        confirmTaxiTrip();
    }

    public TaxiTrip getTaxiTrip(){
        return model;
    }

}
