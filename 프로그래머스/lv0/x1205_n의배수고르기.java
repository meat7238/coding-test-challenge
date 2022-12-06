package 프로그래머스.lv0;

import java.util.Arrays;

public class x1205_n의배수고르기 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] answer = Arrays.stream(numlist).filter(v -> (v % n) == 0).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
