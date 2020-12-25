package chap04;
//링 버퍼로 큐 만들기
public class IntDeque {
	private int max; //용량
	private int front;
	private int rear;
	private int num; //현재 데이터 수
	private int[] que; // 본체
	
	//실행시 예외: 큐가 비어있을 경우
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//실행시 예외: 큐가 가득참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	public IntDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	// 덱(deck)에 데이터를 머리쪽부터 인큐
	public int enqueFront(int x) throws OverflowIntQueueException {
		if(num >= max) {
			throw new OverflowIntQueueException();
		}
		num++;
		if(--front<0)
			front = max -1;
		que[front] = x;
		return x;
	}
	// 덱(deck)에 데이터를 꼬리쪽부터 인큐
	public int enqueRear(int x) throws OverflowIntQueueException {
		if(num >= max) {
			throw new OverflowIntQueueException();
		}
		que[rear++] = x;
		num++;
		if(rear==max)
			rear = 0;
		return x;
	}
	
	// 덱(deck)의 머리부터 데이터를 디큐
	public int dequeFront() throws EmptyIntQueueException {
		if(num<=0) //num이 0일경우 빔
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front==max)
			front = 0;
		return x;
	}
	// 덱(deck)의 꼬리부터 데이터를 디큐
	public int dequeRear() throws EmptyIntQueueException {
		if(num<=0) //num이 0일경우 빔
			throw new EmptyIntQueueException();
		num--;
		if(--rear<0)
			rear = max-1;
		return que[rear];
	}
	
	// 덱(deck)의 머리부터 데이터를 피크(머리데이터를 살펴봄)
	public int peekFront() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); // 덱(deck)이 비어 있음
		return que[front];
	}

	// 덱(deck)의 꼬리부터 데이터를 피크(꼬리데이터를 살펴봄)
	public int peekRear() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException(); // 덱(deck)이 비어 있음
		return que[rear == 0 ? max - 1 : rear - 1];
	}
	
	public int indexOf(int x) {
		for(int i=0;i<num;i++) {
			int idx = (i+front)%max;//front부터 1씩 증가하면서 찾음, 범위 넘어가면 다시 0부터 찾도록 % max 해줌
			if(que[idx]==x)
				return idx;
		}
		return -1;
	}
	/*
	 front 가 7, num 이 7이면
	 i: 	0 1 2 3  4  5  6
	 idx:	7 8 9 10 11 0  1
	 */
	
	public void clear() {
		num = front = rear = 0;
		//num==0이면 deque든peek든 다 예외던짐, 그래서 첫번째 요소 제거할 필요 없음
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num<=0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num<=0)
			System.out.println("큐가 비어있습니다");
		else
			for(int i=0;i<num;i++)
				System.out.print(que[(i+front)%max] + " ");
		System.out.println();
	}
}
