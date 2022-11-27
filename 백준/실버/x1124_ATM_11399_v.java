package 백준.실버;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class x1124_ATM_11399_v {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		int sum = 0;
		int answer = 0;
		for( int i : arr) {
			answer += (sum+i);
			sum += i;
		}
		System.out.println(answer);
		
	}
}
