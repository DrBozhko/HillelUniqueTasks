package solid.open_closed;

public class Shop {
    private String address;
    private String company;
    private int capacity;

    public Shop(String address, String company, int capacity) {
        this.address = address;
        this.company = company;
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
