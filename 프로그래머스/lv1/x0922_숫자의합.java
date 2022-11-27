package 프로그래머스.lv1;

import java.util.Scanner;

public class x0922_숫자의합 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int sum=0;
	String num="";
	int N = sc.nextInt();
	num = sc.next();
	for(int i=1;i<=N;i++ ) {
		sum+=Integer.parseInt(num.substring(i-1, i));
	}
	System.out.println(sum);
	
	}
}
