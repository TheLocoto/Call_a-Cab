package Utils;

import java.util.concurrent.TimeUnit;

public class ChargeBar {

    public ChargeBar(){

    }

    public void chargeBar(){
        int randomNumber = (int)(Math.random() * 20-20+1) + 10;
        try {
            for (int counter = 0; counter < randomNumber; counter++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print("=");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("=");
    }
}


