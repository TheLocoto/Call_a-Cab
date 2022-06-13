package Utils;

import java.util.concurrent.TimeUnit;

public class CarTour {

    /**
     * This constructor method is used for create and initialize the object.
     */
    public CarTour(){
    }

    /**
     * This method is for show the car in try, if counter%n == 0, otherwise not.
     */
    public void carTour(){
        int randomNumber = (int)(Math.random() * 10-5+1) + 5;
        try {
            for (int counter = 0; counter < randomNumber; counter++) {
                TimeUnit.SECONDS.sleep(1);
                if ((counter%3)==0) {
                    System.out.println("──▄▄▐▀▀▀▀▀▀▀▀▀▀▀▌▄▄──");
                    System.out.println("─▄▄▄█▄▄▄▄▄▄▄▄▄▄▄█▄▄▄─");
                    System.out.println("─█▄█░░█▓█▓█▓█▓█░░█▄█▌");
                    System.out.println("─▓▓█▀███████████▀█▓▓──");
                    System.out.println("─▓▓▀▀───────────▀▀▓▓──");
                }
                else{
                    System.out.println("░░░░░░░░░███░░░░░░░░░");
                    System.out.println("░░░░░░░░░███░░░░░░░░░");
                    System.out.println("░░░░░░░░░███░░░░░░░░░");
                    System.out.println("░░░░░░░░░███░░░░░░░░░");
                    System.out.println("░░░░░░░░░███░░░░░░░░░");
                }
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
