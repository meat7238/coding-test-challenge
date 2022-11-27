package 백준.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class x0824_피보나치_10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fi(n));
	}

	static int fi(int n) {
		int[] fi = new int[n+1];
		if(n<=0) return 0;
		else if(n<=2){
		return 1;
		}
		if (fi[n] != 0) {
			return n;
		} else
			fi[n] = fi(n - 1) + fi(n - 2);
		return fi[n];

	}
}
