package practice_java;

import java.util.Arrays;

public class Codingtest07024 {
    class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;
            int[] temp = d;

            Arrays.sort(temp);

            for(int i = 0 ; i < temp.length ; i++){
                budget -= temp[i];
                if(budget < 0) break;
                answer++;
            }
            return answer;
        }
    }
}