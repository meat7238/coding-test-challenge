package 백준.실버;



/**
 * @author meat
 *매일 측정한 온도가 정수의 수열로 주어졌을 때, 
 *연속적인 며칠 동안의 온도의 합이 가장 큰 값을 계산하는 프로그램을 작성하시오. 
 *입력
 *10 2
 *3 -2 -4 -9 0 3 7 13 8 -3
 *출력
 *21
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class x0919_수열_2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(s.nextToken());
		int K = Integer.parseInt(s.nextToken());
		s = new StringTokenizer(br.readLine());
		int[] arrN = new int[N];
		int sum=0;
		int max=-10000001;
		for(int i =0; i<N;i++) {
			arrN[i] = Integer.parseInt(s.nextToken());
			if( i+1>=K) {
				for(int j=(i+1)-K;j<=i;j++) {
				sum+=arrN[j];
				}
				max = Math.max(max, sum);
				sum = 0;
			}
		}
		System.out.println(max);
		
		
	}

}
/* 시간초과

public class 수열_2559_부분합이용 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum,max=0;
		for(int i =0; i<N;i++) {
			list.add(sc.nextInt());
		}
		
		for(int i=0; i<N-K+1; i++) {
			sum=0;
			for(int j=i; j<i+K;j++) {
				sum+=list.get(j);
			}
			System.out.println(sum);
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

}
*/
