package 프로그래머스.lv1;

public class 최소직사각형{

	public static void main(String[] args) {
//		int[][] sizes = new int[5][8]
//				int temp,max0=0;max1=0;
//				for(int i=0;i<sizes.length;i++) {
//					if(size[i][0]< size[i][1]) {
//						temp = size[i][0];
//						size[i][0] = size[i][1];
//						size[i][1] = temp;
//					}
//					if(max0<size[i][0])max0=size[i][0];
//					if(max1<size[i][1])max1=size[i][1];
//					
//				}
//				answer = max0 * max1;
//				
		int length = 0;
		int heigh = 0;
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		for(int card[] : sizes) {
			
			length = Math.max(length, card[0]);
			heigh = Math.max(length, card[1]);
		}
		System.out.println(length * heigh);
	}
}
