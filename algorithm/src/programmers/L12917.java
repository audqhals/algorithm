package programmers;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L12917 {
	
	public static void main(String[] args) {
		L12917 solution = new L12917();
		String s = "Zabcdefg";
		System.out.println(solution.solution(s));
	}
	
	public String solution(String s) {
		String answer = Stream.of(s.split(""))
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.joining());
		
		/**
		 * 
		 *
		char[] sChar = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		Arrays.sort(sChar);
		for(char item : sChar) {
			sb.append(item);
		}
		answer = sb.reverse().toString();
		*/
		return answer;
	}

}