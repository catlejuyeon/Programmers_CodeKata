class Solution {
    public long solution(int a, int b) {
        int start = Math.min(a,b);
        int end = Math.max(a,b);
        long answer = ((long)end * (end + 1) / 2) - ((long)(start - 1) * start / 2);
        return answer;
    }
}