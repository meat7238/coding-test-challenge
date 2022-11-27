package 백준.브론즈;

public class x0803_Selfnum_4673 {
	public static void main(String[] args) {

		boolean[] why = new boolean[10000];
		for(int i=1; i<10001;i++) {
			if(d(i)<10001)
				why[d(i)-1] = true;
		}
		for(int i=1; i<10001; i++) {
			if (why[i-1] == false)
				System.out.println(i);
		}
		
	}//end main
	
	static int d(int num) {
		int sum = num;
		
		while(num>0) {
		sum += num % 10;
		num /= 10;
		}
		return sum;
	}
	
}//end class







//int a, b, c, d, e;
//boolean[] x = new boolean[10001];
//
//for (int i = 1; i < 10001; i++) {
//	int n =d(i)
//	if (i <= 0)
//		x[i] = 1;
//	a = (i + 1) / 10000;
//	b = ((i + 1) % 10000) / 1000;
//	c = ((i + 1) % 1000) / 100;
//	d = ((i + 1) % 100) / 10;
//	e = ((i + 1) % 10);
//	x[i + 1] = x[i] + a + b + c + d + e;
//
//}
//
//for (int i = 0; i < 10000; i++) {
//	for (int j = 0; j < 10000; j++) {
//		if (x[i] != j)
//			System.out.println(i);
//			break;
//	}
//}