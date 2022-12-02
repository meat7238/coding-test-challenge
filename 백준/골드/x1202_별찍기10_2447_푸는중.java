package 백준.골드;

import java.util.Arrays;
import java.util.Scanner;

public class x1202_별찍기10_2447_푸는중 {
    private static String LINE = System.lineSeparator();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] dot = {{"*","*","*"},{"*"," ","*"},{"*","*","*"}};
        String[][] nul = {{" "," "," "},{" "," "," "},{" "," "," "}};
//        String result[][] = new String[3][3];
        String[][] result = dot;
        for(int i=3 ; i<=N; i*=3){
            String[][] cal = new String[3][3];
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
//                    if(j==1&&k==1)
                  cal[j][k] = Arrays.deepToString(result);
                }
            }
            result = cal;
        }

//        String[][] store;
//        for(int i = 1 ; i<= N;i*=3){
//            store = new String[3][3];
//            dot=calculate(dot);
//        }
        System.out.println(Arrays.deepToString(result));
        for(String s : result[3]){
            System.out.println(s+LINE);

        }

    }

//    private static String[] calculate(String[] dot){
//        StringBuilder result = new StringBuilder();
//        for(int i = 0; i< 3;i++) result.append(dot);
//        result.append(LINE);
//        result.append(dot).append(calculateNull(dot)).append(dot);
//        result.append(LINE);
//        for(int i = 0; i< 3;i++) result.append(dot);
//        return result.toString();
//    }

    private static String[][] getNullArray(){
        String[][] result = new String[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                result[i][j] =
//            }
//        }
        return result;
    }

}
