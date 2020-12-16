import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Soulution {
    public <T> ArrayList<T> newArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public <T> HashSet<T> newHashSet(T[] array) {
        return new HashSet<>(Arrays.asList(array));
    }

    public <K, V> HashMap<K, V> newHashMap(K[] keys, V[] values) {
        HashMap<K, V> map = new HashMap<>();
        int size = keys.length > values.length ? values.length : keys.length;
        for (int i = 0; i < size; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }
}
