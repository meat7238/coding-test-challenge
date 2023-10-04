package 프로그래머스.lv0;

import java.util.Arrays;

public class x1217_중복된숫자갯수 {
    public static void main(String[] args) {
        int[] array = {1, 1, 21, 3, 4, 5};
        int n = 1;
        int answer = 0;
        answer = (int) Arrays.stream(Arrays.stream(array).mapToObj(String::valueOf).toArray()
        ).filter(s -> s.equals(n+"")).count();
        System.out.println(answer);
    }
}
