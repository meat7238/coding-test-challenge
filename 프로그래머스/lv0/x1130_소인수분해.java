package 프로그래머스.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class x1130_소인수분해 {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(Math.sqrt(17));
        List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && checkNum(i)){
                numbers.add(i);
                n /= i;
            }
        }
        Collections.sort(numbers);
        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        System.out.println(Arrays.toString(numbers.stream().mapToInt(Integer::intValue).toArray()));
    }

    static boolean checkNum(int a) {
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //리스트를 스트림으로 배열로 변환하기
    //list.stream().mapToInt(Integer::intValue).toArray();
}
