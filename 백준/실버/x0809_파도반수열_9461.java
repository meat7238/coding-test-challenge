package 백준.실버;

import java.util.Scanner;

public class x0809_파도반수열_9461 {

	static long[] test = new long[101];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = 0;
		test[1] = test[2] = test[3]=1;
		test[4] = test[5] = 2;
		T = in.nextInt();
		int[] n = new int[T+1];
		
		for (int i = 0; i < T; i++) {
			n[i] = in.nextInt();
		}
		for(int j=0;j<T;j++){
			System.out.println(cheak(n[j]));			
		}
	
	}

	public static long cheak(int n) {

		if (n < 1) 
			return 0;
		else if (test[n] != 0)
			return test[n];
		test[n] = cheak(n - 1) + cheak(n - 5);
		return test[n];
	}
}
