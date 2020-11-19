package ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//크레인 인형뽑기 게임

public class Solution3 {
	
	public static int solution(int[][] board, int[] moves) {
		/*
		 난 2차원 배열을 세로로 묶어서 큐에 담았는데 사실 그럴 필요 없었음
		 바로 2차원 배열에 접근해서 그 값을 스텍에 쌓을 수 있었음
		 */
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) { //move 배열에서 값 하나 꺼내기
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {//2차원 배열 세로줄 접근, 0이 아닐때만 실행
                    if (stack.isEmpty()) { //스텍이 비어있을때만 실행
                        stack.push(board[j][move - 1]); //2차원배열 세로줄 에서 맨 위에 값 스텍에 집어넣기
                        board[j][move - 1] = 0; //꺼낸 효과를 주기위해 0주기(삭제하기)
                        break; //반복 불필요
                    }
                    if (board[j][move - 1] == stack.peek()) {//스텍에 하나라도 있을때 가져온거랑 맨 위에꺼랑 비교
                        stack.pop(); //똑같으면 맨 위에꺼 없애고 사라진 인형 +2 하기
                        answer += 2;
                    } else
                        stack.push(board[j][move - 1]); //안같으면 맨 위에 올리기
                    board[j][move - 1] = 0;//꺼내왔으니까 삭제하기
                    break;
                }
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board, moves));

	}

}
