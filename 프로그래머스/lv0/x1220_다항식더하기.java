//package 프로그래머스.lv0;
//
//public class x1220_다항식더하기 {
//    public static void main(String[] args) {
//        String polynomial = "3x + 7 + x";
//        String[] strs = polynomial.replace(" +","").split(" +");
//        int a = 0;
//        int b = 0;
//        for(String s : strs){
//            if(s.contains("x")) {
//                if(s == "x")
//                    a+=1;
//                    break;
//                }
//                a+=Integer.parseInt(s.replace("x",""));
//                continue;
//            }
//            b += Integer.parseInt(s);
//        }
//        System.out.println(a + " " + b);
//        String answer = a+"x"+" "+b;
//    }
//}
