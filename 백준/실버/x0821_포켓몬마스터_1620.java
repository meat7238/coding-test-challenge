package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class x0821_포켓몬마스터_1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> map = new HashMap();
		HashMap<String, Integer> map2 = new HashMap();
		String Str;
		for (int i = 0; i < N; i++) {
			Str = br.readLine();
			map.put(i + 1, Str);
			map2.put(Str, i+1);
		}
		for (int i = 0; i < M; i++) {
			Str = br.readLine();
			if (isNum(Str)) {
				System.out.println(map.get(Integer.parseInt(Str)));
			} else {
				System.out.println(map2.get(Str));
			}
		}
	}// end main
	
	static boolean isNum(String str) {
			if (!Character.isDigit(str.charAt(0))) {
				return false;
			}
		return true; 
	}
}

//시간초과 원인 				
//for (Integer key : map.keySet()) {
//	if (map.get(key).equals(Str)) {
//		System.out.println(key);
//	}
//}
//모든 key값을 대입해서 찾다보니 key값이 규모가 커지면 탐색시간도 길어지는 문제가 발생한다.
//탐색을 for 순차탐색이 아닌 hash 방식을 이용해야만 한다.
//따라서 hashmap을 한개 더 생성.
