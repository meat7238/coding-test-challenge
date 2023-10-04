package 프로그래머스.lv0;

import java.util.Arrays;

public class x1021_분수의덧셈 {
	public static void main(String[] args) {
		int denum1=999;
		int denum2=999;
		int num1=999;
		int num2=999;
		int temp = 0;
		int desum=denum1*num2+denum2*num1;
		int sum= num1*num2;
		
		int GCD = desum;
		int LCM = sum;
		
		while(LCM!=0) {
			temp = GCD%LCM;
			GCD = LCM;
			LCM = temp;
		}
		int[] answer = {desum/GCD,sum/GCD};
		System.out.println(Arrays.toString(answer));
		
	}
}
