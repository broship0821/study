package chap04;

public class IntQueue {
	private int max; //용량
	private int front; //첫번째 요소 커서
	private int rear; //마지막 요소 +1 커서
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
	
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
}
