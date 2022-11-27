package 백준.실버;

import java.util.Scanner;

public class x1122_스타트와링크_14889 {
	static int N;
	static int[][] map;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		visit = new boolean[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		dfs(0,0);
		System.out.println(min);

	}// end main

	private static void dfs(int idx, int count) {
		if (count == N / 2) {
			compare();
			return;
		}

		for (int i = idx; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				dfs(i + 1, count + 1);
				visit[i] = false;
			}
		}
	}

	private static void compare() {
		int start_sum = 0;
		int link_sum = 0;

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if(visit[i]==true && visit[j]==true) {
					start_sum+=map[i][j];
					start_sum+=map[j][i];
				}else if(visit[i]==false && visit[j]==false) {
					link_sum +=map[i][j];
					link_sum +=map[j][i];
				}
			}
		}
		int value = Math.abs(start_sum - link_sum);
		min = Math.min(min, value);
	}
}
