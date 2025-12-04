import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> fame = new PriorityQueue<>(); 

        for (int i = 0; i < score.length; i++) {
            if (fame.size() < k) {
                fame.add(score[i]); 
            } else {
                if (score[i] > fame.peek()) {
                    fame.poll();
                    fame.add(score[i]);
                }
            }
            answer[i] = fame.peek(); 
        }
        return answer;
    }
}