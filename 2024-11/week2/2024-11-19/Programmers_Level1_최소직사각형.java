import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;

        for(int i = 0; i<sizes.length; i++){
            int w = sizes[i][0];
            int h = sizes[i][1];

            if(w < h){
                sizes[i][0] = h;
                sizes[i][1] = w;
            }

            if(sizes[i][0] > wMax){
                wMax = sizes[i][0];
            }

            if(sizes[i][1] > hMax){
                hMax = sizes[i][1];
            }
        }

        return wMax * hMax;
    }
}