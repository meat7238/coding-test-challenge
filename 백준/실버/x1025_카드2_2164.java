package 백준.실버;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class x1025_카드2_2164 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = 0;
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		int i=1;
		while(q.size()>1) {
		if (i % 2 == 1) {
				q.remove();
			} else if (i % 2 == 0) {
				temp = q.poll();
				q.add(temp);
			}
		i++;
		}
		System.out.println(q.poll());

	}
}
