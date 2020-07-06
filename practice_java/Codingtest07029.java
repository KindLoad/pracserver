package practice_java;

public class Codingtest07029 {

    public static void main(String[] args) {
        test2 test = new test2();

        int[] buck =  test.solution(new int[]{1, 3, 3, 4, 5});

        for(int i = 0 ; i < buck.length ; i++){
            System.out.print(buck[i] + " ");
        }
    }
    
}

class test2 {
    public int[] solution(int[] answers) {
        int[] answer;
        int a = 0, b = 0, c = 0;
        
        for(int i = 0 ; i < answers.length ; i++){
            if(i%5+1 == answers[i])
                a++;
            if((i%2 == 0 && answers[i] == 2)||(i%8 == 1 && answers[i] == 1)||(i%8 == 3 && answers[i] == 3)||(i%8 == 5 && answers[i] == 4)||(i%8 == 7 && answers[i] == 5))
                b++;
            if(((i%10)/2 == 0 && answers[i] == 3)||((i%10)/2 == 1 && answers[i] == 1)||
              ((i%10)/2 == 2 && answers[i] == 2)||((i%10)/2 == 3 && answers[i] == 4)||
              ((i%10)/2 == 4 && answers[i] == 5)) c++;
        }
        
        if(a > b){
            if(a == c){ // a == c > b
                answer = new int[]{1,3};
            } else if(c > a){ // c > a > b
                answer = new int[]{3};
            } else  // a > b , a > c
                answer = new int[]{1};
        }
        else if(a == b){
            if(b > c){ // a == b > c
                answer = new int[]{1, 2};
            }else if(b == c){ // a == b == c
                answer = new int[]{1, 2, 3};
            } else{ // c > a == b
                answer = new int[]{3};
            }
        }
        else{ // b > a
            if(b > c){ // b > a , b > c 
                answer = new int[]{2};
            }else if(b == c){
                answer = new int[]{2,3};
            }else {
                answer = new int[]{3};
            }
        }

        System.out.println(a + ", " + b + ", " + c);
        
        return answer;
    }
}