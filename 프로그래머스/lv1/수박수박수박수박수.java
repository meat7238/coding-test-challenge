package 프로그래머스.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수박수박수박수박수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String answer = "";
		for(int i=0; i<n; i++) {
			answer += (i%2==0)? "수":"박";
		}
		System.out.println(answer);
		
		
	}

}
