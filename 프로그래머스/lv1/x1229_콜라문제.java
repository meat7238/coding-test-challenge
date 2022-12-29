package 프로그래머스.lv1;

public class x1229_콜라문제 {
    public static void main(String[] args) {
        int a = 3; int b = 1; int n = 20; // result 19 //나중에 요세푸스로 풀어보기
        int answer = 0;
        while(n>=a) {
            answer += n/a*b;
            n = n/a*b + n%a;
        }
        System.out.println(answer);
    }
}
