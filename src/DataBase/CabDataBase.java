package DataBase;

import java.util.ArrayList;
import Model.Cab;

public class CabDataBase {

    private ArrayList<Cab> cabList;

    /**
     * This method is only for creat a new list with cabList attribute.
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
        Cab cab1 = new Cab("Toyota Corona", "94", "5323GFK", 30, true);
        Cab cab2 = new Cab("Toyota Corona", "80", "7453DFN", 50, true);
        Cab cab3 = new Cab("Toyota Corona", "95", "4363DFB", 20, true);
        Cab cab4 = new Cab("Toyota Corona", "86", "2352HFG", 10, true);
        Cab cab5 = new Cab("Toyota Corona", "20", "3634NGD", 30, true);
        Cab cab6 = new Cab("Toyota Corona", "26", "6342ASD", 30, true);
        Cab cab7 = new Cab("Toyota Corona", "01", "9634OPA", 30, true);

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
