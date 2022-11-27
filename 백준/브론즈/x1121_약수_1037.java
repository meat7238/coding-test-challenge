package 백준.브론즈;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class x1121_약수_1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List divisors = new ArrayList<>();
		for(int i=0; i<N; i++) {
			divisors.add(sc.nextInt());
		}
		Collections.sort(divisors);
		System.out.println((int)divisors.get(0)*(int)(divisors.get(divisors.size()-1)));
	}
}
