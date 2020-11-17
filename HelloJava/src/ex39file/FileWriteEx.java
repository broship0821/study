package ex39file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileWriteEx {

	public static void main(String[] args) throws IOException {
		
		//input, output, stream이 보이면 byte stream
		//reader, writer가 보이면 문자 stream
		//키보드 입력 위해
//		InputStreamReader isr = new InputStreamReader(System.in); // input, reader 다 있음 -> byte stream 이랑 문자 stream의 연결고리 역활
//		BufferedReader br = new BufferedReader(isr);
		
		//줄여쓴것(키보드 입력 용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//출력을 위해										//append 할려면 true로 써야됨
//		FileWriter fw = new FileWriter("D:/peter/bb.txt", false); //open 역활, false: 기존에 있던 내용을 싹 다 지움
//		BufferedWriter bw = new BufferedWriter(fw);
//		PrintWriter pw = new PrintWriter(bw); //출력을 편리하게 해줌
		
		
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("D:/peter/bb.txt", false))); 
		
		//br로 키보드로 부터 입력받고 pw로 출력한다?
		
		System.out.println("저장할 데이터를 입력해주세요. 입력 끝은 ctrl + z");
		String s = null;
		while((s=br.readLine())!=null) { //from keyinput
			pw.println(s); //file bb.txt에 수록 //sysout
		}
		
		pw.flush(); //출력을 좀 더 확실하게 하는 방법, 키보드 입력때 사용(버퍼에 남아있지 않게 하고 바로바로 보낼때 사용)
		br.close();
		pw.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
