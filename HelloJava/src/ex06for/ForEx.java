package ex06for;

public class ForEx {

	public static void main(String[] args) {
		/*
		 for 반복문
		 
		 for(초기치; 목적치; 증가치) {
		 	문장들;
		 }
		 */
		
//		for(int i=1;i<=10;i++) {
//			System.out.println("오저치고" + i);
//		}
		
//		int result = 0;
//		for(int i=1;i<=100;i++) {
//			result += i;
//		}
//		System.out.println(result);
		
		/*
		 1~100사이의 수 중 3의 배수만 골라 출력하시오
		 */
		
//		for(int i=1;i<=100;i++) {
//			if(i%3==0)
//				System.out.println(i);
//		}
		
		//다른 방법
		
//		for(int i=3;i<=100;i+=3) {
//			System.out.println(i);
//		}
		
		
//		System.out.println("학년 - 반"); //빨리 도는 반복문이 안쪽
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=2;j++) {
//				System.out.printf("%d - %d\n", i, j);
//			}
//		}
		
		/*
		 별만들기
		 빨리 도는것 : 열 -> j
		 늦게 도는것 : 행 -> i
		 */
		/*
		 	*****
		 	*****
		 	*****
		 */
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		 	*****
		 	****
		 	***
		 	**
		 	*
		 */
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		 	*
			**
			***
			****
			*****
	 	*/
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		     	*
			   **
			  ***
			 ****
			*****
		 */
		for(int i=0;i<5;i++) {
			for(int j=i;j<4;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//if문 써서 해보기
		/*
		     	* j 4까지 " "		4-i
			   **   3까지		4-i
			  ***   2
			 ****   1
			*****   0
		 */
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<4-i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		 	*****
			 ****
			  ***
			   **
			    *
		 */
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------");
		
		/*
		 다이아몬드 만들기
		 	빈칸		별
		 	3		1
		 	2		3
		 	1		5
		 	0		7
		 	---------------------------
		 	빈칸		별
		 	1		5
		 	2		3
		 	3		1
		 */
		
		for(int i=1;i<=7;i+=2) {
			for(int j=i+1;j<=7;j+=2) { //1씩 줄어듬
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) { //2씩 늘어남
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i+=2) {
			for(int j=1;j<=i;j+=2) { //1씩 늘어남
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++) { //2씩 줄어듬
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
