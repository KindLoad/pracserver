package practice_java;

public class Codingtest07028 {
    public static void main(String[] args) {
        test8 test = new test8();

        System.out.println(test.solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));

    }
}

class test8{
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char[] skill_char = new char[skill.length()];

        for(int i = 0 ; i < skill.length() ; i++){
            skill_char[i] = skill.charAt(i);
        }
        //skill을 char 배열에 집어넣음

        for(int i = 0 ; i < skill_trees.length ; i++){
            char[] skill_temp = new char[skill_trees[i].length()];

            for(int j = 0 ; j < skill_trees[i].length() ; j++){
                skill_temp[j] = skill_trees[i].charAt(j);
            }
            //skill 트리를 하나 집어넣음

            

            if(check_correct(skill_char, skill_temp)){
                    answer+=1;
            }
            
        }
        return answer;
    }

    public boolean check_correct(char[] skill_char, char[] skill_temp){
        int progress = 0;
        for(int i = 0 ; i < skill_temp.length ; i++){

            if(progress == skill_char.length){
                return true;
            }

            if(skill_temp[i] == skill_char[progress]){
                progress++;
            } else {
                if(new String(skill_char).contains(skill_temp[i] + "")){
                    return false;
                }
            }

        }
        return true;
    }
            
}
