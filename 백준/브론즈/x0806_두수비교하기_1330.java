package 백준.브론즈;

import java.util.Scanner;

public class x0806_두수비교하기_1330 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if (a>b) System.out.println(">");
		else if(a<b) System.out.println("<");
		else if(a==b) System.out.println("==");
	}
}
