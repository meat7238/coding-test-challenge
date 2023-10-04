package 프로그래머스.lv0;

public class x1128_공던지기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int k = 5;
        int idx = 0;
        int answer = 0;
        while(k-->0){
            answer = numbers[idx];
            if(idx == numbers.length-2) idx = 0;
            else if(idx == (numbers.length-1)) idx = 1;
            else idx += 2;
        }
        System.out.println(answer);
    }
}


//class Solution {
//    public int solution(int[] numbers, int k) {
//        return (k-1)*2 % numbers.length+1;
//    }
//}