package programmers;

import java.util.ArrayList;

public class L42841 {
	
	public static void main(String[] args) {
		int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
		solution(baseball);
	}
	
	public static int solution(int[][] baseball) {
		int answer = 0;
		
		ArrayList<Integer> temp = checkBox(baseball[0]);
		return answer;
	}

	private static ArrayList<Integer> checkBox(int[] is) {
		char[] checkNum = String.valueOf(is[0]).toCharArray();
		int strike = is[1];
		int ball = is[2];
		int[] strikeBall = {is[1],is[2]};
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 123; i<=987; i++) {
			int[] sb = getStrikeBall(checkNum,i);
			if(sb[0] == strikeBall[0] && sb[1] == strikeBall[1]) {
				result.add(i);
			}
		}
		return result;
	}

	private static int[] getStrikeBall(char[] checkNum, int num) {
		int sb[] = {0,0};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {				
				if(String.valueOf(num).charAt(i) == checkNum[j]) {
					if(i == j) {
						sb[0]++;
					}else {
						sb[1]++;
					}
				}
			}
		}
		return sb;
	}

}
