package 프로그래머스.lv1;

public class x1226_시저암호 {
    public static void main(String[] args) {
        int n = 4;
        String s = "a B z"; //result : "e F d"
        StringBuilder answer = new StringBuilder();
        char[] ch = s.toCharArray();
        for (char a : ch) {
            if (a == ' ') answer.append(" ");
            else if (Character.isLowerCase(a) & a + n > 122 || Character.isUpperCase(a) & a + n > 90) {
                answer.append((char) (a + n - 26));
            } else {
                answer.append((char) (a + n));
            }
        }
        System.out.println(answer);
    }
}

