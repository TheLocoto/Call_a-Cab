package View;

public class CabView {

    /**
     * This method shows the information of the taxi.
     *
     * This method uses escape characters like "\n" and "\t", to make it look aesthetic in the console.
     *
     * @param brand        this is the name of the car.
     * @param model        this is the model of the car.
     * @param licensePlate this is the license Plate of the car.
     * @param fuelLevel    this is the fuel Level of the Car.
     * @param availability indicates the status of the taxi.
     */
    public void showInfoTaxi(String brand, String model, String licensePlate, boolean availability, int fuelLevel) {
        System.out.println("\n" + "\t" + "Brand: " + brand);
        System.out.println("\t" + "Model: " + model);
        System.out.println("\t" + "License Plate: " + licensePlate);
        System.out.println("\t" + "Fuel Level: " + fuelLevel + " Litros");
        System.out.println("\t" + "Availability: " + availability);
    }
}
