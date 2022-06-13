package Model;


/**
 * This class contains the necessary data of a taxi trip/ cab trip.
 * Takes care of declaring, initializing, saving its values and
 * being able to obtain them or setting all its TaxiTrip attributes.
 *
 * @autor The Negasonic Teenage Warhead .
 */
public class TaxiTrip {

    private int cost, passenger;
    private String address,destiny;


    /**
     * This method constructor is used for initialize the attributes in base the arguments received.
     * the passenger, address and destiny attributes are initialized based on the arguments
     * received in the parameters.
     *
     * @param passenger     the number of passengers
     * @param address       the first client localization.
     * @param destiny       the ultimate client localization.
     * @param cost          the cost of the trip.
     */
    public TaxiTrip(int passenger, String address, String destiny, int cost) {
        this.passenger = passenger;
        this.address = address;
        this.destiny = destiny;
    }

    /**
     * this method is the second constructor.
     * We use this taxiTrip constructor when we need ask the client information first.
     */
    public TaxiTrip(){
    }

    /**
     * This method returns the cost of the trip.
     *
     * @return  the trip/travel cost.
     */
    public int getCost() {
        return cost;
    }

    /**
     * This set method is used for to put a random number for the cost of the trip.
     * This is because the taxis ever give us a random cost.
     */
    public void setCost() {
        int randomCost = (int)Math.floor(Math.random() * (70 - 10 + 1 )+10);
        cost = randomCost;
    }

    /**
     * This method returns the number passenger of the trip.
     *
     * @return  the passenger number by trip.
     */
    public int getPassenger() {
        return passenger;
    }

    /**
     * This set method is used for to change the number of passenger.
     *
     * @param passenger the number of passenger.
     */
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    /**
     * This method returns the address passenger.
     *
     * @return  the address passenger. Is useful for know his location.
     */
    public String getAddress() {
        return address;
    }

    /**
     * This set method is used for to change the address of the passenger.
     *
     * @param address the address of passenger.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method returns the destiny of the passenger.
     *
     * @return  the destiny of the passenger.
     */
    public String getDestiny() {
        return destiny;
    }

    /**
     * This set method is used for to change the destiny of the passenger.
     *
     * @param destiny the destiny of passenger.
     */
    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }


}
