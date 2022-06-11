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
        Cab cab1 = new Cab("Toyota Corona", "94", "5323GFK", 30, false);
        Cab cab2 = new Cab("Toyota Corona", "80", "7453DFN", 50, false);
        Cab cab3 = new Cab("Toyota Corona", "95", "4363DFB", 20, false);
        Cab cab4 = new Cab("Toyota Corona", "86", "2352HFG", 10, false);
        Cab cab5 = new Cab("Toyota Corona", "2000", "3634NGD", 30, false);

        addCab(cab1);
        addCab(cab2);
        addCab(cab3);
        addCab(cab4);
        addCab(cab5);
    }
}
