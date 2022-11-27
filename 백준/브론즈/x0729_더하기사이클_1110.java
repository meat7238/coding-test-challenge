package 백준.브론즈;

import java.util.Scanner;

public class x0729_더하기사이클_1110 {

	public static void main(String[] args) {
		
	
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int ten = N/10;
		int one = N%10;
		int ten2 = ten, one2=one,count=0,temp = 0;
		


		do {
			
			temp = one2;
			one2 = (ten2+one2)%10;
			ten2 = temp;
			count +=1;
			
			if (ten == ten2 && one == one2) {
				System.out.println(count);
				return;
			}
			
		} while ((ten != ten2) || (one != one2));
	
	}//end main
}//end class
	
