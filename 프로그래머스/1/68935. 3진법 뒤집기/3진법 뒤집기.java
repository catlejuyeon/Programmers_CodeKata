class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            int three = n % 3;      
            answer = answer * 3 + three; 
            n /= 3;                
        }
        return answer;
    }
}