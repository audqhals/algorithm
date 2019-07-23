package programmers;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class L12901 {

	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		L12901 solL12901 = new L12901();
		System.out.println(solL12901.solution(a, b));
	}
	
	public String solution(int a, int b) {
		String answer = "";
		
		LocalDate date = LocalDate.of(2016, a, b);
		return date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();		
	}

}
