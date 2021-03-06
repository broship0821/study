package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ex01스킬트리 {
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        
        int skillSize = skill.length();
        
        Character[] c = new Character[skillSize];
        for(int i=0;i<skillSize;i++) {
        	c[i] = skill.charAt(i);
        }
        System.out.println(Arrays.toString(c));
        
        for (int i = 0; i < skill_trees.length; i++) {
        	Queue<Character> skillQueue = new LinkedList<>(Arrays.asList(c));
        	
        	Queue<Character> skillTreeQueue = new LinkedList<>();
        	for(int j=0;j<skill_trees[i].length();j++) {
        		skillTreeQueue.offer(skill_trees[i].charAt(j));
        		if(skill.indexOf(skillTreeQueue.peek())!=-1) {
        			if(skillTreeQueue.peek()==skillQueue.peek()) {
        				skillTreeQueue.poll();
        				skillQueue.poll();
        			} else {
        				answer--;
        				break;
        			}
        		} else {
        			skillTreeQueue.poll();
        		}
        	}
        	
		}
        System.out.println();
        System.out.println("answer: "+answer);
        
        return answer;
    }

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA", "QWE"};
		solution(skill, skill_trees);

	}

}
