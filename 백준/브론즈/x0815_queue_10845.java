package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class x0815_queue_10845 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		Queue<Integer> que = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		int last = 0;
		String s;
		
		for (int i = 0; i < N; i++) {
			s = bf.readLine();
			StringTokenizer ss = new StringTokenizer(s);
			switch (ss.nextToken()) {
			case "push":
				last = Integer.parseInt(ss.nextToken());
				que.offer(last);
				break;
			case "pop":
				if (que.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(que.poll()).append("\n");
				}
				break;
			case "size":
				sb.append(que.size()).append("\n");
				break;
			case "empty":
				if (que.isEmpty())
					sb.append(1).append("\n");
				else
					sb.append(0).append("\n");
				break;
			case "front":
				if (que.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(que.peek()).append("\n");
				break;
			case "back":
				if (que.isEmpty())
					sb.append(-1).append("\n");
				else
					sb.append(last).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
