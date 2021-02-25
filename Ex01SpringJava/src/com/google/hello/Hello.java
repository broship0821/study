package com.google.hello;

import com.google.bangka.Bangka1;
import com.google.bangka.Bangka2;
//결합도가 높은 경우
public class Hello {

	public static void main(String[] args) {
		Bangka1 b1 = new Bangka1();
		b1.bangkabangka1("홍길동");
		
		Bangka2 b2 = new Bangka2();
		b2.bangkabangka2("이도룡");

	}

}
