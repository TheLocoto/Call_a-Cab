package Controller;

import Model.TaxiTrip;
import View.TaxiTripView;
import View.View;

public class TaxiTripControllerEXAMPLE {

    private TaxiTrip model;
    private TaxiTripView view;

    public TaxiTripControllerEXAMPLE(TaxiTrip model, TaxiTripView view) {
        this.model = model;
        this.view = view;
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

    public void informationAboutTaxi(){
        setTaxiTripCost();
        view.printTaxiTripDetails(getTaxiTripDestiny(),getTaxiTripPassengers(),getTaxiTripCost());
    }

    public void requestTaxi(){
        view.taxiTripRequestMessage();
        view.taxiTripDates();
    }
}
