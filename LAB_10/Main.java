public class Main {
    public static <E> E get(E[] arr, int index) {
        return arr[index];
    }  
    public static void main(String[] args) {
        Integer[] i = {1, 2, 3};
        System.out.println(get(i, 2));
    }
}