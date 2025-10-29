import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add(0, (int)(n % 10)); 
            n /= 10;
        }
        
        Collections.reverse(list); 
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}