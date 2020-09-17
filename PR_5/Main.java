public class Main {
    public static void TriangleRecurrent(int n) {
        if (n == 0) return;
        TriangleRecurrent(n - 1);
        for (int i = 0; i < n; i++){
            System.out.print(n);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TriangleRecurrent(9);
    }
}