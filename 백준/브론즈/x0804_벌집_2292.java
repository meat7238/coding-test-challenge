package 백준.브론즈;

import java.util.Scanner;

public class x0804_벌집_2292 {
	public static void main(String[] args) {
			
		int n = new Scanner(System.in).nextInt();
		int ran = 1;
		int cnt=1;
		

		while(ran<n) {
		ran=ran+6*cnt;
		cnt++;
		}
		System.out.println(cnt);

		
	}
}