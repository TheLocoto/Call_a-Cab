package DataBase;

import java.util.ArrayList;
import Model.Cab;

public class CabDataBase {

    private ArrayList<Cab> cabList;

    /**
     * This method is only for create a new list with cabList attribute.
     */
    public CabDataBase(){
        this.cabList = new ArrayList<>();
    }

    /**
     * This method is only to return the cab list.
     *
     * @return the cab list with or not availability.
     */
    public ArrayList<Cab> getCabList() {
        return cabList;
    }

    /**
     * This method is only for add a cab to cab list.
     *
     * @param cab the cab of type Cab class.
     */
    public void addCab(Cab cab){
        cabList.add(cab);
    }

    /**
     * This method is for instantiating and storing Cab objects in a list.
     * Each object sends different arguments and simulates a database in real life.
     */
    public void generateCabList(){
        Cab cab1 = new Cab("Toyota Corona", "94", "5323GFK",true);
        Cab cab2 = new Cab("Suzuki Swift", "80", "7453DFN",true);
        Cab cab3 = new Cab("Tesla", "S", "4363DFB",true);
        Cab cab4 = new Cab("Toyota Corona", "86", "2352HFG",true);
        Cab cab5 = new Cab("Suzuki Swift", "20", "3634NGD",true);
        Cab cab6 = new Cab("Quantum", "23", "6342ASD",true);
        Cab cab7 = new Cab("Toyota Corona", "01", "9634OPA",true);

        cabList.add(cab1);
        cabList.add(cab2);
        cabList.add(cab3);
        cabList.add(cab4);
        cabList.add(cab5);
        /*
        cabList.add(cab6);
        cabList.add(cab7);
         */
    }
}
