package 백준.실버;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class x0905_영화감독숌_1436 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt=0;
		
		for(int i=666;;i++) {
			if(Integer.toString(i).contains("666"))	
				cnt++;
			if(cnt==N) {
				System.out.println(i);
				break;
			}
		}
		}
	
}
//public class 영화감독숌_1436_정규표현 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//		String pt = "[0-9]*[6]{3}[0-9]*";
//		List<Integer> list = new ArrayList();
//		for(int i=666; i<=3000001; i++) {
//			if(Pattern.matches(pt, Integer.toString(i))) {
//				list.add(i);
//			}
//		}
//		System.out.println(list);
//		System.out.println(list.get(N-1));
//				
//	}
//}
