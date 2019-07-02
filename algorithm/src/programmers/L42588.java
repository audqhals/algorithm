package programmers;

import java.util.Arrays;

public class L42588 {

	public static void main(String[] args) {
		int[] heights = {6,9,5,7,4};
		System.out.println(Arrays.toString(solution(heights)));
		
	}
	
	public static int[] solution(int[] heights) {
        int[] answer = {};
        answer = new int[heights.length];
        for (int i = heights.length-1; i >= 0; i--) {
			int idx = 0;
			for (int j = i-1; j >= 0; j--) {
				if(heights[i] < heights[j]) {
					answer[i] = j+1;
					break;
				}
			}
			
		}
        return answer;
    }

}
