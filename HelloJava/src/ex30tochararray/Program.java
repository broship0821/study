package ex30tochararray;

public class Program {

	public static void main(String[] args) {
		/*
		 문자열을 입력받아 첫번째, 3번째 ... 글자를 바꾸어 출력하시오(메소드2형식 사용)
		 ondal -> oadnl
		 String, char[] 사용
		 */
//		String str = "ondal";
//		System.out.println(str);
//		change(str);
		change(args);

	}
	
	public static void change(String[] args) {
		for (int i = 0; i < args.length; i++) {
			char[] ch = args[i].toCharArray(); //String을 한글자씩 잘라서 char[] 에 넣음
			
			char tmp = ch[1];
			ch[1] = ch[3];
			ch[3] = tmp;
			
//			for (int i = 0; i < str.length(); i++) {
//				System.out.print(ch[i]);
//			}
//			System.out.println();
			String str2 = new String(ch); //char[] 을 String으로 바꾸기
			System.out.println(str2);
		}
		
		
	}

}
