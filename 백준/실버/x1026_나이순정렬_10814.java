package 백준.실버;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class person {
	int order;
	int age;
	String name;
	person(int order, int age, String name){
		this.order = order;
		this.age = age;
		this.name = name;
	}
	
}
public class x1026_나이순정렬_10814 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		person[] persons = new person[n];
		for(int i = 0; i<n ; i++) {
			persons[i] = new person(i+1,sc.nextInt(),sc.next());
		}
		
		
		Arrays.sort(persons, new Comparator<person>() {

			@Override
			public int compare(person o1, person o2) {
				// TODO Auto-generated method stub
				if(o1.age != o2.age) {
					return o1.age-o2.age;
				}else {
					return o1.order-o2.order;
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			System.out.println(persons[i].age + " " + persons[i].name);
		}
	}
}
