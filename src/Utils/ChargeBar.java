package Utils;

import java.util.concurrent.TimeUnit;

public class ChargeBar {

    /**
     * This constructor method is only for creat an object of the class ChargeBar.
     */
    public ChargeBar(){
    }

    /**
     * this method is to display the simulation loads until the message we will send is finished.
     */
    public void chargeBar(){
        int randomNumber = (int)(Math.random() * 20-10+1) + 10;
        try {
            for (int counter = 0; counter < randomNumber; counter++) {
                TimeUnit.MILLISECONDS.sleep(250);
                System.out.print("=");
            }
        }catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("=");
    }
}


