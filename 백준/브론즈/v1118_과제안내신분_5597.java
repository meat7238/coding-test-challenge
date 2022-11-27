package 백준.브론즈;

import java.util.Scanner;

public class v1118_과제안내신분_5597 {
	private static final int STUDENT = 30;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] student = new int[STUDENT + 1];

		for (int i = 0; i < STUDENT - 2; i++) {
			int input = sc.nextInt();
			student[input] = input;
		}

		for (int i = 1; i < student.length; i++) {
			if (student[i] < 1) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
