import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] ground = new int[3][3];

        // 문자열 입력
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                 ground[i][j] = scanner.nextInt();
            }
        }

        // 1*3 ground

        int answer =  Integer.MAX_VALUE;

        for(int x = 0; x<3; x++){

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int max2 = Integer.MIN_VALUE;
            int min2 = Integer.MAX_VALUE;


            for(int y = 0; y<3; y++){
                max = Math.max(max, ground[x][y]);
                min = Math.min(min, ground[x][y]);

                max2 = Math.max(max2, ground[y][x]);
                min2 = Math.min(min2, ground[y][x]);
            }

            int sumMax = 0. sumMin = 0;
            int sumMax2 = 0, sumMin2 = 0;


            for(int y = 0; y<3; y++){
                sumMax += max - ground[x][y];
                sumMin += ground[x][y] - min;

                sumMax2 += max2 - ground[y][x];
                sumMin2 += ground[y][x] - min2;
            }

            int answerTemp = Math.min(Math.min(sumMax, sumMin), Math.min(sumMax2, sumMin2));
            answer = Math.min(answer, answerTemp);
        }

        System.out.print(answer);
    }
}
