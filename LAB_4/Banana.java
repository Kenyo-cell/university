public class Banana implements Pricable {
    private double price;
    public Banana(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
