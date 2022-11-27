package 백준.실버;

import java.util.Scanner;

/**
 * @author meat 꿍만의 피보나치 함수가 koong(n) n < 2 : 1 n = 2 : 2 n = 3 : 4 n > 3 :
 *         koong(n − 1) + koong(n − 2) + koong(n − 3) + koong(n − 4) 이다. 여러분도 꿍
 *         피보나치를 구해보아라. 입력의 첫 번째 줄을 테스트 케이스의 개수 t (0 < t < 69)가 주어진다. 다음 t줄에는 몇
 *         번째 피보나치를 구해야하는지를 나타내는 n(0 ≤ n ≤ 67)이 주어진다. 입력 8 0 1 2 3 4 5 30 67 출력
 *         1 1 2 4 8 15 201061985 7057305768232953720
 */
public class x0913_Generations_of_Tribbles_9507v {
	static long[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			arr = new long[n + 1];
			System.out.println(koong(n));
		}

	}

	public static long koong(int n) {
		if (n < 2)
			return arr[n] = 1;
		else if (n == 2)
			return arr[n] = 2;
		else if (n == 3)
			return arr[n] = 4;
		else if (arr[n] != 0)
			return arr[n];
		return arr[n] = koong(n - 1) + koong(n - 2) + koong(n - 3) + koong(n - 4);
	}
}
