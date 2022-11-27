package 프로그래머스.lv1;

public class 신규아이디추천_false {
	public static void main(String[] args) {

		String new_id = "z-+.^.";
		String str;
		
		new_id = new_id.toLowerCase();
		char[] arr = new_id.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 97 && arr[i] <= 122 || arr[i] == '-' || arr[i] == '_' || arr[i] == '.') {
				continue;
			} else
				arr[i] = 0;
		}
		str = new String(arr).trim();
		arr = str.toCharArray();
		for (int i = 1; i < str.length() ; i++) {
			if (arr[i-1] == '.' && arr[i]=='.') {
				arr[i-1]=0;
			}
		}
		str = new String(arr).trim();
		str.trim();
		arr = str.toCharArray();
		if(arr[0]=='.')
			arr[0]=0;
		else if(arr[str.length()-1]=='.')
			arr[str.length()-1]=0;
		
		str = new String(arr).trim();
		
		if (str =="")
			str="a";
		arr = str.toCharArray();
		str = new String(arr).trim();
		
		if(str.length()>15) {
			for(int i = 15; i<str.length(); i++)
					arr[i]=0;
			if(arr[str.length()-1]=='.')
				arr[str.length()-1]=0;
			str = new String(arr).trim();			
			arr = str.toCharArray();
		}
		while(str.length()<3) {
			str +=arr[str.length()-1];
			arr = str.toCharArray();
		}
		
		System.out.println(str);

	}

}