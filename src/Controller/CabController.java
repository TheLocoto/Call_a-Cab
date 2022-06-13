package Controller;
import Model.Cab;
import View.CabView;

import java.util.ArrayList;

/**
 * This class is a controller for the Cab and CabView class
 */
public class CabController {

    private Cab model;
    private CabView view;

    /**
     * This is a constructor method, to initialize the model and view.
     * Initialize the Cab class that is in the Model package and the CabView class that is in the View package.
     */
    public CabController(){
        this.model = new Cab();
        this.view = new CabView();
    }

    /**
     * This method is used only to return the method getBrand.
     * The method getBrand it is found in the Cab class in the Model package.
     * @return the value returned by the getBrand method.
     */
    public String getBrand() {
        return model.getBrand();
    }

    /**
     * This method is used only to return the method getModel.
     * The method getModel it is found in the Cab class in the Model package.
     * @return the value returned by the getModel method.
     */
    public String getModel() {
        return model.getModel();
    }

    /**
     * This method is used only to return the method getLicensePlate.
     * The method getLicensePlate it is found in the Cab class in the Model package.
     * @return the value returned by the getLicensePlate method.
     */
    public String getLicensePlate() {
        return model.getLicensePlate();
    }

    /**
     * This method is used only to return the method getFuelLevel.
     * The method getFuelLevel it is found in the Cab class in the Model package.
     * @return the value returned by the getFuelLevel method.
     */
    public int getFuelLevel() {
        return model.getFuelLevel();
    }

    /**
     * This is a setter method for the variable fuelLevel.
     * Use the setter method of the Cab class that is in the Model package.
     * @param fuelLevel is the value that will be stored in the Cab class.
     */
    public void setFuelLevel(int fuelLevel) {
        model.setFuelLevel(fuelLevel);
    }

    /**
     * This is a setter method for the variable fuelLevel.
     * Use the setter method of the Cab class that is in the Model package.
     * @param availability is the value that will be stored in the Cab class.
     */
    public void setAvailability(boolean availability) {
        model.setAvailability(availability);
    }

    /**
     * This method is used only to return the method getAvailability.
     * The method getAvailability it is found in the Cab class in the Model package.
     * @return the value returned by the getFuelLevel method.
     */
    public boolean getAvailability(){
        return model.getAvailability();
    }

    /**
     * This is a method that uses the showInfoTaxi method.
     * This method is found in the CabView class in the View package.
     */
    public void showInfoTaxi(){
        view.showInfoTaxi(getBrand(), getModel(), getLicensePlate(), getAvailability(), getFuelLevel());
    }

}