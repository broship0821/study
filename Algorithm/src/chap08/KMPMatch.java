package chap08;
/*
 브루트-포스법보다는 복잡한데
 뒤에 배울 Boyer-Moore법보다는 성능이 비슷하거나 좋지 않아
 거의 사용 X
 */
public class KMPMatch {
	static int kmpMatch(String txt, String pat) {
		int pt = 1; //txt 커서
		int pp = 0; //pat 커서
		int[] skip = new int[pat.length()+1];//건너뛰기 표
		
		//건너뛰기 표 만들기
		skip[pt] = 0;
		while(pt!=pat.length()) {
			if(pat.charAt(pt)==pat.charAt(pp))
				skip[++pt] = ++pp;
			else if(pp==0)
				skip[++pt] = pp;
			else
				pp = skip[pp];
		}
		
		//검색
		pt = pp = 0;
		while(pt!=txt.length() && pp!=pat.length()) {
			if(txt.charAt(pt)==pat.charAt(pp)) {
				pt ++;
				pp ++;
			} else if(pp==0)
				pt++;
			else
				pp = skip[pp];
		}
		
		if(pp==pat.length())
			return pt-pp;
		return -1;
	}
	
	public static void main(String[] args) {
		String txt = "ABC이지스DEF";
		String pat = "이지스";
		
		int idx = kmpMatch(txt, pat);
		
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
