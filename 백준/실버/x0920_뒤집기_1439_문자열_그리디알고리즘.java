package 백준.실버;

import java.util.Scanner;

public class x0920_뒤집기_1439_문자열_그리디알고리즘 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
//		//1. 전부 1로 바꾸는 경우 계산
		String[] s1 = S.split("0");
		int cnt = 0;
		int Answer = 0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i].length() > 0) {
				Answer++;
			}
		}
//		//2. 전부 0으로 바꾸는 경우 계산
		String[] s2 = S.split("1");
		for(int i=0;i<s2.length;i++) {
			if(s2[i].length() > 0) {
				cnt++;
			}
		}
//		//1과 2를 비교해서 적은 횟수의 값 출력 
		Answer = Math.min(Answer, cnt);
		System.out.println(Answer);
		
	}
}
// 답은 나오는데 흠..
//public class 뒤집기_1439_문자열_그리디알고리즘 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String S = sc.next();
//		int A2=0;
//		int Answer = 0;
//		
//		//1. 전부 1로 바꾸는 경우 계산
//		String[] s1 = S.split("0");
//		for(int i=0;i<s1.length;i++) {
//			try {
//			Answer+=(Integer.parseInt(s1[i])>0)? 1:0;
//			}catch(Exception e) {
//				continue;
//			}
//		}
//		System.out.println(Answer);
//		//2. 전부 0으로 바꾸는 경우 계산
//		String[] s2 = S.split("1");
//		for(int i=0;i<s2.length;i++) {
//			try {
//			A2+=(Integer.parseInt(s2[i])>=0)? 1:0;
//			}catch(Exception e) {
//				continue;
//			}
//		}
//		System.out.println(A2);
//		Answer = Math.min(Answer, A2);
//		//1과 2를 비교해서 적은 횟수의 값 출력 
//		System.out.println(Answer);
//	}

