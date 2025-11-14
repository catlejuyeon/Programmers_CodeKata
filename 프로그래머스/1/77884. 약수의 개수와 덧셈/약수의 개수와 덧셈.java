class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for (int n = left; n <= right; n++) {
            int sqn = (int)Math.sqrt(n);

            if (sqn * sqn==n) {
                sum -= n;
            } else {
                sum += n;
            }
        }

        return sum;
    }
}