package Controller;
import Model.Cab;
import View.CabView;

public class CabController {

    private Cab cab;
    private CabView cabView;

    public CabController(Cab cab, CabView cabView){
        this.cab = cab;
        this.cabView = cabView;
    }

    public String getBrand() {
        return cab.getBrand();
    }

    public String getModel() {
        return cab.getModel();
    }
    public String getLicensePlate() {
        return cab.getLicensePlate();
    }

    public int getFuelLevel() {
        return cab.getFuelLevel();
    }

    public void setFuelLevel(int fuelLevel) {
        cab.setFuelLevel(fuelLevel);
    }

    public void setAvailability(boolean availability) {
        cab.setAvailability(availability);
    }

    public boolean getAvailability(){
        return cab.getAvailability();
    }



    public void showInfoTaxi(){

        cabView.showInfoTaxi(getBrand(), getModel(), getLicensePlate(), getAvailability(), getFuelLevel());
    }

}