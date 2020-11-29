package level1;

public class ex17서울에서김서방찾기 {
	
	public static String solution(String[] seoul) {
		int idx = 0;
		for (int i = 0; i < seoul.length; i++) {
			if("Kim".equals(seoul[i])) {
				idx = i;
				break;
			}
		}
        String answer = "김서방은 " + idx + "에 있다";
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
