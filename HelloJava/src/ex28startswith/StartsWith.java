package ex28startswith;

public class StartsWith {

	public static void main(String[] args) {
		String s1 = "good";
		
		//한글자 또는 여러 문자열로 시작되는지? 또는 끝나는지?
		
		if(s1.startsWith("g"))
			System.out.println(s1);
		if(s1.endsWith("ood"))
			System.out.println(s1);

	}

}
