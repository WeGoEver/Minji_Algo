import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] name = new String[N][2];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<2; j++){
                name[i][j] = sc.next();
                //System.out.println(name[i][j]);
            }
        }

        // 출력 문자
        StringBuilder answer = new StringBuilder();

        // 각 문자열에 for문을 돌려 x를 찾음
        for(int i = 0; i<N; i++){
            String temp1 = name[i][0];
            String temp2 = name[i][1];

            for(int j = 0; j<temp1.length(); j++){
                if(temp1.charAt(j) == 'x' || temp1.charAt(j) == 'X'){
                    answer.append(temp2.charAt(j));
                    break;
                }
            }
        }
        System.out.print(answer.toString().toUpperCase());
    }
}
