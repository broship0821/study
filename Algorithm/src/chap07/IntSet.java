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
	
	public String toString() {
		//return Arrays.toString(set); //이러면 남은 공간은 다 0으로 표시됨
		StringBuffer tmp = new StringBuffer("{ ");
		for(int i=0;i<num;i++)
			tmp.append(set[i] + " ");
		tmp.append("}");
		return tmp.toString();
	}
}
