package chap08;

public class BFmatchDetail {
	
	static int bfMatch(String txt, String pat) {
		int pt = 0; // txt를 따라가는 커서
		int pp = 0; // pat를 따라가는 커서
		int count = 0; // 비교횟수
		int k = -1;

		while (pt != txt.length() && pp != pat.length()) {
			if (k == pt - pp)
				System.out.print("    ");
			else {
				System.out.printf("%2d  ", pt - pp);
				k = pt - pp;
			}
			for (int i = 0; i < txt.length(); i++)
				System.out.print(txt.charAt(i) + " ");
			System.out.println();

			for (int i = 0; i < pt * 2 + 4; i++)
				System.out.print(" ");
			System.out.print(txt.charAt(pt) == pat.charAt(pp) ? '+' : '|');
			System.out.println();

			for (int i = 0; i < (pt - pp) * 2 + 4; i++)
				System.out.print(" ");

			for (int i = 0; i < pat.length(); i++)
				System.out.print(pat.charAt(i) + " ");
			System.out.println();
			System.out.println();
			count++;

			if (txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		System.out.printf("비교는 %d회였습니다.\n", count);
		if (pp == pat.length()) // 검색성공
			return pt - pp;
		return -1; // 검색실패
	}

	public static void main(String[] args) {
		String txt = "ABABCEABCDHEJ";
		String pat = "ABC";
		
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
