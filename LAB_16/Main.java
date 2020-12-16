import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lst = new CycleList<>();
        lst.add("Jopa");
        lst.add("Her");
        lst.add("Mocha");

        System.out.println(lst.get(1));
        System.out.println(lst.size());
        System.out.println(lst.remove(0));
        System.out.println(lst.size());
    }
}