package 프로그래머스.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class x1206_문자열정렬하기2 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining("")));

    }
}
