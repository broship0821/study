package level1;

import java.util.ArrayList;

public class ex18소수찾기 {
	
	public static int solution(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		int j;
		for(int i=3;i<=n;i++) {
			for(j=0;j<list.size();j++) {
				if(i%list.get(j)==0) break;
			}
			if(j==list.size()) {
				list.add(i);
			}
		}
		System.out.println(list);
        return list.size();
    }

	public static void main(String[] args) {
		solution(5);

	}

}
