package ex21uppercase;

public class CaseEx {

	public static void main(String[] args) {
		/*
		 문자열 loVE를 기억창고에 넣은 후 대소문자를 바꾸어 출력하시오
		 단 메소드 호출을 사용하시오
		 LOve
		 */
		String str = "loVE";
		System.out.println("변경전: " + str);
		System.out.print("변경후: ");
		change(str);

	}
	
	public static void change(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isLowerCase(c)) {
				System.out.print(Character.toUpperCase(c));
			} else {
				System.out.print(Character.toLowerCase(c));
			}
		}
	}

}
