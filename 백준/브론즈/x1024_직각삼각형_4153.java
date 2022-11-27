package 백준.브론즈;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class x1024_직각삼각형_4153 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	while(true) {
		ArrayList<Integer> list = new ArrayList<>();
			list.add(sc.nextInt());
			list.add(sc.nextInt());
			list.add(sc.nextInt());
		Collections.sort(list);
		
		
		if(list.get(0) ==0 & list.get(1) ==0 & list.get(2) ==0)
			break;
		if(list.get(2)*list.get(2) ==list.get(0)*list.get(0)+list.get(1)*list.get(1) )
		System.out.println("right");
		else System.out.println("wrong");
	}
}
}
