package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex13문자열내마음대로정렬하기3 {
	
	public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
        /*
         		지린다..	
         		n번째 글자를 다 앞에다 붙여서 arraylist에 담고
         		그 arraylist 를 sort 한다음
         		arraylist의 앞글자 때서 배열에 집어넘..
         		완벽
         */
    }
    

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		System.out.println(Arrays.toString(solution(strings, n)));
		

	}

}
