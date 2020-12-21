package chap04;

public class IntStack {
	private int max; //스택 용량
	private int ptr; //스택 포인터
	private int[] stk; // 스택 본체
	
	//실행시 예외: 스택이 비어있을 경우
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//실행시 예외: 스택이 가득참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];			//스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {	// 생성할 수 없음
			max = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException {
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr--];
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	//요소찾기, 먼저 pop되는 순서대로 찾아야 되서 거꾸로 검색
	public int indexOf(int x) {
		for(int i=ptr-1;i>=0;i--)
			if(stk[i]==x)
				return i;
		return -1; //못찾으면 -1반환
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	public boolean isFull() {
		return ptr>=max;
	}
	
	public void dump() {
		if(this.isEmpty())
			System.out.println("스택이 비어있습니다");
		else {
			for(int i=0;i<ptr;i++)
				System.out.print(stk[i]+" ");
			System.out.println();
		}
	}
	
}
