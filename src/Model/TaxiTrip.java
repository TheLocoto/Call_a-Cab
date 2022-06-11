package Model;

/**
 * Taxi Trip class
 * In this class we create a trip for a taxi
 */
public class TaxiTrip {

    private int cost, passenger;
    private String address,destiny;

    /**
     * TaxiTrip first constructor
     * We use this TaxiTrip constructor when we dont need ask the client information
     * @param passenger the number of passengers
     * @param address the first client localitation
     * @param destiny the ultimate client localitation
     * @param cost the cost of the trip
     */
    public TaxiTrip(int passenger, String address, String destiny, int cost) {
        this.passenger = passenger;
        this.address = address;
        this.destiny = destiny;
    }

    /**
     * TaxiTrip second constructor
     * We use this taxiTrip constructor when we need ask the client information first
     */
    public TaxiTrip(){
    }

    /**
     * getCost method
     * this method return the cost of the trip
     * @return cost of the trip
     */
    public int getCost() {
        return cost;
    }

    /**
     * setCost method
     * This method create a random cost for the trips
     * This is because the taxis ever give us a random cost
     */
    public void setCost() {
        int randomCost = (int)Math.floor(Math.random() * (70 - 10 + 1 )+10);
        cost = randomCost;
    }

    /**
     * getPassenger method
     * This method give us the number of passengers in a trip
     * @return passengers  number
     */
    public int getPassenger() {
        return passenger;
    }

    /**
     * setPassenger method
     * This method change the number of passengers
     * @param passenger the number of passengers
     */
    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }


    /**
     * getAddress method
     * This method give us the address of the client
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * setAddress method
     * this method change the address of the client
     * @param address of the client
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *getDestiny method
     * This method give us the destiny of the client
     * @return destiny
     */
    public String getDestiny() {
        return destiny;
    }

    /**
     * setDestiny method
     * This method change the destiny of the client
     * @param destiny of the client
     */
    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }


}
