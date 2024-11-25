import java.util.*;

class Solution {
    public int solution(String name) {

        int answer = 0;
        int length = name.length();

        int index;
        int move = length - 1; //오른쪽으로 움직일 때

        for(int i = 0; i<name.length();i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);  // 커서를 위나 아래로 옮길 때 최솟값을 더한다.

            index = i + 1;

            while(index < length && name.charAt(index) == 'A'){                 index++;
            }

            // 순서대로 가는 것과, 뒤를 돌아 가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i*2 + length - index);
            // BBBBAAAAAAAB 와 같이, 처음부터 뒷부분을 입력하는 것이 빠른 경우까지 고려
            move = Math.min(move, (length - index) * 2 + i);

        }

        return answer + move;

    }
}