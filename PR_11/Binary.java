public abstract class Binary implements Result{
    protected Result first;
    protected Result second;

    public Binary(Result first, Result second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public double extract(double value) {
        return 0;
    }
}
