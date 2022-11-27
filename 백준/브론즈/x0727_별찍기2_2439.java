package 백준.브론즈;

import java.util.Scanner;

public class x0727_별찍기2_2439 {
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
	
		int N = in.nextInt();
		String A = "*";
		String B = " ";
		
		while(N>0) {
			
			//N-1회 띄어쓰기 삽입 필요.
			for(int i = 1; i<N ; i++) {
			System.out.print(B);
			}
			
			System.out.println(A);
			A = A+"*";
			N = --N;
		}
	
		in.close();
				
	}//End main
}//End class

