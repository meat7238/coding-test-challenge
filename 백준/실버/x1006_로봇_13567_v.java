package 백준.실버;

import java.util.Scanner;

public class x1006_로봇_13567_v {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M  = sc.nextInt();
		int n = sc.nextInt();
		int state = 1;
		locate locate = new locate(0,0);
		for(int i =0; i<n; i++ ) {
			switch (sc.next()) {
			case "MOVE":
				if(state==0)
					locate.y +=sc.nextInt();
				else if(state==1)
					locate.x +=sc.nextInt();
				else if(state==2)
					locate.y -=sc.nextInt();
				else if(state==3)
					locate.x -=sc.nextInt();
				if(locate.x>M|locate.x<0|locate.y>M|locate.y<0) {
					System.out.println(-1);
					System.exit(0);
				}
					
				break;
			case "TURN":
				switch (sc.nextInt()) {
				case 0:
					--state;
					break;
				case 1:
					++state;
					break;
				}
				if(state<0)
					state = 3;
				else if(state>3)
					state = 0;
				break;
			}
			
		}
		System.out.println(locate.x + " " + locate.y);
	}
	
}

class locate {
	int x,y;
	locate(){};
	
	locate(int x, int y){
		this.x = x;
		this.y = y;
	}
}




//public class x1006_로봇_13567 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		position pt = new position();
//		int M = sc.nextInt();
//		int n = sc.nextInt();
//		for( int i = 0 ; i< n; i++) {
//			switch (sc.next()) {
//			case "MOVE":
//				if(pt.getDir()==0) pt.setNextX(pt.getNextX()+sc.nextInt());
//				else if(pt.getDir()==1) pt.setNextY(pt.getNextY()-sc.nextInt());
//				else if(pt.getDir()==2) pt.setNextX(pt.getNextX()-sc.nextInt());
//				else if(pt.getDir()==3) pt.setNextY(pt.getNextY()+sc.nextInt());
//				break;
//			case "TURN":
//				if(sc.nextInt() == 0) pt.setDir(pt.getDir()-1);
//				else pt.setDir(pt.getDir()+1);
//				if(pt.getDir()>3) pt.setDir(0);
//				if(pt.getDir()<0) pt.setDir(3);
//				break;
//			}
//			if(pt.getNextX()<=M & pt.getNextX()>=0 & pt.getNextY()<=M & pt.getNextY()>=0) {
//				pt.setX(pt.getNextX());
//				pt.setY(pt.getNextY());
//			}else {
//				System.out.println("-1");
//				System.exit(0);
//			}
//		}
//		System.out.println(pt.getX() + " "+ pt.getY());
//		
//		
//		
//	}
//}
//
//class position {
//	private int x,y,nextX,nextY,dir;
//	position() {
//		x=0; y=0;nextX=0;nextY=0;dir=0;
//	}
//	public int getX() {
//		return x;
//	}
//	public void setX(int x) {
//		this.x = x;
//	}
//	public int getY() {
//		return y;
//	}
//	public void setY(int y) {
//		this.y = y;
//	}
//	public int getNextX() {
//		return nextX;
//	}
//	public void setNextX(int nextX) {
//		this.nextX = nextX;
//	}
//	public int getNextY() {
//		return nextY;
//	}
//	public void setNextY(int nextY) {
//		this.nextY = nextY;
//	}
//	public int getDir() {
//		return dir;
//	}
//	public void setDir(int dir) {
//		this.dir = dir;
//	}
//	
//}
