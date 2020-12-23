package level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ex02프린터2 {
	
	public static int solution(int[] priorities, int location) {
		Map<Integer, Integer> printer = new HashMap<>();
		for(int i=0;i<priorities.length;i++) {
			printer.put(i, priorities[i]);
		}
		System.out.println(printer);
		
		Set<Entry<Integer, Integer>> set = printer.entrySet();
		Iterator<Entry<Integer, Integer>> it = set.iterator();
		while(set.size()>0) {
			Entry<Integer, Integer> tmp = it.next();
			int tmpKey = tmp.getKey();
			int tmpValue = tmp.getValue();
			
			
		}
		
//		Iterator<Integer> it = printer.values().iterator();
//		while(it.hasNext()) {
//			int tmp = it.next();
//			for(int i=1;i<printer.size();i++) {
//				if(printer.get(i)>tmp) {
//					
//				}
//			}
//			it.remove();
//		}
		System.out.println(printer);
        int answer = 0;
        return answer;
    }

	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		solution(priorities, location);

	}

}
