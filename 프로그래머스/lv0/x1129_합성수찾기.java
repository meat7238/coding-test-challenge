package 프로그래머스.lv0;

import java.io.InputStream;

public class x1129_합성수찾기 {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        for(int i=4;i<=n; i++){
            if(checkSyntheticNumber(i)) answer++;
        }
        System.out.println(answer);

    }

    static boolean checkSyntheticNumber(int number){
        int cnt = 0;
        for(int i = 1 ; i <=number ; i++){
            if(number%i == 0) cnt++;
            if(cnt>2) return true;
        }
        return false;
    }
}
// 더 나은 방법? 스트림 사용
// class Solution {
//    public int solution(int n) {
//        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
//    }
//}
