package Controller;
import Model.Cab;
import View.CabView;

import java.util.ArrayList;

public class CabController {

    private Cab model;
    private CabView view;

    public CabController(){
        this.model = new Cab();
        this.view = new CabView();
    }

    public String getBrand() {
        return model.getBrand();
    }

    public String getModel() {
        return model.getModel();
    }
    public String getLicensePlate() {
        return model.getLicensePlate();
    }

    public int getFuelLevel() {
        return model.getFuelLevel();
    }

    public void setFuelLevel(int fuelLevel) {
        model.setFuelLevel(fuelLevel);
    }

    public void setAvailability(boolean availability) {
        model.setAvailability(availability);
    }

    public boolean getAvailability(){
        return model.getAvailability();
    }



    public void showInfoTaxi(){
        view.showInfoTaxi(getBrand(), getModel(), getLicensePlate(), getAvailability(), getFuelLevel());
    }


}