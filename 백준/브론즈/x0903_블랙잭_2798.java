package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class x0903_블랙잭_2798 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] num = new int[N];
		int max=0;
		
		for(int i=0;i<num.length;i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				for(int k=j+1;k<num.length;k++) {
					max = (max<=(num[i]+num[j]+num[k]))&(num[i]+num[j]+num[k])<=M? (num[i]+num[j]+num[k]) : max;
				}
			}
		}
		System.out.println(max);
	}
}
