package 백준.브론즈;

import java.util.Scanner;

public class x0824_나누기_1075 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N,F,sum;
		N = in.nextInt();
		F=in.nextInt();
		sum=0;
		while(sum<(N/100*100))sum+=F;
		if(sum%100<10) System.out.println("0"+sum%100);
		else System.out.println(sum%100);
	}

}
