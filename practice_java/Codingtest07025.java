package practice_java;

public class Codingtest07025 {
    
    class Solution {
        public int solution(int num) {
            int cnt = 0;
            
            while(num != 1 || cnt < 500){
                if(num%2 == 0){
                    num /=2;
                }
                else
                    num = num*3+1;
                cnt++;
            }
    
            return (cnt >= 500) ? -1 : cnt;
        }
    }
}