package chap04;

public class IntStack2 {
	private int max; //스택 용량
	private int ptr; //스택 포인터
	private int[] stk; // 스택 본체
	private int ptrBack;
	
	
	//실행시 예외: 스택이 비어있을 경우
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	//실행시 예외: 스택이 가득참
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public IntStack2(int capacity) {
		ptr = 0;
		max = capacity;
		ptrBack = max-1;
		try {
			stk = new int[max];			//스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {	// 생성할 수 없음
			max = 0;
		}
	}
	
	public int pushF(int x) throws OverflowIntStackException {
		if(ptr>=ptrBack)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pushB(int x) throws OverflowIntStackException {
		if(ptrBack<=ptr)
			throw new OverflowIntStackException();
		return stk[ptrBack--] = x;
	}
	
	public int popF() throws EmptyIntStackException {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr--];
	}
	public int popB() throws EmptyIntStackException {
		if(ptrBack>=max)
			throw new EmptyIntStackException();
		return stk[ptrBack++];
	}
	
	public int peekF() throws EmptyIntStackException {
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}
	public int peekB() throws EmptyIntStackException {
		if(ptrBack>=max)
			throw new EmptyIntStackException();
		return stk[ptrBack+1];
	}
	
	//요소찾기, 먼저 pop되는 순서대로 찾아야 되서 거꾸로 검색
	public int indexOfF(int x) {
		for(int i=ptr-1;i>=0;i--)
			if(stk[i]==x)
				return i;
		return -1; //못찾으면 -1반환
	}
	public int indexOfB(int x) {
		for(int i=ptrBack+1;i<max;i++)
			if(stk[i]==x)
				return i;
		return -1; //못찾으면 -1반환
	}
	
	public void clear() {
		ptr = 0;
		ptrBack = max -1;
	}
	
	public int capacity() {
		return max;
	}
	
	public int sizeF() {
		return ptr;
	}
	public int sizeB() {
		return max - ptrBack;
	}
	
	public boolean isEmptyF() {
		return ptr<=0;
	}
	public boolean isEmptyB() {
		return ptrBack>=max;
	}
	
	public boolean isFullF() {
		return ptr>=ptrBack;
	}
	public boolean isFullB() {
		return ptrBack<=ptr;
	}
	
	public void dumpF() {
		if(this.isEmptyF())
			System.out.println("스택이 비어있습니다");
		else {
			for(int i=0;i<ptr;i++)
				System.out.print(stk[i]+" ");
			System.out.println();
		}
	}
	public void dumpB() {
		if(this.isEmptyB())
			System.out.println("스택이 비어있습니다");
		else {
			for(int i=ptrBack;i<max;i++)
				System.out.print(stk[i]+" ");
			System.out.println();
		}
	}
	
}
