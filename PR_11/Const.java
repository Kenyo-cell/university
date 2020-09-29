public class Const implements Result {
    private double value;

    public Const(double value) {
        this.value = value;
    }

    @Override
    public double extract(double value) {
        return this.value;
    }

    public String toString() {
        return this.value + "";
    }
}
