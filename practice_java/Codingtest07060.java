package practice_java;

import java.util.PriorityQueue;

class Codingtest07060{
    public static void main(String[] args) {
        
    }
}


class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for(int i = 0 ; i < scoville.length ; i++){
            heap.add(scoville[i]);
        }
        
        while(true){
            int min1 = heap.poll();
            int min2 = heap.poll();

            int temp = min1 + min2 * 2;
            heap.add(temp);
            answer++;

            if(heap.peek() >= K){
                break;
            }

            if(heap.size() == 1 && heap.peek() < K){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}