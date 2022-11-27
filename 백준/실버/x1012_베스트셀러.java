package 백준.실버;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class x1012_베스트셀러 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		int N = sc.nextInt();
		int max = Integer.MIN_VALUE;
		String str = "";
		List<String> answer = new ArrayList();
		for (int i = 0; i < N; i++) {
			str = sc.next();
			map.put(str, map.getOrDefault(str, 0) + 1);
			max = Math.max(max, map.get(str));
		}
		
		for (String s : map.keySet()) {
			if (max== map.get(s)) {
				answer.add(s);
			}
		}
		Collections.sort(answer);
		System.out.println(answer.get(0));

	}
}
