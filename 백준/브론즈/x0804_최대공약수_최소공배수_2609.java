package 백준.브론즈;
import java.util.Scanner;

public class x0804_최대공약수_최소공배수_2609 {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = 0,b=0;
		do {
			a = in.nextInt();
			b = in.nextInt();
		}while(a<=0||b<=0);
		
		System.out.println(Y(a,b));
		System.out.println(a*b/Y(a,b)); 
		
		
	}//end main

public static int Y(int a,int b) {
	if(a%b==0) {
		return b;
	}
	return Y(b,a%b);
}

}//end class