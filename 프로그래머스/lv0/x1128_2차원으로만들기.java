package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class x1128_2차원으로만들기 {
//    public static void main(String[] args) {
//        int[] num_list = {1,2,3,4,5,6,7,8,9};
//        int n = 9;
//
//        List<int[]> numbers = new ArrayList<>();
//        for(int i = 0 ; i<num_list.length;i=i+n){
//            numbers.add(Arrays.copyOfRange(num_list,i,i+n));
//        }
//
//        int[][] answer = numbers.toArray(new int[0][0]);
//        System.out.println(Arrays.deepToString(answer));
//    }
//}

public class x1128_2차원으로만들기 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5,6,7,8,9};
        int n = 9;
        int idx = 0;
        int[][] answer = new int[num_list.length/n][n];
        for(int i = 0 ; i<num_list.length;i=i+n){
            int[] a = Arrays.copyOfRange(num_list,i,i+n);
            answer[idx] = a;
            idx++;
        }

        System.out.println(Arrays.deepToString(answer));
    }
}

