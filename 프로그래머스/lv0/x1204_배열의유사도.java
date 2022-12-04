package 프로그래머스.lv0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class x1204_배열의유사도 {
    public static void main(String[] args) {
        String[] s1 = {"a","b","c",};
        String[] s2 = {"com","b","d","p","c"};
        int answer = 0;
        for(String s : s1){
            if(Arrays.stream(s2).collect(Collectors.toList()).contains(s)){
                answer ++;
            }
        }
        System.out.println(answer);
    }
}
