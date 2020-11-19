package ex39file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FileCopyEx {

	public static void main(String[] args) throws IOException {
		//2020년 다이어리 open --> 읽기 위한 open
		BufferedReader br1 = new BufferedReader(new FileReader("D:/peter/test1.txt"));
		//2021년 다이어리 open --> 쓰기 위한 open
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("D:/peter/test2.txt", false)));
		
		String s = null; //중간 기억창고
		while((s=br1.readLine())!=null) { //2020년에서 한줄을 읽어서
			System.out.println("나 복사중");
			pw.println(s); //2021년 다이어리에 복사
		}
		
		br1.close();
		pw.close();
		//닫아줘야지 바로 읽거나 쓰게될때 사용 가능
		
		
	}

}
