import Controller.CabsCentralController;
import Controller.TaxiTripControllerEXAMPLE;
import Model.Cab;
import Model.CabsCentral;
import Model.Driver;
import Model.TaxiTrip;
import View.CabsCentralView;
import View.TaxiTripView;

import java.util.ArrayList;

public class mainEXAMPLE {
    public static ArrayList<Cab> cabsDatabase(){
        ArrayList<Cab> cabsList = new ArrayList<>();
        Cab cab1 = new Cab("123-abc",100,true);
        Cab cab2 = new Cab("321-xyz",50,true);
        cabsList.add(cab1);
        cabsList.add(cab2);

        return cabsList;
    }
    public static ArrayList<Driver> driversDatabase(){
        ArrayList<Driver> driversList = new ArrayList<>();
        Driver driver1 = new Driver("Juan",35,12345,73124590,true);
        driversList.add(driver1);
        return driversList;
    }
    public static void main(String arg[]){


        //Instance of Taxi Trip
        TaxiTripView taxiTripView = new TaxiTripView();
        TaxiTrip taxiTripModel = new TaxiTrip();
        TaxiTripControllerEXAMPLE taxiTripController= new TaxiTripControllerEXAMPLE(taxiTripModel,taxiTripView);

        //Instance of Cabs Central
        CabsCentral cabsCentralModel = new CabsCentral(cabsDatabase(),driversDatabase());
        CabsCentralView cabsCentralView = new CabsCentralView();
        CabsCentralController cabsCentralController = new CabsCentralController(cabsCentralModel, cabsCentralView);


            cabsCentralController.showWelcome();
            taxiTripController.requestTaxiTrip();
            taxiTripController.informationAboutTaxi();

            //logic to confirm the taxiTrip

            cabsCentralView.showTaxiTripStatusMessage(cabsCentralController.sendAssignedCabCabsCentral(/*taxiTrip*/));



    }
}
