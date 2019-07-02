package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L42839 {

	public static void main(String[] args) {
		solution("15");
	}
	
	public static int solution(String numbers) {
//		ArrayList<String> nums = new ArrayList<>(Arrays.asList(numbers.split("")));
		ArrayList<Integer> num = new ArrayList<Integer>();
		new ArrayList<>(Arrays.asList(numbers.split(""))).stream().forEach(i -> num.add(Integer.valueOf(i)));
		System.out.println(num.toString());
		return 0;
	}
	
	public static void combination(List<Integer> list, int length, int r, int pivot) {
		if(r == 0) {
			for(int  n : list) {
				System.out.println(n);
			}
			return;
		}
		
		for(int i = pivot; i<length; i++) {
			list.add(i);
			combination(list, length, r-1, i+1);
			list.remove(list.size()-1);
		}
	}

}
