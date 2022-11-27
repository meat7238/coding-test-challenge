package 백준.브론즈;

import java.util.Scanner;
//5>4>3 큰 순으로 출력하는 프로그램 작성
//논리연산,교환알고리즘,if 이용
public class x0000_Big3 {
	public static void main(String[] args) {
		
		
		int A=0, B=0,C=0,temp = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("큰 순으로 출력하는 프로그램");
		System.out.print("A를 입력하세요 : ");
		A=in.nextInt();
		System.out.print("B를 입력하세요 : ");
		B=in.nextInt();
		System.out.print("C를 입력하세요 : ");
		C=in.nextInt();
		
//		A B C , A C B , B A C , B C A , C A B , C B A
		
		if (A>B&&A>C) {
			System.out.println(A+" "+B+" "+C);
		} else if(A>B&&C>B) {
			System.out.println(A+" "+C+" "+B);		}
		if (B>A&&A>C) {
			System.out.println(B+" "+A+" "+C);
		} else if(B>A&&C>A) {
			System.out.println(B+" "+C+" "+A);		}
		if (C>A&&A>B) {
			System.out.println(C+" "+A+" "+B);
		} else if(C>B&&B>A) {
			System.out.println(C+" "+B+" "+A);
		}
			
		

		
	}
}
