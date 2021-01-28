package chap07;

public class Test {

	public static void main(String[] args) {
		IntSet s1 = new IntSet(20);
		s1.add(1);
		s1.add(4);
		IntSet s2 = new IntSet(20);
		s2.add(1);
		s2.add(2);
		s2.add(3);
		
		System.out.println(s1.isSubsetOf(s2));

	}

}
