package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex04기능개발 {
	
	public static List<Integer> solution(int[] progresses, int[] speeds) {
		
		int size = progresses.length;
		//걸린 날짜 먼저 계산
		int[] days = new int[size];
		for(int i=0;i<size;i++) {
			int day = 0;
			while(progresses[i]<100) {
				progresses[i] += speeds[i];
				day++;
			}
			days[i] = day;
		}
		System.out.println(Arrays.toString(days));
		
		//같은날 몇개가 끝나는지 계산
		int max = days[0]; //제일 처음꺼 끝나는 시간
		int count = 0; //끝나는 개수
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<size;i++) {
			if(max>=days[i]) {//전꺼 끝날동안 다음꺼 끝남
				count++; //끝난개수 +1
			} else { //전꺼 끝나도 다음꺼 남음
				list.add(++count);//여태까지 끝난거 집어넣기
				max = days[i];//경과 시간 설정
				count = 0;//끝난 개수 초기화
			}
		}
		list.add(count+1); //마지막에 끝난건 수작업
		System.out.println(list);
		
        return list;
    }

	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		solution(progresses, speeds);

	}

}
