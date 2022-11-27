package 백준.실버;

import java.util.Scanner;

public class x0927_나이트투어_1331 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean[][] ch = new Boolean[6][6];
		String S;
		int x = 0,y=0, tx=0, ty=0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				ch[i][j]=false;
			}
		}
		
		for(int i=0;i<36;i++) {
			S=sc.next();
			int x1 = S.charAt(0)-65;
			int y1 = S.charAt(1)-49;
			
			if(i==0) {
				x=x1;
				tx=x1;
				y=y1;
				ty=y1;
				continue;
			}
				if((i==35)&&((x1-tx)*(x1-tx)+(y1-ty)*(y1-ty)!=5) ) {
					System.out.println("Invalid");
					System.exit(0);
			}
			if (ch[x1][y1]!=true) {
				ch[x1][y1]=true;
			}else if(ch[x1][y1]==true) {
				System.out.println("Invalid");
				System.exit(0);
			}
			if((x1-x)*(x1-x)+(y1-y)*(y1-y)!=5) {
				System.out.println("Invalid");
				System.exit(0);
			}
			x=x1;
			y=y1;
		}
		System.out.println("Valid");
		
		
	}
}
