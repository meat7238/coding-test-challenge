package 프로그래머스.lv0;

import java.util.Arrays;

public class x1217_머쓱이보다키큰사람 {
    public static void main(String[] args) {
        int[] array = {149,180,192,170};
        int height = 167;
        int answer = (int) Arrays.stream(array).filter(s -> s>height).count();
        System.out.println(answer);
    }
}
