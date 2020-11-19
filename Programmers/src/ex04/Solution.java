package ex04;
//모의고사

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	
	public static ArrayList<Integer> solution(int[] answers) {
        
        int size = answers.length;
        //1번 수포자 배열 만들기
        int[] h1 = new int[size];
        int k = 1;
        for (int i = 0; i < size; i++) {
			h1[i] = k++;
			if(k==6) k = 1;
		}
        System.out.println(Arrays.toString(h1));
        
        //2번 수포자 배열 만들기
        int[] h2 = new int[size];
        int[] tmp = {1, 3, 4, 5};
        int k2 = 0;
        for(int i=0;i<size;i++) {
        	if(i%2==0) {//짝수면
        		h2[i] = 2;
        	} else { //홀수면 1,3,4,5 넣어야됨
        		h2[i] = tmp[k2++];
        		if(k2==4) k2 = 0;
        	}
        }
        System.out.println(Arrays.toString(h2));
        
        //3번 수포자 배열 만들기
        int[] h3 = new int[size];
        int[] tmp2 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int k3 = 0;
        for(int i=0;i<size;i++) {
        	h3[i] = tmp2[k3++];
        	if(k3==10) k3 = 0;
        }
        System.out.println(Arrays.toString(h3));
        
        int score[] = new int[3]; //맞은 개수 넣기
        for(int i=0;i<size;i++) {
        	if(h1[i]==answers[i]) score[0]++;
        	if(h2[i]==answers[i]) score[1]++;
        	if(h3[i]==answers[i]) score[2]++;
        }
        int max = 0; //최대값 찾기
        for(int i=0;i<score.length;i++) {
        	if(max<score[i]) {
        		max = score[i];
        	}
        }
        System.out.println(max);
        
        
        ArrayList<Integer> list = new ArrayList<>(); //max랑 같으면 list에 넣기
        
        for(int i=0;i<score.length;i++) {
        	if(max==score[i]) {
        		list.add(i+1);
        	}
        }
        return list;
    }

	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		ArrayList<Integer> list = solution(answers);
		System.out.println(list);

	}

}
