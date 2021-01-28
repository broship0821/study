package chap07;

import java.util.Arrays;

public class IntSet {
	private int max; //set의 총 량
	private int num; //현재 set에 들어있는 요소 개수
	private int[] set; //본체
	
	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//공집합인지 확인
	public boolean isEmpty() {
		return (num==0)?true:false;
	}
	
	//집합이 가득 찼는지 확인
	public boolean isFull() {
		return (num==max)?true:false;
	}
	
	//집합 초기화
	public void clear() {
		num = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public int indexOf(int n) {
		for(int i=0;i<num;i++) {
			if(set[i]==n)
				return i;
		}
		return -1; //못찾음
	}
	
	public boolean contains(int n) {
		return (indexOf(n)!=-1)?true:false;
	}
	
	public boolean add(int n) {
		if(num>=max || contains(n)==true) //가득찼거나 이미 n이 있으면 못넣음
			return false;
		else
			set[num++] = n;
		return true;
	}
	
	public boolean remove(int n) {
		int idx;
		
		if(num<=0 || (idx=indexOf(n))==-1)
			return false; //비어있거나 n이 없을 경우
		else {
			set[idx] = set[--num]; //찾은 요소에 맨 마지막 요소를 대입하고 num 하나 줄임
			return true;
		}
	}
	
	public void copyTo(IntSet s) {
		int n = (s.max<num)?s.max:num;
		for(int i=0;i<n;i++)
			s.set[i] = set[i];
		s.num = n;
	}
	
	public void copyFrom(IntSet s) {
		int n = (max<s.num)?max:s.num;
		for(int i=0;i<n;i++)
			set[i] = s.set[i];
		num = n;
	}
	
	public boolean equalTo(IntSet s) {
		if(num!=s.num)
			return false; //요소가 안같으면 무조건 안똑같은거임
		
		for(int i=0;i<num;i++) {
			int j = 0;
			for(;j<s.num;j++)
				if(set[i]==s.set[j])
					break;
			if(j==s.num)
				return false; //하나라도 없으면 안같은거임
		}
		return true;//완전똑같을때
	}
	
	//s1,s2의 합집합 복사하기
	public void unionOf(IntSet s1, IntSet s2) {
		copyFrom(s1);//먼저 this에 s1 복사해옴
		for(int i=0;i<s2.num;i++)
			add(s2.set[i]);//s1에 없는것만 s2에서 복사해옴
	}
	
	//지금 set에 s 더하기(합집합 구하기)
	public void add(IntSet s) {
		for(int i=0;i<s.num;i++)
			add(s.set[i]);
	}
	
	//교집합 구하기
	public void retain(IntSet s) {
		for(int i=0;i<num;i++) {
			System.out.println(num);
			if(!s.contains(set[i])) {//없으면 삭제
				remove(set[i]);
			}
		}
	}
	
	// 집합 s와 차집합
	public boolean remove(IntSet s) {
		boolean flag = false;
		for (int i = 0; i < num; i++)
			if (s.contains(set[i]) == true) {
				remove(set[i]);
				flag = true;
			}
		return flag;
	}
	
	//집합 s의 부분집합인지 체크
	public boolean isSubsetOf(IntSet s) {
		for(int i=0;i<num;i++) {
			if(!s.contains(set[i])) {
				return false;
			}
		}
		return true;
	}
	
	//집합 s의 진부분집합인지 체크
	public boolean inProperSubsetOf(IntSet s) {
		//부분집합인지?
		if(!isSubsetOf(s)) {
			return false; //부분집합이 아니면 집부분집합도 아님
		}
		//두개가 똑같은지?
		if(!equalTo(s)) {
			return false;
		}
		return true;
		/* 요소수만 체크하고 부분집합인지 체크하면 됬었음
		 if (num >= s.num) // 요솟수가 s 이상이면
			return false; // s의 진부분집합이 아님
		return s.isSubsetOf(s);
		 */
	}
	
	public void intersectionOf(IntSet s1, IntSet s2) {
		//먼저 비우고 시작
		clear();
		for(int i=0;i<s1.num;i++) {
			if(s2.contains(s1.set[i])) {
				add(s1.set[i]);
			}
		}
	}
	
	public void differenceOf(IntSet s1, IntSet s2) {
		clear();
		for(int i=0;i<s1.num;i++) {
			if(!s2.contains(s1.set[i])) {
				add(s1.set[i]);
			}
		}
	}
	
	public String toString() {
		//return Arrays.toString(set); //이러면 남은 공간은 다 0으로 표시됨
		StringBuffer tmp = new StringBuffer("{ ");
		for(int i=0;i<num;i++)
			tmp.append(set[i] + " ");
		tmp.append("}");
		return tmp.toString();
	}
}
