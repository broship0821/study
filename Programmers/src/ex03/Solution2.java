package ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//크레인 인형뽑기 게임

public class Solution2 {
	
	public static int solution(int[][] board, int[] moves) {
        int size = board.length;
        //2차원 배열을 세로로 묶어서 각각 큐에 담기
        ArrayList<Queue<Integer>> list = new ArrayList<>(); //그 큐를 담을 리스트
        
        for(int i=0;i<size;i++) {
        	list.add(new LinkedList<Integer>());//한줄 먼저 만들기
        	for(int j=0;j<board[i].length;j++) {
        		if(board[j][i]!=0) //세로줄 담기
            		list.get(i).offer(board[j][i]);
        	}
        }
        
        
        Stack<Integer> s = new Stack<>(); //인형 담을 상자 만들기, LIFO 구조니까 스텍으로
        int count = 0; //사라지는 인형 숫자
        for(int i=0;i<moves.length;i++) {
        	Integer x = list.get(moves[i]-1).poll(); //move에 있는 숫자 순서대로 큐에서 꺼내기
        	if(x!=null) {
        		if(!s.isEmpty()&&x==s.peek()) { //스텍이 비어있지 않고 꺼내온게 맨 위에꺼랑 같으면
        			s.pop(); //맨 위에꺼 없앰
        			count+=2; //2개 사라짐
        		}
        		else
        			s.push(x); //스텍이 비어있거나 가져온게 맨 위에꺼랑 다르면 집어넣음
        	}
        }
        System.out.println(s);
        
        return count;
    }

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board, moves));

	}

}
