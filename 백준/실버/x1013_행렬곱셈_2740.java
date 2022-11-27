package 백준.실버;

import java.util.Arrays;
import java.util.Scanner;

public class x1013_행렬곱셈_2740 {
	 public static void main(String[] args) {
		int N=0,M=0,K=0;
		String answer = "";
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[][] A = new int[N][M];
		for(int i=0; i<N; i++) {
			for( int j=0; j<M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		M = sc.nextInt();
		K = sc.nextInt();
		int[][] B = new int[M][K];
		for(int i=0; i<M; i++) {
			for( int j=0; j<K; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(B));
		
		int[][] AB = new int[N][K];
		for(int i=0; i<N; i++) {
			for( int j=0; j<K; j++) {
				for(int k=0; k<M; k++) {
					AB[i][j] += A[i][k]*B[k][j] ;
				}
				answer += AB[i][j] + " ";
			}
			answer = answer.substring(0,answer.length()-1 );
			answer += "\n";
		}
		
		System.out.println(answer);
	}
}
