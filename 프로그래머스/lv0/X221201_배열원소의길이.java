package 프로그래머스.lv0;

import java.util.Arrays;

public class x1201_배열원소의길이 {
    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        int[] answer = new int[strlist.length];
        for(int i=0; i< strlist.length;i++){
            answer[i] = strlist[i].length();
        }
        System.out.println(Arrays.toString(answer));
    }
}

//다른 풀이
class Solution1201 {
    public int[] solution(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}