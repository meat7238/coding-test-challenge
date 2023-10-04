package 프로그래머스.lv0;

import java.util.*;
import java.util.stream.Collectors;

public class x1203_인덱스바꾸기 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1=1;
        int num2=2;
        String[] strings = my_string.split("");
        String temp = strings[num1];
        strings[num1] = strings[num2];
        strings[num2] = temp;
        String answer = "";
        for(int i = 0; i< strings.length;i++){
            answer += strings[i];
        }
        System.out.println(answer);
    }
}

//더 나은 풀이
//class Solution {
//    public String solution(String myString, int num1, int num2) {
//        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());
//
//        Collections.swap(list, num1, num2);
//        return String.join("", list);
//    }
//}
