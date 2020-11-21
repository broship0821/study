package ex05;
//K번째수


import java.util.Arrays;

public class Solution {

	public static int[] solution(int[] array, int[][] commands) {
		int[] result = new int[commands.length];
		for(int i=0;i<commands.length;i++) {
			int[] answer = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(answer);
			
			result[i] = answer[commands[i][2]-1];
		}
		System.out.println(Arrays.toString(result));
        return result;
    }
	
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(array, commands);
	}

}
