package practice_java;

public class Codingtest07023 {
    
    class Solution {
        public long solution(long n) {
            long answer = 0;
            if(Math.sqrt(n)%1 == 0){
                long temp = (int)Math.sqrt(n) + 1;
                answer = temp * temp;
            }
            else answer = -1;
            
            return answer;
        }
    }
}