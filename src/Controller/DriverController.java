package Controller;

import Model.Driver;
import View.DriverView;

/**
 * This class is used to control the class Driver.
 *
 * @author The Negasonic Teenage Warhead
 */
public class DriverController {
    private Driver model;
    private DriverView view;

    /**
     * This is a constructor method, to initialize the model and view of Driver.
     * Initialize the Driver class that is in the Model package and the DriverView class that is in the View package.
     *
     * @param model This is the class model of driver type.
     * @param view  This is the class view of driver type.
     */
    public DriverController(Driver model, DriverView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * This method is used to know the driver's name.
     *
     * @return  the name of driver.
     */
    public String getDriverName() {
        return model.getName();
    }

    /**
     * This set method is used for to set the name of driver.
     *
     * @param name the name of driver. Is useful to identify it.
     */
    public void setDriverName(String name) {
        model.setName(name);
    }

    /**
     * This method is to get the ci number of driver.
     *
     * @return  the ci of driver.
     */
    public int getDriverCi() {
        return model.getCi();
    }

    /**
     * This set method is used for to set the ci of driver.
     *
     * @param  ci the ci of driver.
     */
    public void setDriverCi(int ci) {
        model.setCi(ci);
    }

    /**
     * This method getPhone is for know his phone driver.
     *
     * @return  the number phone of driver.
     */
    public int getDriverPhone() {
        return model.getPhone();
    }

    /**
     * This set method is used for to set or change the number of driver.
     *
     * @param  phone the phone number of driver.
     */
    public void setDriverPhone(int phone) {
        model.setPhone(phone);
    }

    /**
     * This method getAge is for know his age driver.
     *
     * @return  the oge of driver.
     */
    public int getDriverAge() {
        return model.getPhone();
    }

    /**
     * This set method is used for to set or change the age of driver.
     *
     * @param   age the age of driver.
     */
    public void setDriverAge(int age) {
        model.setAge(age);
    }

    /**
     * This method is to check if the driver is availability or not.
     *
     * @return the current available state of driver.
     */
    public boolean isDriverAvailable() {
        return model.isAvailable();
    }

    /**
     * This method set the if the driver will availability or not.
     *
     * @param availability  the current state availability of driver.
     */
    public void setDriverAvailability(boolean availability) {
        model.setAvailability(availability);
    }

    /**
     * This method is used for the driver view and update its show.
     */
    public void updateDriverView()
    {
        view.printDriverView(model.getName(), model.getCi(), model.getPhone(), model.getAge());
    }
}
