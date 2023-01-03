package 프로그래머스.lv0;

import java.util.Arrays;

public class x1220_다항식더하기 {
    public static void main(String[] args) {
        String polynomial = "x + x + x";
        int a = 0;   // 계수
        int b = 0;   // 상수
        for (String p : polynomial.split(" ")) {
            if (p.contains("x")) a += p.equals("x") ? 1 : Integer.parseInt(p.substring(0, p.length() - 1));
            else if (!p.equals("+")) b += Integer.parseInt(p);
        }
        String coefStr = a > 0 ? a == 1 ? "x" : a + "x" : "";
        String consStr = b > 0 ? String.valueOf(b) : "";
        String result = "";
        if (a > 0) {
            if (b > 0) result += coefStr + " + " + consStr;
            else result += coefStr;
        }
        else if (b > 0) result += consStr;
        System.out.println(result);
    }
}
