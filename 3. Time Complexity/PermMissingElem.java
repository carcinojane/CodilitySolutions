class PermMissingElem {
    public int solution(int[] A) {
        long length = A.length;
        long sum = 0;
        for (int i : A)
            sum += i;
        long total = (length + 1) * (length + 2) / 2;

        return (int) ((int) total - sum);
    }
}