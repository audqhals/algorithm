package programmers;

import java.util.Arrays;
import java.util.Stack;

public class Level_1 {

	public static void main(String[] args) {
//		int[] d = {2,2,3,3};
//		int[] d = {2,6,8,14};
//		int[] d = {12,11};
//		String[][] d = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//		int budget = 10;
//		System.out.println(solution(d, budget));
//		System.out.println(solution(1025));
//		System.out.println(solution("baabaa"));
//		System.out.println(solution("cdcd"));
		
		System.out.println((int)Math.ceil((double)7/(double)2));
		
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		solution(progresses, speeds);
	}
	
	public static int solution(int[] d, int budget) {
	      int answer = 0;
	      Arrays.sort(d);
	      for(int item : d) {
	    	  if(budget >= item) {
	    		  budget = budget - item;
	    		  answer++;
	    	  }
	      }
	      return answer;
	  }
	
	public static String solution(int num) {
		String answer = "";
		if((num%2) == 0) {
			answer = "Even";
		}else {
			answer = "Odd";
		}
		return answer;
	}
	
	public static int solution(String s) {
        int answer = 0;
        int length = s.length();
        Stack<Character> charStack = new Stack<>();
        for(int i=0; i<length; i++) {
        	if(charStack.size() == 0) {
        		charStack.push(s.charAt(i));
        	}else if(s.charAt(i) != charStack.peek()) {
        		charStack.push(s.charAt(i));
        	}else {
        		while (!charStack.isEmpty() && charStack.peek() == s.charAt(i)) {
        			charStack.pop();					
				}
        	}
        }
        if(charStack.size() == 0) {
    		answer = 1;
    	}
        return answer;
    }
	
	public static int solution(int[] arr) {
		int answer = 1;
		boolean flag = true;
		Stack<Integer> stack = new Stack<Integer>();
		int seed = 2;
		while(flag) {
			boolean isDivine = false;
			boolean isDivineFinish = true;
			for(int i=0; i<arr.length; i++) {
				if(arr[i]%seed == 0) {
					isDivine = true;
					arr[i] = arr[i]/seed;
				}else {
					if(arr[i] > seed) {
						isDivineFinish = false;
					}
				}
			}
			if(isDivine) {
				stack.push(seed);
			}else {
				seed++;
			}
			if(isDivineFinish) {
				for(int i=0; i<arr.length; i++) {
					stack.push(arr[i]);
				}
				break;
			}
		}
		
		for(Integer item : stack) {
			answer = answer * item;
		}
		
		return answer;
	  }
	
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		final int  progress = 100;
		int[] days = new int[progresses.length];
		
		for(int i=0; i<progresses.length; i++) {
			int day = (int)Math.ceil(((double)(progress - progresses[i]))/(double)speeds[i]);
			days[i] = day;
		}
		
		Arrays.sort(days);
		for(int i=0; i<progresses.length; i++) {
			
		}

		return answer;
    }

}
