package chap08;
//가장많이 쓰이는 문자열 검색 알고리즘... 이해 1도 못하겠음 ㅋㅋ
public class BMmatch {
	static int bmMatch(String txt, String pat) {
		int pt;
		int pp;
		int txtLen = txt.length();
		int patLen = pat.length();
		int[] skip = new int[Character.MAX_VALUE+1];//건너뛰기표
		
		for(pt=0;pt<=Character.MAX_VALUE;pt++)
			skip[pt] = patLen;
		for(pt=0;pt<patLen-1;pt++)
			skip[pat.charAt(pt)] = patLen - pt -1;
		
		while(pt<txtLen) {
			pp = patLen - 1;
			while(txt.charAt(pt)==pat.charAt(pp)) {
				if(pp==0)
					return pt;
				pp--;
				pt--;
			}
			pt += (skip[txt.charAt(pt)]>patLen-pp)?skip[txt.charAt(pt)]:patLen-pp;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		String txt = "ABC이지스DEF";
		String pat = "이지스";
		
		int idx = bmMatch(txt, pat);
		
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
