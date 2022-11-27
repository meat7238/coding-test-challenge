package woowacourse;

import java.util.List;

public class p1n1 {
	public static void main(String[] args) {
		List<Integer> pobi = List.of(97, 98);
		List<Integer> crong = List.of(197, 198);
		int pobi_r = 0, crong_r = 0;
		int answer = Integer.MAX_VALUE;

		for (int i = 0; i < 2; i++) {
			int addup = 0, mulup = 1;
			int temp = pobi.get(i);
			while (temp > 0) {
				addup += temp % 10;
				mulup *= temp % 10;
				temp /= 10;
			}
			pobi_r = Math.max(pobi_r, Math.max(addup, mulup));

			addup = 0;
			mulup = 1;
			temp = crong.get(i);
			while (temp > 0) {
				addup += temp % 10;
				mulup *= temp % 10;
				temp /= 10;
			}
			crong_r = Math.max(crong_r, Math.max(addup, mulup));

		}
		if (pobi.get(1) - pobi.get(0) != 1 | crong.get(1) - crong.get(0) != 1)
			answer = -1;
		else if (pobi_r > crong_r)
			answer = 1;
		else if (pobi_r < crong_r)
			answer = 2;
		else if (pobi_r == crong_r)
			answer = 0;
		else answer = -1;
			System.out.println(answer);
	}

}
