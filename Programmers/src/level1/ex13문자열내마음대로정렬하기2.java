package level1;

import java.util.Arrays;
import java.util.Comparator;

public class ex13문자열내마음대로정렬하기2 {
	
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() { //새로운 정렬 기준 제공
			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n)<o2.charAt(n)) { //뒤쪽에 놓을 건 음수
					return -1;
				} else if (o1.charAt(n)>o2.charAt(n)) { //앞쪽에 놓을 건 양수
					return 1;
				} else {
					return o1.compareTo(o2); //같다면 사전 정의대로
				}
			}
		});
		System.out.println(Arrays.toString(strings));
        return strings;
    }

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		solution(strings, n);
		

	}

}
