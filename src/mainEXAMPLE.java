import Controller.TaxiTripControllerEXAMPLE;
import Model.TaxiTrip;
import View.TaxiTripView;

public class mainEXAMPLE {

    public static void main(String arg[]){

        TaxiTripView taxiTripView = new TaxiTripView();
        TaxiTrip taxiTripModel = new TaxiTrip();


        TaxiTripControllerEXAMPLE taxiTripController= new TaxiTripControllerEXAMPLE();

        taxiTripController.requestTaxiTrip();
        taxiTripController.informationAboutTaxiTrip();

    }
}
