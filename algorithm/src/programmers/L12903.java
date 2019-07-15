package programmers;

public class L12903 {

	public static void main(String[] args) {

		L12903 solL12903 = new L12903();
		System.out.println(solL12903.solution("abcd"));
	}
	
	public String solution(String s) {
		String answer = "";
		int len = s.length();
		if(len%2 > 0) {
			answer = s.substring(len/2, len/2+1);
		}else {
			answer = s.substring(len/2-1, len/2+1);			
		}
		return answer;
	}

}
