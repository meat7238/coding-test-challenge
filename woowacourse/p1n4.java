package woowacourse;

public class p1n4 {
	public static void main(String[] args) {
		String word = "I love you";
		// -------------------------------------
		String answer = "";
		for (int i = 0; i < word.length(); i++) {
			if (65 <= word.charAt(i) & word.charAt(i) <= 90)
				answer += (char) (155 - word.charAt(i));
			else if (97 <= word.charAt(i) & word.charAt(i) <= 122)
				answer += (char) (219 - word.charAt(i));
			else
				answer += word.charAt(i);
		}
		System.out.println(answer);
	}
}
