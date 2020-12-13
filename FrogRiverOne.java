public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int[] positions = new int[X + 1];
        int jumpCount = X;

        for (int i = 0; i < A.length; i++) {
            if (positions.length >= A[i]) {
                if (positions[A[i]] == 0)
                    jumpCount--;
            }
            if (jumpCount == 0)
                return i;
            positions[A[i]] = A[i];
        }
        return -1;
    }

}
