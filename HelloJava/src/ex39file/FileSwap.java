package ex39file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSwap {

	public static void main(String[] args) throws IOException {
		//이렇게 하면 이게된다고.txt 파일 생성됨
//		PrintWriter pw4 = new PrintWriter(new BufferedWriter(new FileWriter("D:/peter/이게된다고.txt", false)));
		//Q: 서로 두 파일의 내용을 swap 하시오
		
		//test1 파일 읽기
		BufferedReader br1 = new BufferedReader(new FileReader("D:/peter/test1.txt"));
		
		//test2 파일 읽기
		BufferedReader br2 = new BufferedReader(new FileReader("D:/peter/test2.txt"));
		
		//임시 저장소
		PrintWriter pw1 = new PrintWriter(new BufferedWriter(new FileWriter("D:/peter/tmp.txt", false)));
		
		String s = null;
		//test1 -> tmp
		while((s=br1.readLine())!=null) {
			pw1.println(s);
		}
		br1.close();
		pw1.close();
		
		//test2 -> test1
		PrintWriter pw2 = new PrintWriter(new BufferedWriter(new FileWriter("D:/peter/test1.txt", false)));
		while((s=br2.readLine())!=null) {
			pw2.println(s);
		}
		br2.close();
		pw2.close();
		
		//tmp -> test2
		BufferedReader br3 = new BufferedReader(new FileReader("D:/peter/tmp.txt"));
		PrintWriter pw3 = new PrintWriter(new BufferedWriter(new FileWriter("D:/peter/test2.txt", false)));
		while((s=br3.readLine())!=null) {
			pw3.println(s);
		}
		br3.close();
		pw3.close();
		
		
		File f1 = new File("D:/peter/tmp.txt");
		if(f1.exists()) {
			if(f1.delete()) {
				System.out.println("파일 삭제 완료");
			} else {
				System.out.println("알수없는 오류로 파일 삭제 불가");
			}
		} else {
			System.out.println("지울 파일이 없어");
		}

	}

}
