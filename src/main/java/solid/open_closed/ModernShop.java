package solid.open_closed;

public class ModernShop extends Shop{
    private int percentageOfTaxes;

    public ModernShop(String address, String company, int capacity, int percentageOfTaxes) {
        super(address, company, capacity);
        this.percentageOfTaxes = percentageOfTaxes;
    }

    public int getPercentageOfTaxes() {
        return percentageOfTaxes;
    }

    public void setPercentageOfTaxes(int percentageOfTaxes) {
        this.percentageOfTaxes = percentageOfTaxes;
    }
}
