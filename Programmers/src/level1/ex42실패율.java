package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ex42실패율 {
	
	public static int[] solution(int N, int[] stages) {
		int[] fail = new int[N]; //각 스테이지별 못깬사람
		int player = stages.length; //총 플레이어 수
		for(int i=0;i<N;i++) {
			for(int j=0;j<player;j++) {
				if(stages[j]==i+1)
					fail[i]++;
			}
		}
		System.out.println(Arrays.toString(fail));
		
		int tmp = 0;
		// 스테이지       실패율
		Map<Integer, Double> map = new HashMap<>(N);
		for(int i=0;i<N;i++) {
			if(player-tmp==0)//0으로 나눌수 없음
				map.put(i+1, 0.0);
			else
				map.put(i+1, fail[i]/(double)(player-tmp));
			tmp += fail[i];
		}
		System.out.println(map);
		
		//이제 value값의 내림차순, key의 오름차순으로 정렬하면 끝인듯
		//실패율 내림차순으로 정렬되어짐, 만약 실패율이 같으면 자동으로 key 오름차순 정렬
		List<Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
//		Collections.sort(list, new Comparator<Entry<Integer, Double>>() {
//			@Override
//			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
//				return o2.getValue().compareTo(o1.getValue());
//			}
//		});
		//람다식 배워봐서 써먹어봄
		Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
		System.out.println(list.get(0));
		
		//정렬된 스테이지 순서대로 배열에 저장
        int[] answer = new int[N];
        for(int i=0;i<N;i++) {
        	answer[i] = list.get(i).getKey();
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		solution(N, stages);

	}

}
