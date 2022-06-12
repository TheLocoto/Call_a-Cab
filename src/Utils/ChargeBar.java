package Utils;

import java.util.concurrent.TimeUnit;

public class ChargeBar {

    public ChargeBar(){

    }

    public void chargeBar(){
        int randomNumber = (int)(Math.random() * 20-10+1) + 10;
        try {
            for (int counter = 0; counter < randomNumber; counter++) {
                TimeUnit.MILLISECONDS.sleep(0);
                System.out.print("=");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("=");
    }
}


