import java.util.*;

public class Programmers_Level2_큰수만들기 {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int start = 0;

        for (int i = 0; i < number.length() - k; i++) {

            char maxChar = '0';
            for(int j = start; j <= i + k; j++){
                if(number.charAt(j) > maxChar){
                    maxChar = number.charAt(j);
                    start = j + 1;
                }
            }
            sb.append(maxChar);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Programmers_Level2_큰수만들기 solution = new Programmers_Level2_큰수만들기();

        // 테스트 예시
        System.out.println(solution.solution("1924", 2)); // "94"
        System.out.println(solution.solution("1231234", 3)); // "3234"
        System.out.println(solution.solution("4177252841", 4)); // "775841"
    }
}