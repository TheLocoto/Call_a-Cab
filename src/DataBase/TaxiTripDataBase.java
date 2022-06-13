package DataBase;

import Model.TaxiTrip;

import java.util.ArrayList;

/**
 * This class is for instantiating and storing TaxiTrip objects in a list.
 * Each object sends different arguments and simulates a database in real life,
 * the arguments indicates the customer's travel data.
 */
public class TaxiTripDataBase {

    private ArrayList<TaxiTrip> taxiTripsList;
    public TaxiTripDataBase(){
        this.taxiTripsList = new ArrayList<>();
    }

    /**
     * This method is for instantiating and storing Taxi Trips objects in a list.
     * Each object sends different arguments and simulates a database in real life,
     * all the arguments are to view customer data.
     */
    public void generateTaxiTripsList() {
        TaxiTrip firstTrip = new TaxiTrip(3, "Circunvalacion esq. Robles", "Terminal de buses", 20);
        TaxiTrip secondTrip = new TaxiTrip(2, "Atahuallpa esq. Semapa", "Hupermall", 15);
        TaxiTrip thirdTrip = new TaxiTrip(1, "Universidad Salesiana", "Boliche Noma", 50);
        TaxiTrip fourthTrip = new TaxiTrip(4, "Jalasoft", "Plaza Bolivar - Quillacollo", 40);
        TaxiTrip fifthTrip = new TaxiTrip(2,"Colegio Maryknoll" , "CBA",20);

        taxiTripsList.add(firstTrip);
        taxiTripsList.add(secondTrip);
        taxiTripsList.add(thirdTrip);
        taxiTripsList.add(fourthTrip);
        taxiTripsList.add(fifthTrip);
    }

    /**
     * This method is used to return the taxi trips list.
     *
     * @return The taxi trips list.
     */
    public ArrayList<TaxiTrip> getTaxiTripsList() {
        return taxiTripsList;
    }

    /**
     * This set method is used to assign a taxiTripsList argument to this taxiTripsList parameter.
     *
     * @param taxiTripsList the taxi trips list.
     */
    public void setTaxiTripsList(ArrayList<TaxiTrip> taxiTripsList) {
        this.taxiTripsList = taxiTripsList;
    }

    /**
     * This method is used only to add a class Taxi Trip to a taxi trips list.
     */
    public void addTaxiTrip(TaxiTrip taxiTrip){
        taxiTripsList.add(taxiTrip);
    }
}
