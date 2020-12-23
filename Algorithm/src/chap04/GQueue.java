package chap04;
//링 버퍼로 큐 만들기
public class GQueue<T> {
	private int max; //용량
	private int front; //첫번째 요소 커서
	private int rear; //마지막 요소 +1 커서
	private int num; //현재 데이터 수
	private T[] que; // 본체
	
	//실행시 예외: 큐가 비어있을 경우
	public static class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//실행시 예외: 큐가 가득참
	public static class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	public GQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (T[])new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
//	front==rear 인 경우는 num이 0이거나 12인경우밖에 없음
	public T enque(T x) throws OverflowIntQueueException {
		if(num >= max) { //num이 12면 꽉참
			throw new OverflowIntQueueException();
		}
		que[rear++] = x;
		num++;
		if(rear==max)
			rear = 0;
		return x;
	}
	
	public T deque() throws EmptyIntQueueException {
		if(num<=0) //num이 0일경우 빔
			throw new EmptyIntQueueException();
		T x = que[front++];
		num--;
		if(front==max)
			front = 0;
		return x;
	}
	
	public T peek() throws EmptyIntQueueException {
		if(num<=0) //num이 0일경우 빔
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	public int indexOf(T x) {
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
