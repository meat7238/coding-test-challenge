package 프로그래머스.lv0;

public class x1129_최댓값만들기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int answer = Integer.MIN_VALUE;
        for( int i=0; i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
            answer = Math.max(answer,numbers[j]*numbers[i]);
            }
        }
    }
}
