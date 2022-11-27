package 백준.브론즈;

import java.util.Scanner;

public class x1018_팰린드롬수_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		while(!str.equals("0")) {
			
			for(int i=0; i<str.length()/2;i++) {
				if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
					System.out.println("no");
					break;
				}else if(i == str.length()/2-1) {
					System.out.println("yes");
					break;
				}
			}
			if(str.length()==1) System.out.println("yes");
			str = sc.next();
		}
	}
	
}
