package 백준.브론즈;

import java.util.Scanner;

public class x0831_ACM호텔_10250 {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int T,H,W,N;
	String str = "";
	T = in.nextInt();
	while(T>0){
	H = in.nextInt();
	W = in.nextInt();
	N = in.nextInt();
	
	int we;
	int He;
	if(N%H==0) {
		He = H;
		we = N/H;
	}else {
		He = N%H;
		we = N/H +1;
	}
	str += (100*He+we) + "\n";
	T--;
	}
	System.out.println(str);
	
		
		
		
		
	}
}
