package chap07;

public class Test {

	public static void main(String[] args) {
		IntSet set = new IntSet(5);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5);
		System.out.println(set.toString());

	}

}
