package 프로그래머스.lv0;

import java.util.Arrays;

public class x1128_배열회전시키기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int[] answer = new int[numbers.length];
        String direction = "right";
        if(direction.equals("left")){
            for(int i =1;i<numbers.length;i++){
                answer[i-1] = numbers[i];
            }
            answer[answer.length-1] = numbers[0];
        }else {
            for(int i =1;i<numbers.length;i++){
                answer[i] = numbers[i-1];
            }
            answer[0] = numbers[answer.length-1];
        }

        System.out.println(Arrays.toString(answer));

    }
}
