import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 오름차순 정렬

        // 투 포인터 사용
        int left = 0;   //가벼운 사람
        int right = people.length - 1;  // 무거운 사람
        int count = 0;

        while(left <= right){

            if(people[left] + people[right] <= limit){
                left++;
            }
            right--; // 무거운 사람은 항상 태움
            count++;
        }

        return count;
    }
}
