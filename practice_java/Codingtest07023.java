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
                for(int i = 1 ; i < arr.length ; i++){
                    if(arr[i] < min){
                        min = arr[i];
                        min_index = i;
                    }
                }
                System.arraycopy(arr, 0, answer, 0, min_index);
                System.arraycopy(arr, min_index+1, answer, min_index, arr.length - min_index - 1);
            }
            return answer;
        }
    }
}