package 백준.브론즈;

import java.util.Scanner;

public class x0000_AscendBubbleSort {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt(), temp = 0;
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		for (int k = 0; k < N; k++) {
			for (int j = 0; j < N - 1 - k; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int a : arr)
			System.out.print(a + " ");
	}// end main
}// end class
