package 프로그래머스.lv0;

import java.util.Scanner;

public class x1129_팩토리얼 {
    public static void main(String[] args) {
        int n = 7;
        int sum = 1;
        int answer = 1;
        while(true){
            sum *= answer;
            if(sum>n) break;
            answer++;
        }
        System.out.println(answer-1);
    }
}
