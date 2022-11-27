package 백준.브론즈;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class x1019_줄세우기_2605 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=N;i++) {
			list.add(sc.nextInt(),i);
		}
		for(int i = N-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}
}
