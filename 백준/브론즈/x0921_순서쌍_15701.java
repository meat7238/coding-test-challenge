package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class x0921_순서쌍_15701 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=1; i<=Math.sqrt(N);i++) {
			cnt += (N%i==0)? 2:0; 
		}
		if(N%Math.sqrt(N)==0)cnt--;
		System.out.println(cnt);
		
	}
}
