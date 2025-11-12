class Solution {
    public String solution(int n) {
        StringBuilder watermelon = new StringBuilder();
        for (int i = 0; i<n; i++){
            watermelon.append(i%2==0?"수":"박");
        }
        return watermelon.toString(); 
    }
}