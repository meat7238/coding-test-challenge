package 백준.골드;

import java.util.Scanner;

public class x1202_별찍기10_2447 {
    private static final String LINE = System.getProperty("line.separator");
    static String[][] star;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        star = new String[N][N];
        calculate(0, 0, N, false);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(star[i][j]);
            }
            sb.append(LINE);
        }
        System.out.print(sb);
    }

    private static void calculate(int x, int y, int N, boolean check) {
        if (check) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    star[i][j] = " ";
                }
            }
            return;
        }
        if (N == 1) {
            star[x][y] = "*";
            return;
        }
        int checkNull = 0;
        for (int i = x; i < x + N; i += N / 3) {
            for (int j = y; j < y + N; j += N / 3) {
                checkNull++;
                calculate(i, j, N / 3, false);
                if (checkNull == 5) calculate(i, j, N / 3, true);
            }
        }
    }
}

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        String[][] dot = {{"*","*","*"},{"*"," ","*"},{"*","*","*"}};
//        String[][] nul = {{" "," "," "},{" "," "," "},{" "," "," "}};
////        String result[][] = new String[3][3];
//        String[][] result = dot;
//        for(int i=3 ; i<=N; i*=3){
//            String[][] cal = new String[3][3];
//            for(int j = 0; j<3; j++){
//                for(int k = 0; k<3; k++){
////                    if(j==1&&k==1)
//                  cal[j][k] = Arrays.deepToString(result);
//                }
//            }
//            result = cal;
//        }

//        String[][] store;
//        for(int i = 1 ; i<= N;i*=3){
//            store = new String[3][3];
//            dot=calculate(dot);
//        }

//        StringBuilder result = new StringBuilder();
//        for(int i = 0; i< 3;i++) result.append(dot);
//        result.append(LINE);
//        result.append(dot).append(calculateNull(dot)).append(dot);
//        result.append(LINE);
//        for(int i = 0; i< 3;i++) result.append(dot);
//        return result.toString();

//    private static String[][] getNullArray() {
//        String[][] result = new String[3][3];
////        for(int i=0;i<3;i++){
////            for(int j=0;j<3;j++){
////                result[i][j] =
////            }
////        }
//        return result;
//    }