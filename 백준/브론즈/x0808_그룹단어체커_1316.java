package 백준.브론즈;

import java.util.Scanner;

public class x0808_그룹단어체커_1316 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			sum +=Cheak(in.next(),0);
		}
		System.out.println(sum);
	}

	public static int Cheak(String a, int b) {
		int f = 0;
		if(b>=a.length()-1)return 1;
		for (int i = b+1; i < a.length(); i++) {
			if (a.charAt(i) != a.charAt(i-1) ) {
				f = i;
				break;
			}
		}
		if (f==0) return 1;
		for (int i = f; i < a.length(); i++) {
			if (a.charAt(i) == a.charAt(b))
				return 0;
		}
		return Cheak(a, f);

	}

}// end class
