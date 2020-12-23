package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ex02프린터 {
	
	public static int solution(int[] priorities, int location) {
		Integer[] p = Arrays.stream(priorities).boxed().toArray(Integer[]::new);
		Queue<Integer> printer = new LinkedList<Integer>(Arrays.asList(p));
		Queue<Integer> printerIdx = new LinkedList<Integer>();
		for(int i=0;i<priorities.length;i++) {
			printerIdx.offer(i);
		}
		
		System.out.println(printer);
		System.out.println(printerIdx);
		int answer = 1;
		while(!printer.isEmpty()) {
			boolean flag = true;
			int tmp = printer.poll();
			int tmpIdx = printerIdx.poll();
			for(int i : printer) {
				if(i>tmp) {
					printer.offer(tmp);
					printerIdx.offer(tmpIdx);
					flag = false;
					break;
				}
			}
			if(flag) {
				if(tmpIdx==location)
					return answer;
				else
					answer++;
			}
			
		}
		System.out.println(printer);
		System.out.println(printerIdx);
		
        return answer;
    }

	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		System.out.println(solution(priorities, location));
		

	}

}
