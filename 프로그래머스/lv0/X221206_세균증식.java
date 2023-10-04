package 프로그래머스.lv0;

public class x1206_세균증식 {
    public static void main(String[] args) {
        int n = 2;
        int t = 10;
        int answer = n;
        for( int i = 0; i<t ; i++){
            answer *= 2;
        }
        System.out.println(answer);
    }
}
