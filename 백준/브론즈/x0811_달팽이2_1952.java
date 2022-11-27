package 백준.브론즈;

import java.util.Scanner;

public class x0811_달팽이2_1952 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt = 0, x = 1, y = 1;
		int m = in.nextInt();
		int n = in.nextInt();
		
		while(true) {
			y++;			//행의 시작값 증가 
			if(y>m) break;
			cnt++;
			
			n--;			//열의 끝값 감소 
			if(x>n) break;
			cnt++;
			
			m--;			//행의 끝값 감소 
			if(y>m) break; 
			cnt++;
			
			x++;			//행의 시작값 증가 
			if(x>n) break;
			cnt++;
		}
		System.out.println(cnt);
	}
}
