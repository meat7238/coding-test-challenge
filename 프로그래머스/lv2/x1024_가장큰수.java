package 프로그래머스.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class x1024_가장큰수 {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] a = { 0,0,0,0,0,0 };
		System.out.println(s.solution(a));
	}
}

class Solution {
	String solution(int[] numbers) {
		ArrayList<String> list = new ArrayList<>(); 
		for (int i = 0; i < numbers.length; i++) {
			list.add(String.valueOf(numbers[i]));
		}
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int sum1 = Integer.parseInt(o1+o2);
				int sum2 = Integer.parseInt(o2+o1);
				return sum2-sum1;
			};
		});
		String answer = "";
		for(int i =0; i<list.size() ; i++) {
			answer+=list.get(i);
		}
		if(answer.charAt(0)=='0') answer = "0";
		return answer;
		
	}
	
}
