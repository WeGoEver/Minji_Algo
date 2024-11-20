class Solution {
    public int[] solution(int brown, int yellow){
        int[] answer = new int[2];
        for(int i = 1; i <= Math.sqrt(yellow); i++){

            if(yellow%i == 0){
                int tempW = yellow/i + 2;
                int tempH = i + 2;
                int sum = brown + yellow;

                if(sum == tempW * tempH){                               answer[0] = tempW;
                    answer[1] = tempH;
                    break;
                }
            }
        }
        return answer;
    }
}