public class Multiply extends Binary{
    public Multiply(Result first, Result second) {
        super(first, second);
    }

    @Override
    public double extract(double value) {
        return first.extract(value) * second.extract(value);
    }

    public String toString() {
        return first.toString() + " * " + second.toString();
    }
}
