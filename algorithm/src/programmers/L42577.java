package programmers;

import java.util.Arrays;

public class L42577 {

	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"123", "456", "789"};
		System.out.println(solution(phone_book));
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        String temp = "";
        for(int i=0; i<phone_book.length; i++) {
        	if(i+1 < phone_book.length && phone_book[i+1].startsWith(phone_book[i])) {
        		return false;
        	}
        }
        return answer;
    }

}
