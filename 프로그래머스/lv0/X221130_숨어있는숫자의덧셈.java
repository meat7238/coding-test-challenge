package 프로그래머스.lv0;

import java.util.Arrays;

public class x1130_숨어있는숫자의덧셈 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp"	;

        String ans = my_string.replaceAll("[^0-9]","");
        int answer = 0;
        for( char a : ans.toCharArray()){
            answer += a-'0';
        }
        System.out.println(answer);
    }
}

