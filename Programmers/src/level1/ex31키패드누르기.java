package level1;

public class ex31키패드누르기 {
	
	public static String solution(int[] numbers, String hand) {
		
		String answer = "";
		int lh = -1;
		int rh = -1;
		int ld = 0;
		int rd = 0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7) {
				lh = numbers[i];
				answer += "L";
			} else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
				rh = numbers[i];
				answer += "R";
			}
			else if(numbers[i]==2) {
				switch(lh) {
				case 2: ld = 0; break;
				case 1: case 5: ld = 1; break;
				case 4: case 8: ld = 2; break;
				case 7: case 0: ld = 3; break;
				case -1: ld = 4;
				}
				switch(rh) {
				case 2: rd = 0; break;
				case 3: case 5: rd = 1; break;
				case 6: case 8: rd = 2; break;
				case 9: case 0: rd = 3; break;
				case -1: rd = 4;
				}
				if(ld==rd) {
					if(hand.equals("left")) {
						lh = numbers[i];
						answer += "L";
					} else {
						rh = numbers[i];
						answer += "R";
					}
				} else if(ld<rd) {
					lh = numbers[i];
					answer += "L";
				} else {
					rh = numbers[i];
					answer += "R";
				}
			}
			else if(numbers[i]==5) {
				switch(lh) {
				case 5: ld = 0; break;
				case 2: case 4: case 8: ld = 1; break;
				case 1: case 7: case 0: ld = 2; break;
				case -1: ld = 3;
				}
				switch(rh) {
				case 5: rd = 0; break;
				case 2: case 6: case 8: rd = 1; break;
				case 3: case 9: case 0: rd = 2; break;
				case -1: rd = 3;
				}
				if(ld==rd) {
					if(hand.equals("left")) {
						lh = numbers[i];
						answer += "L";
					} else {
						rh = numbers[i];
						answer += "R";
					}
				} else if(ld<rd) {
					lh = numbers[i];
					answer += "L";
				} else {
					rh = numbers[i];
					answer += "R";
				}
			}
			else if(numbers[i]==8) {
				switch(lh) {
				case 8: ld = 0; break;
				case 7: case 5: case 0: ld = 1; break;
				case 4: case 2: case -1: ld = 2; break;
				case 1: ld = 3;
				}
				switch(rh) {
				case 8: rd = 0; break;
				case 9: case 5: case 0: rd = 1; break;
				case 6: case 2: case -1: rd = 2; break;
				case 3: rd = 3;
				}
				if(ld==rd) {
					if(hand.equals("left")) {
						lh = numbers[i];
						answer += "L";
					} else {
						rh = numbers[i];
						answer += "R";
					}
				} else if(ld<rd) {
					lh = numbers[i];
					answer += "L";
				} else {
					rh = numbers[i];
					answer += "R";
				}
			}
			else if(numbers[i]==0) {
				switch(lh) {
				case 0: ld = 0; break;
				case -1: case 8: ld = 1; break;
				case 7: case 5: ld = 2; break;
				case 4: case 2: ld = 3; break;
				case 1: ld = 4;
				}
				switch(rh) {
				case 0: rd = 0; break;
				case 8: case -1: rd = 1; break;
				case 9: case 5: rd = 2; break;
				case 6: case 2: rd = 3; break;
				case 3: rd = 4;
				}
				if(ld==rd) {
					if(hand.equals("left")) {
						lh = numbers[i];
						answer += "L";
					} else {
						rh = numbers[i];
						answer += "R";
					}
				} else if(ld<rd) {
					lh = numbers[i];
					answer += "L";
				} else {
					rh = numbers[i];
					answer += "R";
				}
			}
		}
        return answer;
    }

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		solution(numbers, hand);

	}

}
