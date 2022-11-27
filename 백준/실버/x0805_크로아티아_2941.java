package 백준.실버;

import java.util.Scanner;

public class x0805_크로아티아_2941 {
	static int cnt;

	public static void main(String[] args) {

		String n = new Scanner(System.in).next();
		int cnt = 0;
		for (int i = 0; i < n.length(); i++) {
			char s = n.charAt(i);
			if (n.charAt(i) == 'c') {
				if ((i+1)<n.length()&& n.charAt(i + 1) == '=' || (i+1)<n.length()&&n.charAt(i + 1) == '-') {
					cnt++;
					i += 1;
				} else
					cnt++;
				continue;
			} else if (n.charAt(i) == 'l') {
				if ((i+1)<n.length()&&n.charAt(i + 1) == 'j') {
					cnt++;
					i += 1;
				} else
					cnt++;
				continue;
			} else if (n.charAt(i) == 'n') {
				if ((i+1)<n.length()&&n.charAt(i + 1) == 'j') {
					cnt++;
					i += 1;
				} else
					cnt++;
				continue;
			} else if (n.charAt(i) == 's') {
				if ((i+1)<n.length()&&n.charAt(i + 1) == '=') {
					cnt++;
					i += 1;
				} else
					cnt++;
				continue;
			} else if (n.charAt(i) == 'z') {
				if ((i+1)<n.length()&&n.charAt(i + 1) == '=') {
					cnt++;
					i += 1;
				continue;
				} else
					cnt++;
				continue;
			} else if (n.charAt(i) == 'd') {
				if ((i+1)<n.length()&&n.charAt(i + 1) == 'z') {
					if ((i+2)<n.length()&&n.charAt(i + 2) == '=') {
						cnt++;
						i += 2;
					} else
						cnt++;
					
					continue;
				} else if ((i+1)<n.length()&&n.charAt(i + 1) == '-') {
					cnt++;
					i += 1;
					continue;
				} else
					cnt++;
				continue;
			} else {
				cnt++;
			}

		}
		System.out.println(cnt);
	}
}