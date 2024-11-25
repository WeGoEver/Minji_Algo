import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 작은 번호부터 처리위해서 -> 항상 앞 사람의 체육복 여분을 체크하기 떄문에, i 번 사람이 앞 사람의 체육복을 빌리기 위해서는 i-1 번 사람까지는 전부 체육복이 잘 분배되어 있어한다. 그래서 오름차순으로 풀어야한다.

        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여분을 가져온 학생이 도난당한 Case
        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){

                if(reserve[j] == lost[i]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        //여벌을 챙겨온 사람이 앞, 뒷 번호에 체육복을 빌려주는 Case
        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if(reserve[j] == lost[i]-1 || reserve[j]==lost[i]+1){
                    answer++;
                    lost[i]=-1;
                    reserve[j]=-1;
                    break;
                }
            }
        }

        return answer;
    }
}
