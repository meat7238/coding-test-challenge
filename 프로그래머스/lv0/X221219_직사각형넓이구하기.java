package 프로그래머스.lv0;

import java.util.Arrays;

public class x1219_직사각형넓이구하기 {
    public static void main(String[] args) {
        int[][] dots = {{-1,-1},{1,1},{1,-1},{-1,1}};
        int xmin = Integer.MAX_VALUE;
        int ymin = Integer.MAX_VALUE;
        int xmax = Integer.MIN_VALUE;
        int ymax = Integer.MIN_VALUE;
        System.out.println();
        for(int i = 0; i< dots.length;i++){
            xmin = Math.min(xmin,dots[i][0]);
            xmax = Math.max(xmax,dots[i][0]);
            ymin = Math.min(ymin,dots[i][1]);
            ymax = Math.max(xmax,dots[i][1]);
        }
        System.out.println(xmax + "/" + xmin + "/" + ymax + "/" + ymin);
        int answer = Math.abs((xmax-xmin) * (ymax-ymin));
        System.out.println(answer);

    }
}
