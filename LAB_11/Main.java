import java.io.File;

public class Main {
    public static void get5PosFromDirectory(String path) {
        File dir = new File(path);
        String[] list = dir.list();
        for (int i = 0; i < 5 && i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    
    public static void main(String[] args) {
        get5PosFromDirectory("D:\\progs\\java\\university");
    }
}