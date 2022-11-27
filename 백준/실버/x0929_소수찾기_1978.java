package 백준.실버;

import java.util.Scanner;

public class x0929_소수찾기_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		while (N-->0) {
			int num = sc.nextInt();
			if(num==1) {
				continue;
			}
			if( num <= 3) {
				cnt++;
				continue;
			}
			for(int i=2; i<num; i++) {
				if(num%i==0) break;
				if(i==num-1)
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
