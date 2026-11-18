package productapp;

public class ProductCalculations implements IProductCalculations {

    private double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVat() {
        return price * 0.15;
    }

    @Override
    public double Getcommission() {
        return price * 0.05;
    }

    @Override
    public double GetTOtal() {
        return price + GetVat() + Getcommission();
    }
}