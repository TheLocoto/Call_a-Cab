package Model;

public class TaxiTrip {

    private int cost, passenger;
    private String address,destiny;

    public TaxiTrip(int passenger, String address, String destiny) {
        this.passenger = passenger;
        this.address = address;
        this.destiny = destiny;
    }
    public TaxiTrip(){
    }

    public int getCost() {
        return cost;
    }

    public void setCost() {
        int randomCost = (int)Math.floor(Math.random() * (70 - 10 + 1 )+10);
        cost = randomCost;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }
}
