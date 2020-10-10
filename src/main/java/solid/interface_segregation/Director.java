package solid.interface_segregation;

public class Director implements CanSell, CanReport {
    public void report() {
        // reports;
    }

    public void sell() {
        // sells;
    }
}
