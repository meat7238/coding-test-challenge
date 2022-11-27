package 백준.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class x1117_수정렬하기2_2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList list = new ArrayList<Integer>();
		StringBuilder stringBuilder = new StringBuilder();
		while(n--> 0) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		for(int i=0; i<list.size();i++) {
			stringBuilder.append(list.get(i)).append("\n");
		}
		System.out.println(stringBuilder);
	}
}
