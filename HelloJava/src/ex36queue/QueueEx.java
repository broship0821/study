package ex36queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		/*
		 Queue (FIFO: First in Last out) 연속으로 무언가를 저장할때 사용
		 
		 collection 인터페이스
		  --> Queue 인터페이스 --> 상속받아 만든 LinkedList 클래스
		  LinkedList<String> q2 = new LinkedList<String>();
		 */
		LinkedList<String> q1 = new LinkedList<>();
		Queue<String> q2 = new LinkedList<>();
		
		q1.add("ondal");
		q2.add("ondal"); //큐가 꽉차면 예외 발생시킴
		q2.offer("바보"); //큐가 꽉차면 false 반환
		q2.offer("온달");
		q2.offer("평강공주");
		q2.offer("피오나");
		
		System.out.println("q2.size(): "+q2.size());
		System.out.println("q2: "+q2);
		
		
		System.out.println("---------");
		//값 하나 하나씩 꺼내는 방법
		Iterator<String> it = q2.iterator();
		while(it.hasNext()) { //hasNext() -> 값이 있니?
			String name = it.next(); //it.next() -> 값 출력하고 다음줄로 이동
			System.out.println(name);
//			System.out.println(it.next()); //위에 두줄을 이렇게 한줄로 작성 가능
		}
		
		System.out.println("------------------------------------------------");
		
		if(!q2.isEmpty()) //isEmpty() -> 값이 들어있는지 확인
			q2.poll(); //젤 앞에꺼 꺼냄
		System.out.println(q2.size());
		if(!q2.isEmpty())
			q2.poll();
		System.out.println(q2.size());
		q2.offer("홍길동"); //다시 추가
		System.out.println(q2.size());
		
		System.out.println(q2.peek()); //제일 처음 값 출력
		System.out.println(q2.size());
		System.out.println(q2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
