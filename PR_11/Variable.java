public class Variable implements Result {
    private String var;

    public Variable(String var) {
        this.var = var;
    }

    @Override
    public double extract(double value) {
        return value;
    }

    public String toString() {
        return var;
    }
}
