package 백준.브론즈;

import java.util.Scanner;

public class x0811_나머지구하기_3052_ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt=10;
		int a[] = new int[10];
		
		for(int i=0;i<10;i++) {
			a[i] = in.nextInt();
			a[i] = a[i]%42;
		}
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<10;j++) {
				if(a[i]==a[j]) {
					cnt--;
					break;
				}
					
			}
		}
		System.out.println(cnt);
	}
}
