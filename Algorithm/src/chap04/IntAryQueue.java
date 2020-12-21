package chap04;

public class IntAryQueue {
	private int max; // 큐 용량
	private int num; // 현재 데이터 수
	private int[] que; //큐 본체
	
	//실행시 예외: 큐가 비어있을 경우
	public class EmptyIntAryQueueException extends RuntimeException {
		public EmptyIntAryQueueException() {}
	}
	
	//실행시 예외: 큐가 가득참
	public class OverflowIntAryQueueException extends RuntimeException {
		public OverflowIntAryQueueException() {}
	}
	
	public IntAryQueue(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enqueue(int x) throws OverflowIntAryQueueException {
		if(num>=max)
			throw new OverflowIntAryQueueException();
		return que[num++] = x;
	}
	
	public int dequeue(int x) throws EmptyIntAryQueueException {
		if(num<=0)
			throw new OverflowIntAryQueueException();
		
		int first = que[0];
		for(int i=0;i<num-1;i++) {
			que[i] = que[i+1];
		}
//		que[num-1] = 0;
		num--;
		
		return first;
	}
	
	public int peek() throws EmptyIntAryQueueException {
		if(num<=0)
			throw new OverflowIntAryQueueException();
		
		return que[num-1];
	}
	
	//요소 찾기, 먼저 dequeue되는 순서대로
	public int indexOf(int x) {
		for(int i=0;i<num;i++)
			if(que[i]==x)
				return i;
		return -1;
	}
	
	public void clear() {
//		for(int i=0;i<num;i++)
//			que[i] = 0;
		num = 0;
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
		return num>=max;
	}
	
	public void dump() {
		if(this.isEmpty())
			System.out.println("큐가 비어있습니다");
		else {
			for(int i=0;i<num;i++)
				System.out.print(que[i]+" ");
			System.out.println();
		}
	}

}
