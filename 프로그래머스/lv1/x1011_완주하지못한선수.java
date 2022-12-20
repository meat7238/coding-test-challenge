package 프로그래머스.lv1;

import java.util.HashMap;
import java.util.Map;

public class x1011_완주하지못한선수 {
	public static void main(String[] args) {
//	Solution1011 s = new Solution1011();
		Solution1220 s = new Solution1220();
	String[] participant = {"mislav","stanko","mislav","ana"};
	String[] completion = {"stanko","ana","mislav"};
	System.out.println(s.solution(participant, completion));
	}
}

//class Solution1011 {
//    public String solution(String[] participant, String[] completion) {
//		HashMap<String, Integer> map = new HashMap<>();
//
//		for(String s : participant)	map.put(s, map.getOrDefault(s, 0)+1);
//		for(String s : completion) map.put(s, map.get(s)-1);
//
//
//		String answer = "";
//		for(Map.Entry<String, Integer> entry : map.entrySet()) {
//			if(entry.getValue()>0) {
//				answer += entry.getKey();
//				break;
//			}
//
//		}
//        return answer;
//    }
//}

	class Solution1220 {
		public String solution(String[] participant, String[] completion) {
			HashMap<String, Integer> map = new HashMap<>();
			for(String s : participant){
				map.put(s, map.getOrDefault(s,0)+1);
			}
			for(Map.Entry<String,Integer> entry : map.entrySet() ){
				System.out.println(entry.getKey() + " / " + entry.getValue());
			}
			for(String s : completion){
			}
			return "";
		}
	}