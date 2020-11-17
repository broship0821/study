package ex38super;

class Parent {
	int money;

	public Parent() {
		System.out.println("나 돈 없어!!!");
	}
	
	public Parent(int money) {//생성자 오버로딩
		this.money = money;
		System.out.println(money + "억 받음 버억");
	}
	
}

class Child extends Parent {
	public Child() {
		
		System.out.println("나는 돈 많아~");
	}
	
	public Child(int don) {
		super(don); //이게 없으면 default 생성자 찾아감
		System.out.println("나는 돈 많아~ " + don + "억");
		System.out.println("부모 돈 많아~ " + super.money + "억");
	}
	/*
	 상속 받는 객체는 무조건 super() 실행됨
	 super(파라미터), super.필드 써서 부모 생성자, 필드 사용 가능
	 
	 		this.	this()
	 		super.	super()
	 c#:	base.	base()
	 */
	
}

public class SuperEx {
	
	public static void main(String[] args) {
//		Parent p = new Parent();
//		Child c = new Child();
		/*
		 자식을 생성하면 무조건 부모 생성자도 실행됨
		 이 방법 아니면 부모 생성자를 접근할 방법이 없어서 이 방법을 씀
		 
		 */
		Child c2 = new Child(30);

	}

}
