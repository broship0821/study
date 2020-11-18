package ex03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//크레인 인형뽑기 게임

public class Solution {
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Queue<Integer> q1 = new LinkedList<Integer>();
        for(int i=0;i<5;i++) {
        	if(board[i][0]!=0)
        		q1.add(board[i][0]);
        }
        Queue<Integer> q2 = new LinkedList<Integer>();
        for(int i=0;i<5;i++) {
        	if(board[i][1]!=0)
        		q2.add(board[i][1]);
        }
        Queue<Integer> q3 = new LinkedList<Integer>();
        for(int i=0;i<5;i++) {
        	if(board[i][2]!=0)
        		q3.add(board[i][2]);
        }
        Queue<Integer> q4 = new LinkedList<Integer>();
        for(int i=0;i<5;i++) {
        	if(board[i][3]!=0)
        		q4.add(board[i][3]);
        }
        Queue<Integer> q5 = new LinkedList<Integer>();
        for(int i=0;i<5;i++) {
        	if(board[i][4]!=0)
        		q5.add(board[i][4]);
        }
        
        ArrayList<Queue> list = new ArrayList<>();
        list.add(q1);
        list.add(q2);
        list.add(q3);
        list.add(q4);
        list.add(q5);
        
        Stack<Integer> s = new Stack<>();
        int tmp = 0;
        for(int i=0;i<moves.length;i++) {
        	//null인지 체크, 직전꺼랑 비교해서 같으면 삭제
        	int num = moves[i]-1;
        	Integer x = (Integer)list.get(num).poll();
        	if(x!=null) {
        		
        		s.add(x);
        	}
        }
        System.out.println(s);
        
        return answer;
    }

	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		solution(board, moves);

	}

}
