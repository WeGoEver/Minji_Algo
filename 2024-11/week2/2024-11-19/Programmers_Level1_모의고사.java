import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int aNum = 0;
        int bNum = 0;
        int cNum = 0;

        for(int i = 0; i<answers.length; i++, aNum += 1, bNum += 1, cNum += 1){

            if(i%5 == 0) aNum = 0;
            if(i%8 == 0) bNum = 0;
            if(i%10 == 0) cNum = 0;

            if(answers[i] == a[aNum]) aCount++;
            if(answers[i] == b[bNum]) bCount++;
            if(answers[i] == c[cNum]) cCount++;
        }

        int max = aCount;
        if(max < bCount) max = bCount;
        if(max < cCount) max = cCount;

        ArrayList<Integer> arr = new ArrayList<>();

        if(max == aCount) arr.add(1);
        if(max == bCount) arr.add(2);
        if(max == cCount) arr.add(3);

        int[] array = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }


        return array;
    }
}