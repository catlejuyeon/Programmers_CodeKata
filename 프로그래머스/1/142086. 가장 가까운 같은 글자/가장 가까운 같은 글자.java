import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] lastIndex = new int[26]; 
        Arrays.fill(lastIndex, -1); 

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';

            if (lastIndex[c] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex[c];
            }

            lastIndex[c] = i;
        }

        return answer;
    }
}