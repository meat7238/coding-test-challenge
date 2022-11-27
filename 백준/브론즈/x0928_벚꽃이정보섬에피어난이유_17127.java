package 백준.브론즈;

import java.util.Scanner;

/**
 * @author meat
 *첫째 줄에 벚나무의 개수 N이 주어진다. (4 ≤ N ≤ 10)
 *둘째 줄에 N개의 나무에 피어난 벚꽃의 개수 Ai가 순서대로 주어진다. (1 ≤ Ai ≤ 5)
 */
public class x0928_벚꽃이정보섬에피어난이유_17127 {
	static int[] namu = new int[10];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int answer=0;
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			namu[i] = sc.nextInt();
		}
		for(int a=1; a<N;a++) {
			for(int b=a+1;b<N;b++) {
				for(int c=b+1;c<N;c++) {
					sum=Group(0,a)+Group(a,b)+Group(b,c)+Group(c,N);
					answer = Math.max(answer , sum);
				}
			}
		}
		
		System.out.println(answer);
	}
	
	static int Group(int first,int last) {
		int sum = 1;
		for(int i=first;i<last;i++) {
			sum *= namu[i];
		}
		return sum;
	}
}
