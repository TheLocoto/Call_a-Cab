package DataBase;

import Model.TaxiTrip;

import java.util.ArrayList;

public class TaxiTripDataBase {

    private ArrayList<TaxiTrip> taxiTripsList;

    public TaxiTripDataBase(){
        this.taxiTripsList = new ArrayList<>();
    }

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

    public ArrayList<TaxiTrip> getTaxiTripsList() {
        return taxiTripsList;
    }

    public void setTaxiTripsList(ArrayList<TaxiTrip> taxiTripsList) {
        this.taxiTripsList = taxiTripsList;
    }

    public void addTaxiTrip(TaxiTrip taxiTrip){
        taxiTripsList.add(taxiTrip);
    }
}
