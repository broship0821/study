package ex39file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImegeCopy {

	public static void main(String[] args) throws IOException {
		/*
		 args[] 사용해서 파일 copy, byte 단위 사용
		 
		 */
		
		int imsi = 0; //'A' -> 문자상수(문자 A이면서 동시에 아스키코드 65)
		FileInputStream fis1 = null;
		FileOutputStream fos1 = null;
		
		if(args.length == 2) { //원본 파일명과 사본 파일명 합해서 2개 파일
			fis1 = new FileInputStream(args[0]); //open 원본
			fos1 = new FileOutputStream(args[1], false); //open 사본
			//cp aa.jpg bb.jpg
			
			while((imsi=fis1.read())!=-1) { //read() : 괄호 안이 비어있으면 한 바이트 단위로 처리
				fos1.write(imsi); //파일에 출력
				System.out.println(imsi + "복사중");
			}
			fis1.close();
			fos1.close();
			
		}

	}

}
