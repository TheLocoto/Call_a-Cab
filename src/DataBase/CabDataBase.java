package DataBase;

import java.util.ArrayList;
import Model.Cab;

public class CabDataBase {

    private ArrayList<Cab> cabList;

    public CabDataBase(){
        this.cabList = new ArrayList<>();
    }

    public ArrayList<Cab> getCabList() {
        return cabList;
    }

    public void addCab(Cab cab){
        cabList.add(cab);
    }

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
        /*cabList.add(cab4);
        cabList.add(cab5);*/
        /*
        cabList.add(cab6);
        cabList.add(cab7);
         */
    }
}
