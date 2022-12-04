package 프로그래머스.lv0;

import java.util.Arrays;

public class x1204_가장큰수찾기 {
    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        int max = Integer.MIN_VALUE, index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = Math.max(max, array[i]);
                index = i;
            }
        }
        int[] answer = {max,index};
        System.out.println(Arrays.toString(answer));
    }
}

//class Solution {
//    public int[] solution(int[] array) {
//        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
//        int max = list.stream().max(Integer::compareTo).orElse(0);
//        int index = list.indexOf(max);
//        return new int[] {max, index};
//    }
//}
