package Controller;

import Model.TaxiTrip;
import View.TaxiTripView;

/**
 * This class contains necessary data of a taxi trip controller.
 * Takes care of declaring, initializing, saving its values and
 * being able to obtain them or setting all its cab attributes
 *
 * @author The Negasonic Teenage Workhead.
 */
public class TaxiTripController {

    private TaxiTrip model;
    private TaxiTripView view;

    /**
     * This constructor method of taxi trip controller, initialize the model and view of taxi trip
     */
    public TaxiTripController() {
        this.model = new TaxiTrip();
        this.view = new TaxiTripView();
    }

    /**
     * This method is used for to set the cost of a taxi trip.
     */
    public void setTaxiTripCost(){
        model.setCost();
    }

    /**
     * This method is used only to return the taxi trip cost.
     *
     * @return the cost of taxi trip model.
     */
    public int getTaxiTripCost(){
        return model.getCost();
    }

    /**
     * This method is used for to set the number of passengers in a taxi trip.
     *
     * @param passengers the new number of passengers into a taxi trip.
     */
    public void setTaxiTripPassengers(int passengers){
        model.setPassenger(passengers);
    }

    /**
     * This method is used only to return the number of passengers into a taxi trip.
     *
     * @return the number os passengers into taxi trip model.
     */
    public int getTaxiTripPassengers(){
        return model.getPassenger();
    }

    /**
     * This method is used for to set the destiny of a taxi trip.
     *
     * @param destiny the new destiny of a taxi trip.
     */
    public void setTaxiTripDestiny(String destiny){
        model.setDestiny(destiny);
    }

    /**
     * This method is used only to return the destiny of a taxi trip.
     *
     * @return the destiny of taxi trip model.
     */
    public String getTaxiTripDestiny(){
        return model.getDestiny();
    }

    /**
     * This method is used for to set the address of a taxi trip.
     *
     * @param address the new address of a taxi trip.
     */
    public void setTaxiTripAddress(String address){
        model.setAddress(address);
    }

    /**
     * this method is used only to return the address of a taxi trip
     *
     * @return the address of taxi trip model.
     */
    public String getTaxiTripAddress(){
        return model.getAddress();
    }

    /**
     * This method is used to display customer data
     */
    public void informationAboutTaxiTrip(){
        view.printTaxiTripDetails(getTaxiTripDestiny(),getTaxiTripAddress(),getTaxiTripPassengers(),getTaxiTripCost());
    }

    /**
     * This method is used to request the data from the client and update them within the taxi trip
     */
    public void requestTaxiTrip(){
        view.taxiTripRequestMessage();
        String address = view.enterAddressMessage();
        setTaxiTripAddress(address);
        String destiny = view.enterDestinyMessage();
        setTaxiTripDestiny(destiny);
        int passengers = view.enterPassengersMessage();
        while (passengers>5) {
            view.validatePassengersMessage();
            passengers = view.enterPassengersMessage();
        }
        setTaxiTripPassengers(passengers);
        setTaxiTripCost();
    }

    /**
     * This method is used for when the client wants to ask again to enter their data
     * this method is different from the previous one since it resets the scanner before requesting the data
     * again so as not to have errors
     */
    public void requestTaxiTripAgain() {
        view.requestTaxiTripAgain();
        requestTaxiTrip();
    }

    /**
     * This method is used to show the options menu to the user so that he can choose one
     * the method creates a loop until the user is satisfied with the data.
     */
    public void confirmTaxiTrip(){
        informationAboutTaxiTrip();
        int option = view.menuTaxiTripMessage();
        while(option!=1) {
            incorrectDates(option);
            incorrectPrice(option);
            incorrectAnswer(option);
            option = view.menuTaxiTripMessage();
        }
        view.finishMessage();
    }

    /**
     * This method is used when the user wants to enter his data again
     *
     * @param option the option that the user previously chose
     */
    public void incorrectDates(int option){
        if (option==3){
            requestTaxiTripAgain();
            informationAboutTaxiTrip();
        }
    }

    /**
     * This method is used when the user wants the cost to be different
     *
     * @param option the option that the user previously chose
     */
    public void incorrectPrice(int option){
        if (option==2){
            setTaxiTripCost();
            informationAboutTaxiTrip();
        }
    }

    /**
     * This method is used when the user enters a non-existent option
     *
     * @param option the option that the user previously chose
     */
    public void incorrectAnswer(int option){
        if (option > 3){
            view.incorrectAnswer();
        }
    }

    /**
     * This method is used to create the taxi trip
     * makes use of requestTaxiTrip and confirmTaxiTrip
     */
    public void createTaxiTrip(){
        requestTaxiTrip();
        confirmTaxiTrip();
    }

    /**
     * This method is used when the client asks to create or request another taxi trip
     * the difference between this method and its similar one is that it again resets the scanner to avoid problems.
     */
    public void createMoreTaxiTrips(){
        requestTaxiTripAgain();
        confirmTaxiTrip();
    }

    /**
     * This method is used to obtain the taxi trip once it has been updated
     *
     * @return the taxi trip model.
     */
    public TaxiTrip getTaxiTrip(){
        return model;
    }

    /**
     * This method is used to update or modify the taxi trip model
     *
     * @param taxiTrip the new taxi trip model
     */
    public void setModel(TaxiTrip taxiTrip) { model = taxiTrip;}

    /**
     * This method we summarize all the controller of the taxi trip
     * We ask for a number that must be equal to 0 in order to create a taxi trip for the first time.
     * Once the counter is created, it will be increased to 1. If the counter is greater than one,
     * it means that the user has already requested a taxi more than once. taxi trip and makes use of the
     * reset scanner to avoid conflicts.
     *
     * @param requests the number of taxi trips created
     * @return the new number of taxi trips created
     */
    public int taxiTrip(int requests){
        if (requests==0) {
            createTaxiTrip();
            requests++;
        }
        else{
            createMoreTaxiTrips();
        }
        return requests;
    }

}
