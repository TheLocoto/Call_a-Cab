import Controller.TaxiTripControllerEXAMPLE;
import Model.TaxiTrip;
import View.TaxiTripView;

public class mainEXAMPLE {

    public static void main(String arg[]){

        TaxiTripView taxiTripView = new TaxiTripView();
        TaxiTrip taxiTripModel = new TaxiTrip(3,"cochabamba","santa cruj");
        TaxiTrip taxiExample = taxiTripView.taxiTripDates();

        TaxiTripControllerEXAMPLE taxiTripController= new TaxiTripControllerEXAMPLE(taxiTripModel,taxiTripView);

        taxiTripController.informationAboutTaxi();

    }
}
