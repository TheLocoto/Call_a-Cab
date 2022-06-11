package Controller;

import Model.Cab;
import Model.CabsCentral;
import Model.TaxiTrip;
import View.CabView;
import View.CabsCentralView;
import View.DriverView;
import View.TaxiTripView;

import java.sql.Driver;

public class CallACabController {

    private TaxiTrip taxiTripModel;
    private TaxiTripView taxiTripView;
    private Cab cabModel;
    private CabView cabView;
    private Driver driverModel;
    private DriverView driverView;
    private CabsCentral cabsCentralModel;
    private CabsCentralView cabsCentralView;

    public CallACabController(){
        this.taxiTripModel=new TaxiTrip();
        this.taxiTripView=new TaxiTripView();
        this.cabModel=new Cab();
    }

}
