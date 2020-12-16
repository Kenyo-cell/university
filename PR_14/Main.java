public class Main {
    public static void main(String[] args) {
        String number = "88005553535";

        TeleNumParser parser = new TeleNumParser(number);

        System.out.println(parser.parse());
    }
}