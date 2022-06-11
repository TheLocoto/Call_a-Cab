import Controller.TaxiTripControllerEXAMPLE;
import Model.TaxiTrip;
import View.TaxiTripView;

public class mainEXAMPLE {

    public static void main(String arg[]){

        TaxiTripControllerEXAMPLE taxiTripController= new TaxiTripControllerEXAMPLE();

        taxiTripController.requestTaxiTrip();
        taxiTripController.informationAboutTaxiTrip();

        taxiTripController.confirmTaxiTrip();
    }
}
