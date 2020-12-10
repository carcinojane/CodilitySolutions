import java.util.*;
//find question at https://app.codility.com/programmers/lessons/2-arrays/

class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // initialize variables
        Integer maxLength, maxIndex;
        maxLength = A.length;
        maxIndex = maxLength - 1;

        // Create empty array for re-arranged int[]
        int[] newArr = new int[maxLength];

        if (maxLength == 0 || maxIndex == 0 || // Filter out (1)Array contains less than 2,
                K == maxLength || K % maxLength == 0 // (2)Rotation results in the same order,
                || K == 0) // K=0
            return A;

        // get number of necessary rotations
        Integer Kr = K > maxLength ? K % maxLength : K;

        for (int i = 0; i < maxLength; i++) {
            // get new index of items
            Integer newIndex = i + Kr > maxIndex ? i + Kr - maxIndex - 1 : i + Kr;
            // add to new array
            newArr[newIndex] = A[i];
        }
        return newArr;
    }
}