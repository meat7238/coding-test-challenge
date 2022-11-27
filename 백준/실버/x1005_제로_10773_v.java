package 백준.실버;

import java.util.Scanner;
import java.util.Stack;

public class x1005_제로_10773_v {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int tmp=-1;
		int sum = 0;
		for(int i = 0; i<K ; i++) {
			tmp = sc.nextInt();
			if(tmp==0) {
				st.pop();
				continue;
			}
			st.push(tmp);
		}
		for(int t : st) {
			 sum+=t;
		}
System.out.println(sum);
	}
}
