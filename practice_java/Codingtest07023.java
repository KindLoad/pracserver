package practice_java;

public class Codingtest07023 {
    
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer;
            if(arr.length == 1){
                answer = new int[1];
                answer[0] = -1;
            }
            else
            {
                answer = new int[arr.length-1];
                int min = arr[0];
                int min_index = 0;
                int j = 0;
                for(int i = 1 ; i < arr.length ; i++){
                    if(arr[i] < min){
                        min = arr[i];
                        min_index = i;
                    }
                }
                for(int i = 0 ; i < answer.length ; i++){
                    if(arr[i] == arr[min_index]){
                        j++;
                        continue;
                    }
                    answer[i] = arr[j];
                    j++;
                }
            }
            return answer;
        }
    }
}