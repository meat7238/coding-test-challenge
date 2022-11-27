package 백준.브론즈;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class x0000_Date {
	
	
	public static void main(String[] args) {
		
		//현재 날짜 구하기
//		LocalDate now = LocalDate.now();
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String formatedNow = now.format(formatter);
		
				
		System.out.println(formatedNow);
		
	}
}
