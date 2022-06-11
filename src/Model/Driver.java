package Model;

/**
 * This mani class Driver uses for management thing like tha data drivers
 * and also for assign driver to one client.
 */
public class Driver {
    private String name;
    private int ci;
    private int phone;
    private int age;
    private boolean availability;


    /**
     * This class constructor Driver is uses for initialize attributes name,ci,phone
     * age and availability, assigned it for the different objects.
     * @param name is for identify the subject for his name.
     * @param ci is for identify the subject.
     * @param phone is for call it and assign to client.
     * @param age is for know if is grown-up and can drive.
     * @param availability id for know if it's busy or no.
     */
    public Driver(String name, int ci, int phone, int age, boolean availability) {
        this.name = name;
        this.ci = ci;
        this.phone = phone;
        this.age = age;
        this.availability = availability;
    }

    /**
     * This method getName is for know his name driver.
     * @return  name
     */
    public String getName() {
        return name;
    }

    /**
     * This method setName is for put his name driver.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method getCi is for know his ci driver.
     * @return  ci
     */
    public int getCi() {
        return ci;
    }

    /**
     * This method setCi is for put his ci driver.
     * @param  ci
     */
    public void setCi(int ci) {
        this.ci = ci;
    }

    /**
     * This method getPhone is for know his phone driver.
     * @return  phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * This method setPhone is for put his phone driver.
     * @param  phone
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * This method getAge is for know his age driver.
     * @return  age
     */
    public int getAge() {
        return age;
    }

    /**
     * This method setAge is for put his age driver.
     * @param   age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method isAvailable is for know if it's availability or no the driver.
     * @return  availability
     */
    public boolean isAvailable() {
        return availability;
    }

    /**
     * This method setAvailability is for put if it's availability or no the driver.
     * @@param availability
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
