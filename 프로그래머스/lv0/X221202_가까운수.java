package 프로그래머스.lv0;

public class x1202_가까운수 {
    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int a : array) {
            if (min > Math.abs(a - n)){
                min = Math.abs(a - n);
                answer = a;
            }else if(min == Math.abs(a - n)){
                answer = Math.min(a, answer);
            }
        }
        System.out.println(answer);
    }
}
