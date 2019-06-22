import java.util.HashMap;
import java.util.Map;

public class MapElementsCounter<E> {
    private Map<E, Integer> map = new HashMap();

    public MapElementsCounter(E [] array) {
        for (E elem : array) {
            map.put(elem, map.containsKey(elem) ? map.get(elem)+1 : 1);
        }
    }

    public Map<E, Integer> getMap() {
        return map;
    }
}
