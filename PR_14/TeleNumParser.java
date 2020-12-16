import java.lang.StringBuilder;

public class TeleNumParser {
    private String telNumber;
    
    public TeleNumParser(String number) {
        telNumber = number;
    }

    public String parse() {
        if (telNumber.length() < 11) return "Invalid input";
        int currentIndex = 0;

        StringBuilder reformat = new StringBuilder();

        reformat.append(telNumber.charAt(currentIndex++));
        if (telNumber.charAt(0) == '+') {
            reformat.append(telNumber.charAt(currentIndex++));
        }

        reformat.append("(");

        for (int i = 0; i < 3; i++) {
            reformat.append(telNumber.charAt(currentIndex++));
        }

        reformat.append(")");

        for (int i = 0; i < 3; i++) {
            reformat.append(telNumber.charAt(currentIndex++));
        }

        reformat.append("-");

        for (;currentIndex < telNumber.length();) {
            reformat.append(telNumber.charAt(currentIndex++));
        }

        return reformat.toString();
    }

    public String parse(String number) {
        telNumber = number;
        return parse();
    }
}
