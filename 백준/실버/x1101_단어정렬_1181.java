package 백준.실버;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class x1101_단어정렬_1181 {
	  public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        Scanner sc = new Scanner(System.in);

	        int N = sc.nextInt();
	        for (int i = 0; i < N; i++) {
	            String str = sc.next();
	            if(list.contains(str))
	                continue;
	            list.add(str);
	        }

	        list.sort(new Comparator<String>() {
	            @Override
	            public int compare(String o1, String o2) {
	                if (o1.length() == o2.length())
	                    return o1.compareTo(o2);
	                return o1.length() - o2.length();
	            }
	        });
	        System.out.println(list);
	    }
}
