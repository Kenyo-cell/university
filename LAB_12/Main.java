import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean isDateInFormat(String date) {
        Pattern pattern = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1?[012])/((19|[2-9][0-9])\\d\\d)");
        Matcher matcher = pattern.matcher(date);
        String text = "";
        while (matcher.find()) {
            text = date.substring(matcher.start(), matcher.end());
        }
        return isDateValid(text);
    }

    public static boolean isDateValid(String date) {
        String[] text = date.split("/");

        int day = Integer.parseInt(text[0]);
        int month = Integer.parseInt(text[1]);
        int year = Integer.parseInt(text[2]);

        if (month == 2 && !is366(year)) return day <= 28;
        if (month != 1 || month != 3 || month != 5 ||
            month != 7 || month != 8 || month != 10 || month != 12) {
                return day <= 30;
            }
    
        return true;
    }

    public static boolean is366(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
             return true;
        } else if(year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String text = "30/4/1999";
        System.out.println(isDateInFormat(text));
    }
}