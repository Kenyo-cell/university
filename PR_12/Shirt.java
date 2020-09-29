import java.util.HashMap;
import java.util.Map;

public class Shirt {
    private Map<String, String> map;
    public static final String[] attributes = {
        "model", "name", "color", "size"
    };

    public Shirt(String[] info) {
        map = new HashMap<String, String>();
        for (int i = 0; i < attributes.length; i++) {
            map.put(attributes[i], info[i]);
        }
    }

    public String toString() {
        return String.format("%-5s  %-20s  %-10s  %s",
            map.get("model"), map.get("name"), map.get("color") ,map.get("size"));
    }
}
