package Model;

public class Driver {
    private String name;
    private int ci;
    private int phone;
    private int age;
    private boolean availability;

    public Driver(String name, int ci, int phone, int age) {
        this.name = name;
        this.ci = ci;
        this.phone = phone;
        this.age = age;
        this.availability = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
