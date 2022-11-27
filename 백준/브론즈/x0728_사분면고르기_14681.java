

//* 4분면 고르기
package 백준.브론즈;

import java.util.Scanner;

public class x0728_사분면고르기_14681 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		int Y = in.nextInt();
		
		if(X>0&&Y>0) {
			System.out.println(1);
		} else if (X>0&&Y<0) {
			System.out.println(4);
		} else if (X<0&&Y<0) {
			System.out.println(3);
		} else if (X<0&&Y>0) {
			System.out.println(2);
		}
				
		
	} //end main
	
}//end class


//*S