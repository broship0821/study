package level2;

import java.util.Arrays;

public class ex01스킬트리 {
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        
        for (int i = 0; i < skill_trees.length; i++) {
        	int x = 0;
			for(int j=0;j<skill.length();j++) {
				int tmp = skill_trees[i].indexOf(skill.charAt(j));
				System.out.println("tmp: "+tmp);
				if(tmp!=-1) {
					if(x>tmp) {
						answer--;
						break;
					}
					x = tmp;
					System.out.println("x: "+x);
				}
			}
		}
        System.out.println("answer: "+answer);
        
        return answer;
    }

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BDA"};
		solution(skill, skill_trees);

	}

}
