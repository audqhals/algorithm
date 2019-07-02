package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class L42840 {

	public static void main(String[] args) {
//		int[] answers = {1,2,3,4,5};
		int[] answers = {1,3,2,4,2};
		System.out.println(Arrays.toString(solution(answers)));

	}
	
	public static int[] solution(int[] answers) {
		int[] answer = {};
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int aCnt = 0;
		int bCnt = 0;
		int cCnt = 0;
		for(int i=0; i<answers.length; i++) {
			if(a[i%a.length] == answers[i]) {
				aCnt++;
			}
			if(b[i%b.length] == answers[i]) {
				bCnt++;
			}
			if(c[i%c.length] == answers[i]) {
				cCnt++;
			}
		}
		int[] cnt = {aCnt, bCnt, cCnt};
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<cnt.length; i++) {
			if(!(cnt[i] < cnt[(i+1)%cnt.length]) && !(cnt[i] < cnt[(i+2)%cnt.length])){
				result.add(i+1);
			}
		}
		answer =  new int[result.size()];
		for(int i=0; i<result.size(); i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}

}
