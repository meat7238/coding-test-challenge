package 백준.실버;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class x1017_듣보잡_1764 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		String str ="";
		for(int i =0; i<N;i++) {
			str = sc.next();
			map.put(str, str);
		}
		
		for(int i = 0; i<M; i++) {
			str = sc.next();
			if(map.containsKey(str)) {
				list.add(str);
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
