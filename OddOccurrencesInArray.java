import java.util.*;
import java.util.HashMap;
import java.util.Map;

class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : A) {
            if (map.containsKey(i))
                map.remove(i);
            else
                map.put(i, 1);
        }

        Map.Entry<Integer, Integer> entry = map.entrySet().iterator().next();
        return entry.getKey();
    }
}
