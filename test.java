import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    private void permutate(List<int[]> combinations, int data[], int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            permutate(combinations, data, start + 1, end, index + 1);
            permutate(combinations, data, start + 1, end, index);
        }
    }

    public List<int[]> generate(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        permutate(combinations, new int[r], 0, n - 1, 0);
        return combinations;
    }

    List<int[]> combinations = generate(N, R);for(
    int[] combination:combinations)
    {
        System.out.println(Arrays.toString(combination));
    }System.out.printf("generated %d combinations of %d items from %d ",combinations.size(),R,N);

}
