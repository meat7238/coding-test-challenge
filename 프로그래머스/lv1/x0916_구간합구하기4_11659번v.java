package 프로그래머스.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class x0916_구간합구하기4_11659번v {
	/**
	 * @param args
	 * @throws IOException 
	 * 입력 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 
	 * 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 
	 * 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다. 
	 * 출력 총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.
	 *  1 ≤ N ≤ 100,000 1 ≤ M ≤ 100,000 1 ≤ i ≤ j ≤ N
	 * 
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer str = new StringTokenizer(s);
		ArrayList<Integer> list = new ArrayList();
		int first=0;
		int last=0;
		int th=0;
		int sum;
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		s = br.readLine();
		str = new StringTokenizer(s);
		list.add(0);
		for (int i = 0; i < N; i++) {
			th += Integer.parseInt(str.nextToken());
			list.add(th);
		}
		for (int i = 0; i < M; i++) {
			sum=0;
			s = br.readLine();
			str = new StringTokenizer(s);
			first=Integer.parseInt(str.nextToken());
			last=Integer.parseInt(str.nextToken());
			
			sum = list.get(last)-list.get(first-1);
			System.out.println(sum);
		}
	}
}
//public class 구간합구하기복습 {
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in); 
//	int N = sc.nextInt();
//	int M = sc.nextInt();
//	int[] num = new int[N+1];
//	num[0] = 0;
//		for(int i = 1 ; i<N+1; i++) {
//		num[i] = num[i-1]+sc.nextInt();
//	}
//		
//		for(int j=0;j<M;j++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			System.out.println(num[b]-num[a-1]);
//		}
//}
//
//}
