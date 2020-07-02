package practice_java;

class Codingtest07021{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public int[] solution(long n) {
        int[] answer;
        String temp = n + "";
        answer = new int[temp.length()];
        for(int i = 0 ; i < temp.length() ; i++){
            answer[i] = Integer.parseInt(""+temp.charAt(temp.length()-i-1));
        }
        
        return answer;
    }
}