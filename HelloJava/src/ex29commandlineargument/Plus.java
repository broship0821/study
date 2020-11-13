package ex29commandlineargument;

public class Plus {

	public static void main(String[] args) {
		/*
		 gui 채팅 프로그램
		 192.168.7.139(ip address)  34567(port)
		 
		 이클립스, 메모장(notepad.exe)  -> 인자가 필요 없음
		 cp aa.txt bb.txt			-> commandline argument 명령행인자
		 
		 여태까지 만든건 메모장같은 인자가 필요없는 파일.
		 이제부터 명령행 인자를 알아둬야됨
		 
		 ex)
		 	명령어 30 80
		 	-> 110
		 
		 public static void main(String[] args) -> String[] args 이게 명령행인자
		 
		 */
		
		
		/*
		 plus 30 80 하면 110 나오는 프로그램 짜기
		 왼쪽 패키지 메뉴에서 마오 -> Run As -> Run configurations -> Main class 다르면 맞게 조정
		 -> Arguments -> Program arguments에 30 80 입력
		 */
		if(args.length!=2) {
			System.out.println("정신 똑바로");
			System.out.println("사용법: 명령 숫자 숫자");
//			return; //프로그램 강제 종료
			//c : exit(-1)
			//java : System.exit
			//c# : Environment.Exit(1)
			System.exit(-1); //0은 정상 종료, 그 외 숫자는 전부 강제 종료
		}
		
		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));

	}

}
