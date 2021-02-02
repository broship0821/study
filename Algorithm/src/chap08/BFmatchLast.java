package chap08;

public class BFmatchLast {
	
	//브루트-포스법으로 문자열 검색(뒤에서부터)
	static int bfMatch(String txt, String pat) {
		int pt = txt.length()-1; // txt 커서, 전체 문자열
		int pp = pat.length()-1; // pat 커서, 찾을 문자열
		
		while(pt!=0 && pp!=0) {
			System.out.println(1);
			if(txt.charAt(pt)==pat.charAt(pp)) {
				pt--;
				pp--;
			} else {
				pt = pt +(pat.length()-1-pp) - 1;//방금전 끝난 검사범위에서 1 왼쪽 만큼의 위치에서 다시 검사시작
				pp = pat.length()-1; //pat 커서는 초기화
			}
			
		}
		if(pp==0) //pat초기화가 안됬다는건 찾았다는 것
			return pt+1; //거꾸로 찾으니까 pt+1이 곧 위치, 마지막에 pt-- 한거 다시 하나 올려줌
		
		return -1; //검색 실패
	}

	public static void main(String[] args) {
		String txt = "ABC이지스DEF이지스";
		String pat = "이지스";
		
		int idx = bfMatch(txt, pat);
		
		if(idx==-1)
			System.out.println("검색 실패");
		else {
			//몇번째 문자부터 맞는지 찾기
			int len = 0;
			for(int i=0;i<idx;i++)
				len += txt.substring(i,i+1).getBytes().length;
			len += pat.length();
			
			System.out.println((idx+1)+"번째 문자부터 일치합니다");
			System.out.println("텍스트: "+txt);
			System.out.printf(String.format("패턴: %%%ds\n", len), pat);
		}

	}

}
