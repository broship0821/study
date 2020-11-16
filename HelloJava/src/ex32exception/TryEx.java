package ex32exception;

import java.util.Scanner;

public class TryEx {

	public static void main(String[] args) {
		try { //이 부분에서 에러가 날꺼 같애
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수는: ");
		String one = sc.nextLine();
		int num1 = Integer.parseInt(one);
		
		System.out.print("두번째 수는: ");
		String two = sc.nextLine();
		int num2 = Integer.parseInt(two);
		
		int result = div(num1, num2);
		System.out.println(result);
		
		System.out.println(num1/num2);
		} catch (Exception e) { //에러가 났을때 실행됨
			System.out.println("예외 발생!");
			System.out.println("0말고 다른거 넣어요");
			System.out.println(e); //.toString() -> java.lang.ArithmeticException: / by zero
			System.out.println(e.getMessage()); //      / by zero
			//오라클: ora-10976		c언어: errno 4069 		자바: message
		} finally { //무조건 실행됨
			System.out.println("good~!");
			//finally 에는 오류가 나던 안나던 해줘야 되는
			//DB 접속 close, 파일 close 등을 해줘야됨
		}
		

	}
	
	public static int div(int num1, int num2) throws ArithmeticException {
		
		//throw 설명
//		if(num2==0) {
//			System.out.println("0으로 나눌 수 없습니다");
//			throw new ArithmeticException(); //개발자가 능동적으로 에러를 발생시킴
//		} else
			return num1/num2; //여기서 에러가 날 확률이 큼
		/*
		 try {...}
		 catch(ArithmeticException e) {}
		 이거랑
		 throws ArithmeticException
		 이거랑 같은 뜻임
		 try catch는 에러처리할 부분이 있고 throws는 에러처리할 부분이 없음
		 */
	}

}
