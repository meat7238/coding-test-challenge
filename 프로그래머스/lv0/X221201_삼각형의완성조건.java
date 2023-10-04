package 프로그래머스.lv0;

public class x1201_삼각형의완성조건 {
    public static void main(String[] args) {
        int[] sides = {1,2,3};

        int answer = 0;
        int max = 0;
        int sum = 0;
        for(int num : sides){
            max = Math.max(max,num);
            sum += num;
        }
//        if (sum - max > max) return answer = 1;
//        return answer = 0;
    }
}
