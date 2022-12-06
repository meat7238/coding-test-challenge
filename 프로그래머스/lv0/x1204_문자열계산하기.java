package 프로그래머스.lv0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class x1204_문자열계산하기 {
    public static void main(String[] args) {
        String my_string = "12 +12 -12";

//        List<String> list = Arrays.stream(my_string.split(" ")).collect(Collectors.toList());
//        int answer = Integer.parseInt(list.get(0));
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals("+")) {
//                answer += Integer.parseInt(list.get(i + 1));
//            } else if (list.get(i).equals("-")) {
//                answer -= Integer.parseInt(list.get(i + 1));
//            }
//        }
//        System.out.println(answer);
        System.out.println(Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "").split(" ")).mapToInt(Integer::parseInt).sum()
);

    }
}

//class Solution {
//    public int solution(String myString) {
//        return Arrays.stream(myString.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
//    }
//}