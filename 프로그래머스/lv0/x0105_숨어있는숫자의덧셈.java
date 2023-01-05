package 프로그래머스.lv0;

//public class x0105_숨어있는숫자의덧셈 {
//    public static void main(String[] args) {
//        String my_string = "1a2b3c4d123Z"; // result = 133
//        my_string = my_string.replaceAll("[a-zA-Z]", " ");
//        String[] a = my_string.split(" ");
//        int answer = 0;
//        for (String num : a) {
//            if (num.equals(" ") | num.equals("")) continue;
//            answer += Integer.parseInt(num);
//        }
//        System.out.println(answer);
//    }
//}
public class x0105_숨어있는숫자의덧셈 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp"; // result = 133
        String[] a = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        int answer = 0;
        for (String num : a) {
            if(!num.equals("")) answer += Integer.parseInt(num);
        }

    }
}