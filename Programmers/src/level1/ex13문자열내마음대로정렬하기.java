package level1;
//대실패.. Comparator 공부하고 품
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ex13문자열내마음대로정렬하기 {
	
	public static String[] solution(String[] strings, int n) {
		Map<Integer, Character> map = new LinkedHashMap<>();
		for (int i = 0; i < strings.length; i++) {
			map.put(i, strings[i].charAt(n));
		}
		
		List<Map.Entry<Integer, Character>> entries = new LinkedList<>(map.entrySet());
		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		
        String[] answer = new String[strings.length];
        int i = 0;
        for (Map.Entry<Integer, Character> entry : entries) {
        	answer[i] = strings[entry.getKey()];
        	i++;
        }
        /*//같은거 정렬해야됨
        System.out.println(Arrays.toString(answer));
        String[] tmp = {};
        for(int j=0;j<answer.length-1;j++) {
        	if(answer[j].charAt(n)==answer[j+1].charAt(n))
        		tmp = Arrays.copyOfRange(answer, j,j+2);
        	Arrays.sort(tmp);
        	String x = 
        }
        System.out.println(Arrays.toString(tmp));*/
        System.out.println(Arrays.toString(answer));
        //n번째 글자 뽑아서 정렬하는 로직까진 만듬
        //n번째 글자가 같은거 끼리 정렬하는 로직 만들어야됨
        return answer;
    }

	public static void main(String[] args) {
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 2;
		solution(strings, n);

	}

}
