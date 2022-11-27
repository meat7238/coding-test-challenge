package 백준.브론즈;

import java.util.Scanner;

public class x1115_인생은한방_25183 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		char[] strArray = str.toCharArray();
		char beforeNum = 0 ;
		int check = 0;
		for( char a : strArray) {
			if(beforeNum=='0') {
				beforeNum = a;
			}
			if(a-beforeNum == 1 || beforeNum-a == 1) {
				check++;
			}else {
				check=0;
			}
			beforeNum = a;
			if(check == 4) {
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
	}
}
