package test;

import java.util.Arrays;

public class T01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] v = {{1, 4}, {3, 4}, {3, 10}};
		System.out.println(Arrays.toString(solution(v)));
	}
	
	public static int[] solution(int[][] v) {
		int[] answer = {};
		
		if(v[0][0] == v[1][0]) {
			answer[0] = v[2][0];
		}else {
			answer[0] = v[0][0];
		}

        return answer;
	}

}
