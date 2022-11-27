package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class x1021_덱_10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Deque<String> deque = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
			case "push_front":
				deque.addFirst(st.nextToken());
				break;
			case "push_back":
				deque.addLast(st.nextToken());
				break;
			case "pop_front":
				if(deque.isEmpty()) {
					System.out.println("-1");
					break;
				}
				System.out.println(deque.pollFirst()); 
				break;
			case "pop_back":
				if(deque.isEmpty()) {
					System.out.println("-1");
					break;
				}
				System.out.println(deque.pollLast()); 
				deque.removeLast();
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if(deque.isEmpty()) {System.out.println("1");
				break;
				}
				else System.out.println("0");
				break;
			case "front":
				if(deque.isEmpty()) {
					System.out.println("-1");
					break;
				}
				System.out.println(deque.peekFirst()); 
				break;
			case "back":
				if(deque.isEmpty()) {
					System.out.println("-1");
					break;
				}
				System.out.println(deque.peekLast()); 
				break;
			}
		}

	}
}
