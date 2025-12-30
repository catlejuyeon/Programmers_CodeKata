class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int h = 1; h <= yellow; h++) {
            if (yellow % h == 0) { 
                int w = yellow / h;  
          
                int height = h + 2;
                int width = w + 2;
                
                if (width * height - yellow == brown) {
                    if (width >= height) {
                        answer[0] = width;
                        answer[1] = height;
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}