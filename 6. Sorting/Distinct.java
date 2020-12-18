import java.util.HashSet;
import java.util.Set;
//import java.util.HashSet;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Distinct {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i : A)
            set.add(i);
        return set.size();
    }
}
