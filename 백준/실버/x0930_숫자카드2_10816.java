package 백준.실버;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class x0930_숫자카드2_10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr); 

		int M = in.nextInt();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			int search = in.nextInt();
			sb.append(hiValue(arr, search) - lowValue(arr, search)).append(' ');
		}
		System.out.println(sb);

	}

	static int lowValue(int[] arr, int searchValue) {
		int lo = 0;
		int hi = arr.length;

		while (lo < hi) {
			int mid = lo + ((hi - lo) / 2);
			if (searchValue <= arr[mid])
				hi = mid;
			else
				lo = mid + 1;
		}
		return lo;
	}

	static int hiValue(int[] arr, int searchValue) {
		int lo = 0;
		int hi = arr.length;

		while (lo < hi) {
			int mid = lo + ((hi - lo) / 2);
			if (searchValue < arr[mid])
				hi = mid;
			else
				lo = mid + 1;
		}
		return hi;
	}

}