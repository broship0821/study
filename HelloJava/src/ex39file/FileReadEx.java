package ex39file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {

	public static void main(String[] args) throws IOException {
		/*
		 file -> 문서를 읽어옴
		 stream: byte stream(1byte) / 문자 stream(2byte)
		 			input	/	output stream
		 		파일 끄집어냄		키보드로 입력받아 이 파일에 집어넣음
		 		
		 
		 input, output, stream이 보이면 byte stream
		 reader, writer가 보이면 문자 stream
		 FileReader fr = new FileReader("D:/peter/aa.txt"); ->  문자 stream
		 
		 
		 file을 처리하는 로직(text viewer의 경우)
		 	open(owner) -> 책을 폄(lock 검, 다른 사용자 접근 불가)
		 	read(writer) -> 읽음
		 	화면출력
		 	close(free) -> 책을 닫음(lock 해제)
		 */
		
		FileReader fr = new FileReader("D:/peter/aa.txt");
		BufferedReader br = new BufferedReader(fr); //open을 도움(없어도 되는 도우미)
		//임시방에 버퍼링 한 후 한줄한줄 처리(그림그릴때 파레트 같은 역할, 효율성 좋아짐)
		
		//read는 파일에서 읽어서 to 기억창고(변수)
		//write는 키보드 등으로 입력하여 to 파일에
		
		//read를 도움
		String s = null;
		//file read - 화면출력(write) byte는 readInt
		while((s=br.readLine())!=null) { //한줄의 끝은 null이라고 물어봄
								//한글자씩의 끝은(eof) -1이냐고 물어봄
			System.out.println(s);
		}
		
		//close
		br.close();
		fr.close();
		

	}

}
