package chap09;

import java.util.Comparator;

public class LinkedList<E> {
	//노드
	class Node<E>{
		private E data;	//실제 데이터(참조변수)
		private Node<E> next; //다음 노드 포인터
		
		//노드 생성자
		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	private Node<E> head; //머리노드
	private Node<E> crnt; //선택노드(검색 및 삭제시 사용)
	
	//링크드 리스트 생성자
	public LinkedList() {
		head = crnt = null; //빈 리스트는 head가 null을 가르킴, head==null이 true면 비어있음
	}
	
	//노드 검색
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head;
		
		while(ptr!=null) {
			//Comparator의 compare메소드, 같으면 0을반환
			if(c.compare(obj, ptr.data)==0) {
				crnt = ptr;//crnt은 검색할때 사용됨
				return ptr.data;
			}
			ptr = ptr.next;
		}
		return null;//검색 실패
	}
	
	public void addFirst(E obj) {
		Node<E> ptr = head; //삽입 전의 머리 노드
		head = crnt  = new Node<E>(obj, ptr);
		//매개변수로 들어온 obj를 head가 참조하게 하고, 삽입전의 머리노드를 참조하게 함
	}
	
	public void addLast(E obj) {
		if(head==null)//리스트가 비어있으면 머리에 삽입
			addFirst(obj);
		else {
			Node<E> ptr = head;
			while(ptr.next!=null)
				ptr=ptr.next;//맨마지막 찾기
			ptr.next = crnt = new Node<E>(obj, null);
			//다음 노드를 가르키고 있지 않는 새로운 노드를 맨 마지막에 추가
		}
	}
	
	//맨 처음 노드, 맨 마지막 노드 삭제
	public void removeFirst() {
		if(head!=null)//우선 비어있는지 체크
			head = crnt = head.next;
	}
	
	public void removeLast() {
		if(head!=null) {//우선 비어있는지 체크
			if(head.next==null)//노드가 하나면
				removeFirst();
			else {
				Node<E> ptr = head;//맨 마지막을 가르킬 노드
				Node<E> pre = head;//맨 마지막 직전껄 가르킬 노드
				
				while(ptr.next!=null) {
					pre = ptr;//맨마지막 직전
					ptr = ptr.next;//맨 마지막
				}
				pre.next = null;//맨마지막 직전꺼가 가르키는걸 null로
				crnt = pre;
			}
		}
	}
	
	//선택한 노드 삭제
	public void remove(Node p) {
		if(head!=null) {//우선 비어있는지 체크
			if(p==head)//p가 머리면
				removeFirst();
			else {
				Node<E> ptr = head;
				
				while(ptr.next!=p) {//p찾기
					ptr = ptr.next;
					if(ptr==null) return;//p가 없음
				}
				ptr.next = p.next;
				crnt = ptr;
			}
		}
	}
	//지금 가르키고 있는 노드 삭제
	public void removeCurrentNode() {
		remove(crnt);
	}
	//모든 노드 삭제
	public void clear() {
		while(head!=null)
			removeFirst();
		crnt = null;
	}
	//서로 참조하는게 있으면 gc가 인식을 못해서 메모리에 남아있기에 하나하나 삭제하는듯
	
	//선택 노드를 하나 뒤쪽으로 이동
	public boolean next() {
		if(crnt==null||crnt.next==null)
			return false;//이동불가
		crnt = crnt.next;
		return true;//이동됨
	}
	
	//선택 노드를 출력
	public void printCurrentNode() {
		if(crnt==null)
			System.out.println("선택한 노드가 없습니다");
		else
			System.out.println(crnt.data);
	}
	
	//모든 노드 출력
	public void dump() {
		Node<E> ptr = head;
		while(ptr!=null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
}
