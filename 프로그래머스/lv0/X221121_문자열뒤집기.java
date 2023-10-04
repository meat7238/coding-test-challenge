package 프로그래머스.lv0;

public class x1121_문자열뒤집기 {
	public static void main(String[] args) {

		int n = 10;
		int k = 3;
		int answer = 0;
		for (int i = 2; i <= n; i +=2) {
			answer += i;
		}
		System.out.println(answer);
	}
}
