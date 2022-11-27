package 프로그래머스.lv1;

import java.util.ArrayList;

public class 신규아이디추천 {
	public static void main(String[] args) {
		String new_id = "abcdefghijklmn.p";
		//1
		new_id = new_id.toLowerCase();
		ArrayList<Character> list = new ArrayList<Character>();
		char[] id_char = new_id.toCharArray();
		for(char ch : id_char)
			list.add(ch);
		//2
		for (int i = 0; i < list.size(); i++) {
			if((list.get(i) >=97&&list.get(i)<=122)||(list.get(i)<=57&&list.get(i)>=48)||list.get(i)==45||list.get(i)==95||list.get(i)==46)
				continue;
			else {
				list.remove(i);
				i--;
			}
		}
		//3
		for (int i = 1; i < list.size(); i++) {
			
			if(list.get(i).equals('.')) {
				if(list.get(i-1).equals('.')) {
					list.remove(i-1);
					i--;
				}
			}
		}
		//5
		//4
		try {
		if(list.get(0).equals('.'))
			list.remove(0);
		if(list.get(list.size()-1).equals('.'))
			list.remove(list.size()-1);
		}catch(Exception e) {
			if(list.size()==0) list.add('a');
		}
			
		//6
		
		if(list.size()>=16) 
		for(int i=15;i<list.size();i++) {
			list.remove(i);
			i--;
		}
		if(list.get(list.size()-1).equals('.'))
			list.remove(list.size()-1);
		//7
		if(list.size()<=2)
			while(list.size()<3) {
				list.add(list.get(list.size()-1));
			}
		
        String answer = "";
		for(Character s : list ) {
			answer += s;
		}
//		for(byte i=0; i<127;i++)
//		System.out.println(i+" : "+(char)i);
//			
		
		System.out.println(answer);
}
}
