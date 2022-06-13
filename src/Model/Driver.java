package Model;

/**
 * This class contains necessary data of a Driver.
 * Takes care of declaring, initializing, saving its values and
 * being able to obtain them or setting all its Driver attributes.
 *
 * @author The Negasonic Teenage Warhead .
 */
public class Driver {
    private String name;
    private int ci;
    private int phone;
    private int age;
    private boolean availability;


    /**
     * This method constructor is used for initialize the attributes in base the parameters.
     * All attributes are initialized based on the arguments received in the parameters.
     *
     * @param name          the name of driver.
     * @param ci            the ci of driver.
     * @param phone         the number phone of driver.
     * @param age           the age of driver.
     * @param availability  the current availability of driver.
     */
    public Driver(String name, int ci, int phone, int age, boolean availability) {
        this.name = name;
        this.ci = ci;
        this.phone = phone;
        this.age = age;
        this.availability = availability;
    }

    /**
     * This method is used to know the driver's name.
     *
     * @return  the name of driver.
     */
    public String getName() {
        return name;
    }

    /**
     * This set method is used for to set the name of driver.
     *
     * @param name the name of driver. Is useful to identify it.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method is to get the ci number of driver.
     *
     * @return  the ci of driver.
     */
    public int getCi() {
        return ci;
    }

    /**
     * This set method is used for to set the ci of driver.
     *
     * @param  ci the ci of driver.
     */
    public void setCi(int ci) {
        this.ci = ci;
    }

    /**
     * This method getPhone is for know his phone driver.
     *
     * @return  the number phone of driver.
     */
    public int getPhone() {
        return phone;
    }

    /**
     * This set method is used for to set or change the number of driver.
     *
     * @param  phone the phone number of driver.
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * This method getAge is for know his age driver.
     *
     * @return  the oge of driver.
     */
    public int getAge() {
        return age;
    }

    /**
     * This set method is used for to set or change the age of driver.
     *
     * @param   age the age of driver.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method isAvailable is for know if it's availability or not the driver.
     *
     * @return  the current availability of driver.
     */
    public boolean isAvailable() {
        return availability;
    }

    /**
     * This set method is used for to set the current availability of driver.
     *
     * @param availability
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
