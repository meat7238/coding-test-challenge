package 프로그래머스.lv1;

import java.util.ArrayList;
import java.util.List;

public class x만큼간격이있는n개의숫자 {
	public static void main(String[] args) {
		int x=5, n=5;
		long[] answer = new long[n];
		for(int i=0; i<n; i++) {
		answer[i] = x*(i+1);
		}
	}
}
