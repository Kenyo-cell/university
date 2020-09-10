public class Tomato implements Pricable {
    private double price;
    public Tomato(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
