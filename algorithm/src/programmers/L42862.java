package programmers;

public class L42862 {

	public static void main(String[] args) {
		L42862 solution = new L42862();
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		System.out.println(solution.solution(n, lost, reserve));
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
//		for(int i=0; i<reserve.length; i++) {
//			int j=0;
////			Loop : 
//			for(j<lost.length; j++) {
//				if(Math.abs(reserve[i] - lost[j]) == 1) {
//					answer++;
////					break Loop;
//				}
//			}
//		}
		return answer;
	}

}
