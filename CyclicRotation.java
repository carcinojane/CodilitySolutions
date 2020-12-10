import java.util.*;

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        Integer maxLength, maxIndex;

        maxLength = A.length;
        maxIndex = maxLength - 1;
        int[] newArr = new int[maxLength];

        if (K == maxLength || maxLength == 0 || maxIndex == 0 || K % maxLength == 0)
            return A;

        Integer Kr = K > maxLength ? K % maxLength : K;

        for (int i = 0; i < maxLength; i++) {
            Integer newIndex = i + Kr > maxIndex ? i + Kr - maxIndex - 1 : i + Kr;
            newArr[newIndex] = A[i];
        }
        return newArr;
    }
}