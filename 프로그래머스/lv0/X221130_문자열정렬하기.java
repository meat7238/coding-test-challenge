package 프로그래머스.lv0;

import java.util.Arrays;

public class x1130_문자열정렬하기 {
    public static void main(String[] args) {
        String my_string = "hi12392";

        String ans = my_string.replaceAll("[^0-9]","");
        int[] answer = new int[ans.length()];
        for(int i = 0 ; i<ans.length();i++){
            answer[i] = ans.toCharArray()[i] - '0';
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}

