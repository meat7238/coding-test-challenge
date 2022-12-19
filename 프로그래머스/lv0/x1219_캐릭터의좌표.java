package 프로그래머스.lv0;

import java.util.Arrays;

public class x1219_캐릭터의좌표 {
    public static void main(String[] args) {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] answer = {0,0};
        int[] board = {7,9};
        for(String s : keyinput){
            if(s.equals("left")) answer[0]-=1;
            else if(s.equals("right")) answer[0]+=1;
            else if(s.equals("up")) answer[1]+=1;
            else if(s.equals("down")) answer[1]-=1;

            if(Math.abs(answer[0])>=board[0]/2) answer[0] = answer[0]/Math.abs(answer[0]) * board[0]/2;
            if(Math.abs(answer[1])>=(board[1]/2)) answer[1] = answer[1]/Math.abs(answer[1])* board[1]/2;
        }
        System.out.println(Arrays.toString(answer));
    }
}
