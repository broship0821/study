package ex03dataType;

public class DataType {

	public static void main(String[] args) {
		/*
		 자바 기본 자료형 (primitive type)
		 int 		정수 + 4byte				-2147483648 ~ + 2147483647
		 short		정수 + 2byte				-32768 ~ +32767
		 byte		정수 + 1byte				-128 ~ +127
		 long 		정수 + 8byte				아주 많이
		 
		 double		실수 + 8byte				배정도(소수이하 15자리 정도)
		 float		실수 + 4byte				단정도(소수이하 6자리 정도)
		 
		 char		문자 + 2byte				'A' '강'
		 
		 boolean	true, false + 1byte		
		 
		 stack 메모리에 들어감
		 
		 
		 */
		
		System.out.println("short의 min값: " + Short.MIN_VALUE);
		System.out.println("short의 max값: " + Short.MAX_VALUE);
		
		/*
		 wrapper: 기본 자료형을 객체화 시켜서 사용
		 int	->	Integer
		 short	->	Short
		 */
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
//		System.out.println(Boolean.MAX_VALUE);
//		System.out.println(Boolean.MIN_VALUE);
		
		
		System.out.println("-------------------------------");
		
		//heap memory, String은 힙메모리에 저장됨
		String ppp = null;								//스텍 메모리에 null이 있음, 힙에 생성 X
		String qqq = ""; //빈문자열, 길이가 0인 문자열			  스텍 메모리에 주소값 있고, 힙에 "" 들어 있음
		//문자: 한문자 'A', 문자열: 여러문자 "A", "tom"
		
		String yy = "ondal"; //heap에 "ondal" 들어있고 스텍에는 heap의 주소값만 들어있음
		
//		System.out.println(ppp.length()>0); //널포인트 에러
		System.out.println(qqq.length()>0); //false
		
		String aa = "ondal";
		String bb = "ondal"; //힙에 똑같은게 있으면 새로 생성 안하고 원래 있던걸 참조함
		if(aa==bb) //주소가 같냐?
			System.out.println(aa + "\t" + bb);
		
		if(aa.equals(bb)) //값이 같냐?
			System.out.println(aa + "\t" + bb);
		
		String aa2 = "ondal2";
		String bb2 = "ondal3";
		
		if(aa2==bb2) { //false
			System.out.println("==같네");
		} else {
			System.out.println("false");
		}
		
		if(aa2.equals(bb2)) {
			System.out.println("equals같네");
		}
		
		String cc = new String("ondal");
		String dd = new String("ondal"); //이렇게 하면 내용이 같아도 새로운 객체 생성
		
		if(cc==dd) {
			System.out.println("번지가 다르면 이건 출력 안됨");
		}
		if(cc.equals(dd)) {
			System.out.println("값이 같으니까 이거 출력");
		}
		
		
		
		
		
	}
	
}
