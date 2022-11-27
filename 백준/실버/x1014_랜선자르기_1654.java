package 백준.실버;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class x1014_랜선자르기_1654 {
	static List<Long> list = new ArrayList<>();
	static long N = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		N = sc.nextLong(); // K<=N
		Long Max = (long) 0;
		for (int i = 0; i < K; i++) {
			list.add(sc.nextLong());
			Max = Math.max(Max, list.get(i));
		}
		Collections.sort(list);
		System.out.println(find(0, Max+1));
	}

	static long find(long st, long end) {
		int sum = 0;
		while (st < end) {
			long mid = st + (end - st) / 2;
			sum = 0;
			for (int i = 0; i < list.size(); i++) {

				sum += list.get(i) / mid;
			}
			if(sum < N)
				end = mid;
			else
				st = mid+1;
		}
		return st-1;
	}
}
