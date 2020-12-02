package level1;

import java.util.Arrays;

public class ex24이상한문자만들기 {

	public static String solution(String s) {
		StringBuilder answer = new StringBuilder();
		String[] arr = s.split(" ");
//		String[] arr = s.split(" ", -1); //-1 하니까 됨, -1 하면 문자열길이가0이어도 잘려짐, 공백 유지가 됨
		
		for(int j=0;j<arr.length;j++) {
			StringBuilder tmp = new StringBuilder();
			for(int i=0;i<arr[j].length();i++) {
				if(i%2==0) {
					tmp.append(Character.toUpperCase(arr[j].charAt(i)));
				} else {
					tmp.append(Character.toLowerCase(arr[j].charAt(i)));
				}
			}
			arr[j] = tmp.toString();
		}
		System.out.println(Arrays.toString(arr));
		for(String a : arr) {
			answer.append(a);
			answer.append(" ");
		}
		answer.deleteCharAt(answer.length()-1);
        return answer.toString();
    }
	
	/*
	 
	 public String solution(String s) {
          String answer = "";
          String[] a=s.split(" ",-1);

          for(int i=0; i<a.length; i++){
              String msg=a[i];
              for(int j=0; j<msg.length(); j++){
                  if(j%2==1){
                     String b=Character.toString(msg.charAt(j));
                     answer+=b.toLowerCase();
                  }else{
                      String b=Character.toString(msg.charAt(j));
                         answer+=b.toUpperCase();
                  }
              }
              if(i==a.length-1){break;}
              answer+=" ";
          }

          return answer;
      }
	 */
	
	public static void main(String[] args) {
		solution(" try hello   world ");
	}
	
}
