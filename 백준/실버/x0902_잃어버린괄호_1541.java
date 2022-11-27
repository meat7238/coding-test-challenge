package 백준.실버;

import java.util.Scanner;

import javax.script.ScriptException;

public class x0902_잃어버린괄호_1541 {
	/**
	 * @th 임시저장 변수
	 * @cnt split배열 순차호출 위한 변수
	 * @flag 연속 -나올때의 계산 처리
	 * @throws ScriptException
	 */
	public static void main(String[] args) throws ScriptException {
	Scanner in = new Scanner(System.in);
	String str = in.next();
	int cnt=1;
	int th=0;
	int flag=0;
	String[] sp= str.split("\\+|\\-");
	int sum = Integer.parseInt(sp[0]);
	char[] cha = str.toCharArray();
	for(int i=0;i<cha.length;i++) {
		if(cha[i]=='+') th+=Integer.parseInt(sp[cnt++]);
		if(cha[i]=='-') {
			flag++;
			if(flag ==2) {
				sum-=th;
				flag=1;
			}else sum+=th;
			th=0;
			th+=Integer.parseInt(sp[cnt++]);
		}
	}
	if(flag==1) sum-=th;
	else sum+=th;
	System.out.println(sum);
	}
}
	
/* 출력만 성공 (123)-(123+123) 
		Scanner in = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String str = in.next().trim();
		char[] cha = str.toCharArray();

		for (char ch : cha) {
			list.add(ch);
		}
		list.add(0, "(");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals('-')) {
				list.add(i + 1, '(');
				list.add(i, ')');
				i++;
			}
		}
		str = "";
		for (int i = 0; i < list.size(); i++)
			str += list.get(i);
		str += ")";
		System.out.println(String.valueOf(str));
*/
/* evel은 자바 1.6이상 사용가능 
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		Object result = engine.eval(str);
		System.out.println(result);
*/
