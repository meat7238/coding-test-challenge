package 백준.브론즈;

import java.util.MissingResourceException;
import java.util.Scanner;

public class x0000_Arithmetic {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float result = 0;
		
		System.out.println("첫번째 숫자를 입력해 주세요 : ");
		float A = in.nextFloat();
		System.out.println("두번째 숫자를 입력해 주세요 : ");				
		float B = in.nextFloat();
		System.out.println("연산자를 입력해 주세요 (ex.+,-,*,/): ");
		char C = in.next().charAt(0); //String 은 클래스이기때문에  int변수와는 다르게 스택에 저장되는게 아닌 힙영역에 저장되어있다.(스택엔 주소만 저장)
		
		try {
			
		
		if (C == ('+') ) {
			result = A+B;
		}else if (C == ('-')) {  //String으로 입력받았다면 equals()를 사용해서 비교할 수있다.
			
			result = A-B;
		}else if (C == ('*')) {
			result = A*B;
		}else if (C == ('/')) {
			result = A/B;
		}
		
		System.out.println("A"+C+"B = "+result);
		
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException ");  
		} catch (MissingResourceException e) {
			System.out.println("MissingResourceException ");  
		} catch (Exception e) {
			System.out.println("Exception ");  
		} // try end
		
		in.close();
		
		
	}// end main
}// end class
