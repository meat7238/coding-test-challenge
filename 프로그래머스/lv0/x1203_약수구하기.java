package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class x1203_약수구하기 {
    public static void main(String[] args) {
        int n = 24;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(i);
                if (n / i != i) result.add(n / i);
            }
        }
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}

//더나은 풀이
//import java.util.stream.IntStream;
//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int n) {
//        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
//    }
//}
