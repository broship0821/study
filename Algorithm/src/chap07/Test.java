package chap07;

public class Test {

	public static void main(String[] args) {
		IntSet set = new IntSet(20);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		IntSet set2 = new IntSet(20);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		System.out.println(set);
		System.out.println(set2);
		set.retain(set2);
		System.out.println(set);

	}

}
