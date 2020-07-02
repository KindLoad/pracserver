package practice_java;

class Codingtest07022{
    public static void main(String[] args) {
        
    }

    class Solution {
        public int solution(int n) {
            int answer = 0;
            String temp = n + "";
            for(int i = 0 ; i < temp.length() ; i++){
                answer += Integer.parseInt(temp.charAt(i) + "");
            }
    
            return answer;
        }
    }
}

