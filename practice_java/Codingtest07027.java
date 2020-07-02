package practice_java;

public class Codingtest07027 { //프로그래머스 기능 개발 문제

    public static void main(String[] args) { //실험용 main
        test test1 = new test();
        int[] a = test1.solution(new int[]{40, 93, 30, 55, 60, 65}, new int[]{60, 1, 30, 5, 10, 7});// {1,2,3}이 나와야함
        
        for(int i = 0 ; i < a.length ; i++)
            System.out.print(a[i]);
    }
}

class test{
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int cnt = 1;
        int[] days = new int[progresses.length];
        
        for(int i = 0 ; i < progresses.length; i++){
            days[i] = (100 - progresses[i])/speeds[i];
            if((100 - progresses[i])%speeds[i] > 0)
                days[i] += 1;
        }
        //각 일 수를 계산

        for(int i = 1 ; i < days.length ; i++){
            if(days[i-1] > days[i])
                days[i] = days[i-1];
        }
        //뒷 프로세스의 일자가 앞의 프로세스 보다 작으면 앞의 프로세스와 같은 날 배포 되기 때문에
        //뒷 프로세스의 배포날짜 또한 앞의 배포날짜와 동일하게 치환시켜 줌

        for(int i = 1 ; i < days.length ; i++){
            if(days[i-1] != days[i])
                cnt++;
        }
        //치환 후의 날짜는 ex)1117778889999와 같이 같은 숫자의 반복이고 이 숫자 종류를 카운트 수를 배열에 넣는 것이기 때문에
        //종류의 수로 배열을 만들어서 배치시켜줌

        answer = new int[cnt];
        //배열 만듬

        int cnt2 = 0; //계속 바뀔 ㅇ각 숫자의 카운트
        int j = 0; //answer의 배열 위치

        for(int i = 0 ; i < days.length ; i++){
            if(i != 0 && days[i-1] != days[i]){ //다른 일 수의 프로세스를 찾아내면
                answer[j] = cnt2; //현재까지의 카운트를 배열에 넣어주고
                j++; //answer에서 다음으로 진행
                cnt2 = 0; // 카운트를 초기화
            }
            cnt2++; //현재자리 카운트
        }
        
        answer[answer.length-1] = cnt2; //마지막 카운트가 생략되어있어서 마지막에 한 번 해줌 

        return answer;
    }
}
