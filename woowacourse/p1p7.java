package woowacourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class p1p7 {
	public static void main(String[] args) {
		String user = "mrko";
        List<List<String>> friends = List.of(
                List.of("donut", "andole"),
                List.of("donut", "jun"),
                List.of("donut", "mrko"),
                List.of("shakevan", "andole"),
                List.of("shakevan", "jun"),
                List.of("shakevan", "mrko")
        );
        List<String> visitors = List.of("bedi", "bedi", "donut", "bedi", "shakevan","nana","po","ha");
        List<String> result = List.of("andole", "jun", "bedi");
		//-----------------------------------
        
        
        
		HashMap<String, Integer> point = new HashMap<String, Integer>();
		
		for(int i=0;i<friends.size();i++) {
			point.put(friends.get(i).get(1), 
					point.getOrDefault(friends.get(i).get(1), 0)+10);
		}
		
		for(int i =0; i<visitors.size();i++) {
			point.put(visitors.get(i), 
					point.getOrDefault(visitors.get(i), 0)+1);
		}
		
		for(int i=0;i<friends.size();i++) {
			if(friends.get(i).get(1)==user)
			point.remove(friends.get(i).get(0));
		}
		point.remove(user);
		
		
		List<String> answer =new ArrayList<>(point.keySet());
		Collections.sort(answer,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(point.get(o2)==point.get(o1)) {
					return o1.compareTo(o2);
				}
				else return point.get(o2)-point.get(o1);
			}
		});
		
		if(answer.size()>5) {
			for(int i=5;i<answer.size();i++) {
				answer.remove(i);
			}
		}
		
		System.out.println(point);
        System.out.println(answer);

	}
}
