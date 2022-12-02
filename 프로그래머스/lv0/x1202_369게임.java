package 프로그래머스.lv0;

public class x1202_369게임 {
    public static void main(String[] args) {
        int order = 10000;
        int answer = 0;
        while(order > 0){
            if((order%10)%3==0 & (order%10)!=0 ) answer++;
            order/=10;
        }
        System.out.println(answer);
    }
}


//class Solution {
//    public int solution(int order) {
//        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
//    }