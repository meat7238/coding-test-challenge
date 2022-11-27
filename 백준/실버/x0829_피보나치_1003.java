package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class x0829_피보나치_1003 {
	static int[] f;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		int T = Integer.parseInt(br.readLine());
		int N;
		for(int i=0; i<T; i++) {
			N = Integer.parseInt(br.readLine());
			f=new int[N+1];
			s += fibonacci(N-1)+ " "+ fibonacci(N)+"\n";
			for(int j=0; j<N; j++) {
				if(f[N]!=0) f[N]=0;
			}
				
		}
		System.out.println(s);
	}
	static int fibonacci(int n) {
		
		if (n<0) return 1;
	    if (n == 0) {
	        return 0;
	    } else if (n == 1) {
	        return 1;
	    } else if(f[n]!=0) return f[n];
	    	else {
	        f[n]= fibonacci(n-1) + fibonacci(n-2);
	    } return f[n];
	}	
}
