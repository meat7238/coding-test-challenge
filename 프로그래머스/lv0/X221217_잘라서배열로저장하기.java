package 프로그래머스.lv0;

import java.util.Arrays;

public class x1217_잘라서배열로저장하기 {
    public static void main(String[] args) {
        String my_str= "abcdef123";
        int n = 3;
        String[] answer = new String[(my_str.length()+(n-1))/n];
        for(int i = 0; i<answer.length; i++){
            if(i == answer.length-1) {
                answer[i] = my_str.substring(i*n,my_str.length());
                break;
            }
            answer[i] = my_str.substring(i*n,n+(i*n));
        }

        System.out.println(Arrays.toString(answer));
    }
}
