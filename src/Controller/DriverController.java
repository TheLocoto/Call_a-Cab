package Controller;

import Model.Driver;
import View.DriverView;

public class DriverController {
    private Driver model;
    private DriverView view;

    public DriverController(Driver model, DriverView view) {
        this.model = model;
        this.view = view;
    }

    public String getDriverName() {
        return model.getName();
    }

    public void setDriverName(String name) {
        model.setName(name);
    }

    public int getDriverCi() {
        return model.getCi();
    }

    public void setDriverCi(int ci) {
        model.setCi(ci);
    }

    public int getDriverPhone() {
        return model.getPhone();
    }

    public void setDriverPhone(int phone) {
        model.setPhone(phone);
    }

    public int getDriverAge() {
        return model.getPhone();
    }

    public void setDriverAge(int age) {
        model.setAge(age);
    }

    public boolean isDriverAvailable() {
        return model.isAvailable();
    }

    public void setDriverAvailability(boolean availability) {
        model.setAvailability(availability);
    }

    public void updateDriverView()
    {
        view.printDriverView(model.getName(), model.getCi(), model.getPhone(), model.getAge());
    }
}
