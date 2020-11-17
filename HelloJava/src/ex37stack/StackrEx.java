package ex37stack;

import java.util.Iterator;
import java.util.Stack;

public class StackrEx {

	public static void main(String[] args) {
		/*
		 stack (LIFO: Last in First out) (대야모양)
		 	늘때: push
		 	뺄때: pop
		 */
		
		Stack<String> st1 = new Stack<>();
		st1.push("삼겹살");
		st1.push("불고기");
		st1.push("치킨");
		System.out.println(st1.size());
		
		System.out.println("------------------------");
		System.out.println("iterator로 출력: ");
		Iterator<String> it = st1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//iterator의 목적은 여러 collection들을 종류에 상관없이 꺼내 쓸려고 사용, stack, queue, list, set인지 상관X

		System.out.println("------------------------");
		System.out.println("그냥 출력: ");
		System.out.println(st1);
		
		System.out.println("------------------------");
		System.out.println("Stack 방법으로 출력: ");
		while(!st1.isEmpty()) {
			System.out.println(st1.pop());
		}
		

	}

}
