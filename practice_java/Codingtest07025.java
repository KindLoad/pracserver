package practice_java;

public class Codingtest07025 {
    
    class Solution {
        public int solution(int num) {
            int cnt = 0;
            long temp = num;
            
            while(cnt < 500){
                if(temp%2 == 0){
                    temp /=2;
                }
                else temp = temp*3+1;
                cnt++;

                if(temp == 1)
                    break;
            }
    
            return (cnt >= 500) ? -1 : cnt;
        }
    }
}