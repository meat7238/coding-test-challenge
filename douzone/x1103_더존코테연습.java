package douzone;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class x1103_더존코테연습 {
	static int AnswerN;
	static int N = 10;
	static int M;

	public static void main(String[] args) {
		// System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		HashMap<Integer, Integer> dice = new HashMap<>();
		for (int test_case = 1; test_case <= T; test_case++) {
			int position = 0;
			int sum = 0;
			int minsum = 0;
			int flag = 0;
			N = sc.nextInt();
			M = sc.nextInt();

			LinkedList<Integer> valueList = new LinkedList<>();
			LinkedList<Integer> SumList = new LinkedList<>();

			for (int i = 0; i < 4 * (N - 1); i++) {
				valueList.add(sc.nextInt());
			}

			for (int i = 1; i <= 6; i++) {
				dice.put(i, M);
			}

			for (int i = 1; i <= 6; i++) {
				for (int j = 1; j <= 6; j++) {
					if (dice.get(j) == 0)
						continue;
					for (int k = 1; k <= 6; k++) {
						if (dice.get(k) == 0)
							continue;
						for (int l = 1; l <= 6; l++) {
							if (dice.get(l) == 0)
								continue;
							for (int m = 1; m <= 6; m++) {
								if (dice.get(m) == 0)
									continue;
								for (int n = 1; n <= 6; n++) {
									if (dice.get(n) > 0) {
										position += i;
										sum += valueList.get(position);
										dice.put(i, dice.get(i) - 1);

										position += j;
										sum += valueList.get(position);
										dice.put(j, dice.get(j) - 1);

										position += k;
										sum += valueList.get(position);
										dice.put(k, dice.get(k) - 1);

										position += l;
										sum += valueList.get(position);
										dice.put(l, dice.get(l) - 1);

										position += m;
										sum += valueList.get(position);
										dice.put(m, dice.get(m) - 1);

										position += n;
										sum += valueList.get(position);
										dice.put(n, dice.get(n) - 1);

										minsum = Math.min(sum, minsum);
									}

								}
							}
						}
					}
				}
			}
			AnswerN = minsum;
			System.out.println("#" + test_case + " " + AnswerN);
		}
//			while (flag == 0) {
//
//				sum = 0;
//
////				Integer value = dice.get(key);
////				System.out.println("[key]:" + key + ", [value]:" + value);
//				for (Integer key : dice.keySet()) {
//					if (dice.get(key) > 0)
//						flag += 0;
//					else
//						flag += 1;
//				}
//
//			}
//		    for(let i = 0; i < arr.length; i++){
//		        // for j : 두번째 index에 위치
//		        for(let j = 0; j < arr.length; j++){
//		            // i 와 중복되면 안되니까 i == j 라면 스킵.
//		            if(i == j) continue;
//		            // for k : 세번째 index에 위치
//		            for(let k = 0; k < arr.length; k++){
//		                if(i == k) continue;
//		                if(j == k) continue;
//
//		                console.log(arr[i], arr[j], arr[k]);
//		                count++;
//		            }
//		        }
//		    }
	}
}
