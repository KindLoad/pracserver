package practice_java;

public class Codingtest07025 {
    
    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = {};
            int max = 0, min = 0;
            
            for(int i = 1 ; i <= (n>m ? m : n) ; i++){
                if(n%i == 0 && m%i == 0)
                    max = i;
            }
            
            for(int i = (n>m ? n : m) ; ; i++){
                if(i%n == 0 && i%m == 0){
                    min = i;
                    break;
                }
            }
            answer = new int[]{max, min};
            return answer;
        }
    }
}