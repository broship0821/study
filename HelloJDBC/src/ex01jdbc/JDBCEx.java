package ex01jdbc;
/*
 sql 언어(structured query language)
!= sql*plus는 tool
1) query 문 : select ((CRUD 의 R)
2) dml(data manipulation language) 데이터 조작(작동) 언어  
 insert, delete, update(crud의 cdu)
3) ddl (data definition language) create,  //주석은 설명문에불과(comment)
주석은 설명문에불과
--sql 주석은 하이픈 하이픈이다.

### JDBC(Java DataBase Connectivity)
   
         c=  pro*c    _ oracle
                
                 pro*covol    -  Common business orientied lanaguage

                     main () {

     printf("%d);
     EXEC SQL select *

                      }

            처럼
      
              System.out.println() ;
              String str1 = "Select  * from"
    
               " insert  "
 
               " update"
 
               " delete  "
               
        ojdbc연결 필요
        
        파워쉘: 윈 + x 그리고 a(관리자)
        
    락풀기: alter user hr identified by hr account unlock;
    sqlplus hr/hr -> hr 계정으로 로그인
    select * from employees;
    l -> 방금 친 명령어 보여줌
    / -> 방금 친 명령어 실행
    run -> 방금 친 명령어 보여주고 실행
    ed -> 명령어 텍스트로 띄움
    save aa -> aa.sql 로 저장 (C:\Windows\System32)
    sql developer는 C:\Users\PeterJeon\AppData\Roaming\SQL Developer에 저장됨
    윈도우 검색(검색하려면 여기에 입력하십시오)에 %appdata% 하면 C:\Users\PeterJeon\AppData\Roaming 으로감
    
    hr 기본 테이블 7가지
    select * from employees;
	select * from departments;
	select * from locations;
	select * from countries;
	select * from regions;
	select * from job_history;
	select * from jobs;
	
	전체 감싸고 컨트롤엔터하면 각자 실행됨
	전체 감싸고 -마오- 스크립트로 실행 하면 한 화면에 다 출력됨
	그래서 db깔때 이런 스크립트 파일이 하나 있어서 hr같은 테이블과 데이터들이 저장됨
	
	##############sql developer 로 ERD 추출하기

-.메뉴에서 보기 -data modeler - 브라우저

-.좌측아래의 브라우저 창에서 맨앞 +기호클릭한후
 나타나는 "관계형모델[1]" -마오-새관계형모델

-.화면우측에 relational...이 만들어진다

-.7개 HR 테이블을 드래그 하되 테이블앞의 그림을 드래그 하여
 (이때 드래그가 잘안되면 오른쪽마우스를 누른채로 드래그해본다)
  우측 relational...탭창에 넣는다

-.간단하게 보기위해 relational...탭창에서 -마오-하여
 세부정보보기 에서 "열"만 남기고 체크표시를 다 지운다

-. 이미지나 pdf로 결과를 저장하기위해 relational...탭창에서
  -마오 한후
  "다이어그램인쇄"에서 선택하여 저장한다
    
    
 */
public class JDBCEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
