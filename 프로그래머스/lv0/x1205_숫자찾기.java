package 프로그래머스.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class x1205_숫자찾기 {
    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        int answer = 0;
        List<String> list = Arrays.stream(Integer.toString(num).split("")).collect(Collectors.toList());
//       if(list.contains(Integer.toString(k))) return answer = list.indexOf(Integer.toString(k))+1;
//        return "-1";

        if(list.contains(Integer.toString(k))) answer = list.indexOf(Integer.toString(k));
        else answer = -1;
        System.out.println(answer);

//        System.out.println(("-"+num).indexOf(Integer.toString(k)));
    }
}

//class Solution {
//    public int solution(int num, int k) {
//        return ("-" + num).indexOf(String.valueOf(k));
//    }
//}