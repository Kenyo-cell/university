import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter Int");
        String intString = myScanner.next();
        int i = 1;
        try {
            i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }  catch (RuntimeException e) {
            System.err.println(e);
        } catch (Exception e){
            System.err.println("EEE" + e);
        }
        finally {
            System.out.println(i); 
        }
    }
}