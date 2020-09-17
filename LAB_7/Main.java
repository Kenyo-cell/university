public class Main {
    public static void main(String[] args) {
        ListArray<Integer> ar = new ListArray<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);

        ListArray<Integer> ra = new ListArray<>();
        ra.add(4);
        ra.add(5);
        ra.add(6);
        
        ar.addAll(ra);

        ra.addAll(2, ar);

        System.out.println(ar.indexOf(2));
        System.out.println(ar.lastIndexOf(2));

        System.out.println("_____________________");
        for (int i = 0; i < ra.size(); i++) {
            System.out.println(ra.get(i));
        }
    }
}