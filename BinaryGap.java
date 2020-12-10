public class BinaryGap {
    // find question at
    // https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
    public int solution(int N) {
        Integer max, count;
        max = 0;
        count = 0;

        // convert int to binary string
        String stringN = Integer.toBinaryString(N);
        for (int i = 0; i < stringN.length(); i++) {
            if (stringN.charAt(i) == '0')
                count++;
            if (stringN.charAt(i) != '0') {
                max = count > max ? count : max;
                count = 0;
            }
        }
        return max;
    }

}
