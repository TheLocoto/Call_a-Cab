package Utils;

import java.util.concurrent.TimeUnit;

public class CarTour {

    public CarTour(){

    }

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
