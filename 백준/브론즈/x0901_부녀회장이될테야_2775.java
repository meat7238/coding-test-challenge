package 백준.브론즈;

import java.util.Scanner;

public class x0901_부녀회장이될테야_2775 {
	static int arr[][] = new int[15][15];

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		for (int i = 1; i <= 14; i++) {
			arr[0][i] = i;
		}
		for (int i = 1; i <= 14; i++) {
			for (int j = 1; j <= 14; j++) {
				arr[i][j] = F(i, j);
			}
		}
		int T = in.nextInt();
		while (T > 0) {
			int K = in.nextInt();
			int N = in.nextInt();
			System.out.println(arr[K][N]);
			T--;
		}
	}

	private static int F(int num1, int num2) {
		int sum = 0;
		for (int i = 1; i <= num2; i++) {
			sum += arr[num1 - 1][i];
		}
		return sum;
	}
}

//public class 부녀회장이될테야_2775번_재귀 {
//public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);	
//	
//	int t = in.nextInt();
//	for (int i=0; i<t;i++) {
//		int k = in.nextInt();
//		int n = in.nextInt();
//		System.out.println(function(k,n));
//	}
//	in.close();
//
//}
//
//private static int function(int floar, int room) {
//	if(floar ==0)
//		return room;
//	int rw = 0;
//	for(int i=1; i<=room;i++)
//		rw += function(floar-1 , i); 
//	return rw;
//}
//
//}