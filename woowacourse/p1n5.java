package woowacourse;

import java.util.ArrayList;
import java.util.List;

public class p1n5 {
	public static void main(String[] args) {
		int money = 15000;
		//-----------------------------------------------------
		int temp = money;
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(temp/50000);
        temp %=50000;
        answer.add(temp/10000);
        temp %=10000;
        answer.add(temp/5000);
        temp %=5000;
        answer.add(temp/1000);
        temp %=1000;
        answer.add(temp/500);
        temp %=500;
        answer.add(temp/100);
        temp %=100;
        answer.add(temp/50);
        temp %=50;
        answer.add(temp/10);
        temp %=10;
        answer.add(temp/1);
        
        
        System.out.println(answer);
	}
}
