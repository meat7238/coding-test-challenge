package douzone;
import java.util.Scanner;

public class x0000_더존1차코테연습 {

   static char map[][];
   static int num=0;
   static int dx[]=new int[]{-1,0,1,0};
   static int dy[]=new int[]{0,1,0,-1};
   static int cnt;

   
   
   public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++) {
         cnt=0;
         num=sc.nextInt();
         map=new char [num][num];
         int xx=0,xy=0;
         for(int j=0;j<num;j++) {
            
            for(int k=0;k<num;k++) {
               
               map[j][k]=sc.next().charAt(0);
               if(map[j][k]=='X') {
                  xx=j;
                  xy=k;
                  
               }
               
            }
            
            
         }
         
         chk(xx,xy);
      
         System.out.println("#"+(i+1)+" "+cnt);
         
         
         
      }
      
      
      
   }
   public static void chk(int x,int y) {
      for(int i=0;i<4;i++) {
         if(x+dx[i]>=0 && x+dx[i]<=num-1 && y+dy[i] >=0 && y+dy[i]<=num-1) {
            if(map[x+dx[i]][y+dy[i]]=='L') {
            
               move(x+dx[i],y+dy[i],dx[i],dy[i]);
            }
            else if(map[x+dx[i]][y+dy[i]]=='H') {
               H_check(x+dx[i],y+dy[i],dx[i],dy[i]);
            }
         }
      }
      
      
   }
   public static void move(int x,int y,int dx,int dy) {
      if(x+dx>=0 && x+dx<=num-1 && y+dy >=0 && y+dy<=num-1) {
         if(map[x+dx][y+dy]=='L') {
   
            move(x+dx,y+dy,dx,dy);
         }
         else if(map[x+dx][y+dy]=='H' ) {
   
            H_check(x,y,dx,dy);
         }
      }
   }
   public static void H_check(int x,int y,int dx,int dy) {

      if(x+dx>=0 && x+dx<=num-1 && y+dy >=0 && y+dy<=num-1) {
         
         if(map[x+dx][y+dy]=='L' ) {
            H_check(x+dx,y+dy,dx,dy);
         }
         else if(map[x+dx][y+dy] =='H' ) {

            cnt++;
            
         }
         
      }
   }
   


}