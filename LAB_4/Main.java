public class Main {

    public static void main(String[] args) {
	    Pricable p1 = new Banana(10.99);
	    Pricable p2 = new Tomato(8.25);

        System.out.println(p1.getPrice());
        System.out.println(p2.getPrice());
    }
}
