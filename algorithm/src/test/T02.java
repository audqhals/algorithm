package test;

public class T02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8;
		int a = 4;
		int b = 7;
		
		System.out.println(solution(n, a, b));
	}
	
	public static int solution(int n, int a, int b) {
		int answer = 0;
		
		while (a != b) {
			a = a/2 + a%2;
			b = b/2 + b%2;
			answer++;
		}
		
		return answer;
		
	}
	

}
