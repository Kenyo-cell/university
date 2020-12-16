import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isRightPass(String pass) {
        Pattern pattern = Pattern.compile("(?=.*[0-9])(._*)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}");
        Matcher matcher = pattern.matcher(pass);
        String text = "";
        while (matcher.find()) {
            text = pass.substring(matcher.start(), matcher.end());
        }
        return !text.equals("");
    }


    public static void main(String[] args) {
        String text = "10562346Vad";
        System.out.println(isRightPass(text));
    }
}