package level2;

import java.util.Arrays;

public class ex01스킬트리 {
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        int size = skill.length();
        
        int[] tmp = new int[size];
        for (int i = 0; i < skill_trees.length; i++) {
			for(int j=0;j<size;j++) {
				tmp[j] = skill_trees[i].indexOf(skill.charAt(j));
			}
			for(int k=0;k<size-1;k++) {
				if(tmp[k]>tmp[k+1]) {
					answer--;
					break;
				}
			}
		}
        System.out.println(Arrays.toString(tmp));
        System.out.println(answer);
        
        return answer;
    }

	public static void main(String[] args) {
		String skill = "ABC";
		String[] skill_trees = {"OPQ"};
		solution(skill, skill_trees);

	}

}
