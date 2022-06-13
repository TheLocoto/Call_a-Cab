import Controller.CallACabController;

/**
 * <h1>This is the main class where the app will run.</h1>
 *
 * @author The Negasonic Teenage Warhead
 */
public class main {

    /**
     * This main method is where the app will run.
     * instance to CallACabController for it to run the callACabClientApp method later.
     *
     * @param arg
     */
    public static void main(String arg[]){

        CallACabController callACabController = new CallACabController();
        callACabController.callACabClientApp();

    }
}
