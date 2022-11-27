package 백준.브론즈;

import java.util.HashMap;
import java.util.Scanner;

public class x1031_단어공부_1157 {
	static char answer = '\0';
	static int max = Integer.MIN_VALUE;
	static int flag=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		map.forEach((key,value)->{
			if(max<value) {
				answer = key;
				max = value;
			}
		});
		map.forEach((key,value)->{
			if(max==value) {
				flag++;
			}
		});
		if(flag>1) answer = '?';
		System.out.println(answer);
	}
}
