package 프로그래머스.lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class x1205_자릿수더하기 {
    public static void main(String[] args) {
        int n = 1234;


        int answer = IntStream.of(n).sum();
        System.out.println(Arrays.stream(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum());
    }
}
