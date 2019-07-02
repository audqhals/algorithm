package programmers;

public class L12899 {

	public static void main(String[] args) {
//		solution(1);
//		solution(2);
//		solution(3);
//		solution(4);
//		solution(5);
//		solution(6);
		solution(7);
//		solution(8);
//		solution(9);
//		solution(10);
//		solution(11);
	}
	
	public static String solution(int n) {
		String answer = "";
		int[] split = {4,1,2};
		
		while(n > 0) {
			int a = n%3;
			n = n/3;
			if(a == 0) {
				n = n-1;
			}
			answer = split[a] + answer;
		}
//		System.out.println(answer);
		return answer;
	}

}
