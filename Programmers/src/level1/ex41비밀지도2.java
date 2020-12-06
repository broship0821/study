package level1;

import java.text.DecimalFormat;
import java.util.Arrays;

public class ex41비밀지도2 {
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String deciFormat = new String(new char[n]).replace("\0", "0"); //00000 이런 문자열 만듬
		DecimalFormat df = new DecimalFormat(deciFormat); //format으로 만듬
		for(int i=0;i<n;i++) {
			answer[i] = df.format(Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i]))).replace('1', '#').replace('0', ' ');
			//비트연산자 결과를 포멧으로 집어넘, 그럼 n자리수 만큼 0이 채워진 이진수 문자열이 들어감
			//이진수가 길어지면 int 범위 벗어날 수 있으므로 Long.parseLong 사용
		}
		System.out.println(Arrays.toString(answer));
		/*
		 * 자리수를 이렇게 채워도 됨
		String tmp = String.format("%"+n+"s", "1"); //이러면 남은자리는 빈칸으로됨
		System.out.println(tmp);
		*/
		
        return answer;
    }
	/*
	 public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]); // "1" -> "    1" 이렇게 됨, 빈칸은 놔두고 1이면 #로, 0이면 " "로 바꾸면 저절로됨
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
	 */

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		solution(n, arr1, arr2);

	}

}
