package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class x0830_돌게임3_9657 {
	static Boolean[] ans;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ans = new Boolean[n + 1];
		ans[0] = false;
		ans[1] = true;
		if (n>1)ans[2] = false;
		if (n>2)ans[3] = true;
		
	
		for (int i = 4; i < n+1; i++) {
			if (ans[i - 1] == true && ans[i - 3] == true && ans[i - 4] == true) {
				ans[i] = false;
			} else
				ans[i] = true;
		}
		if(ans[n]==true) System.out.println("SK");
		else System.out.println("CY");
	}
}