package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class x0817_요세푸스_11866 {
	/**1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 
	 * 이제 순서대로 K번째 사람을 제거한다. 
	 * 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
	 * 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
	 * 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 
	 * 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
	 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s=bf.readLine();
		StringTokenizer ss = new StringTokenizer(s);
		int N = Integer.parseInt(ss.nextToken());
		int K = Integer.parseInt(ss.nextToken());
		LinkedList<Integer> lis = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int cnt=0,cheak=-1,test=0;
		for(int i=0;i<N;i++) {
			lis.offer(i+1);
//			sb.append(lis.get(i));
//			if(i>=0&&i<(N-1)) {
//				sb.append(", ");
//			}
		}
		while(lis.size()!=0) {
			if (lis.size()==1) {
				sb.append(lis.get(0));
				lis.remove(0);
				sb.append(">");
				break;
			}
			while(++cnt<K) {
				cheak++;
				if((cheak+1)==lis.size()) {
					cheak=-1;
				}
			}
			if (cnt==K) {
				sb.append(lis.get(cheak+1)).append(", ");
				test=lis.get(cheak+1);
				lis.remove(cheak+1);
				N=lis.size();
				if((cheak+1)==lis.size()) {
					cheak=-1;
				}
				cnt=0;
			}

		}
		
//		sb.append(">");
		System.out.println(sb);
		
		
		
	}
}
