package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ex01스킬트리3 {
	
	public static int solution(String skill, String[] skill_trees) {
		System.out.println(skill.indexOf("BD"));
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
            /*
             "[^" + skill + "]" -> 정규표현식, skill(CBD)를 제외한 모든걸 뜻함
             it.next().replaceAll("[^" + skill + "]", "") -> skill_trees에서 CBD만 남음
              밑의 예제 처럼이면
            BCD
			CBD
			CB
			BD
			이렇게 남음 그리고
			skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) 이걸하면
			아예 틀리면 -1
			처음부터 맞으면 0
			두번째 맞으면 1, 세번쨴 2... 이런식임
			그래서 != 0을 해서 처음부터 맞는것(CBD 이순서대로 된거)만 남김
			BCD -> -1 제거
			CBD -> 0 남김
			CB -> 0 남김
			BD -> 1 제거(맞긴 맞으나 CBD중 0번쨰가 아닌 1번쨰부터 맞으므로 1, 그래서 제거)
			
			이제 남은 개수가 정답임
             */
        }
        answer = skillTrees.size();
        return answer;
    }

	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA", "QWE"};
		solution(skill, skill_trees);

	}

}
