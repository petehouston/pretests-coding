package mpp.k0219.problem02;


public class Employee {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private int salary;

    public Employee(String name, String street, String city, String state, String zip, int salary) {
        super();
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name;
    }
}

