package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		Object result = null;
		
//		int[][] diagonalDifference = {{11,2,4},{4,5,6},{10,8,-12}};
//		result = diagonalDifference(diagonalDifference);
		
//		int[] plusMinus = {-4,3,-9,0,4,1};
//		plusMinus(plusMinus);
		
//		staircase(5);
		
//		int[] miniMaxSum = {256741038, 623958417, 467905213, 714532089, 938071625};
//		int[] miniMaxSum = {5,5,5,5,5};
//		miniMaxSum(miniMaxSum);
		
		
//		List<Integer> a = Arrays.asList(5,7,7);
//		List<Integer> b = Arrays.asList(3,6,10);
//		result = compareTriplets(a, b);
		
//		int[] birthdayCakeCandles = {3,2,1,3,5,5,5,23,4,1};
//		result = birthdayCakeCandles(birthdayCakeCandles);
		
//		String timeConversion = "12:45:54PM";
//		result = timeConversion(timeConversion);
		
//		int[] array = {1, 5, 2, 6, 3, 7, 4}; 
//		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//		kNumber(array, commands);
		
		Set<String> set = new TreeSet<>();		
		result = set(set);
		
		String a = new String();
		
		System.out.println(result);
	}

	private static Object set(Set<String> set) {
		
		set.add("가,20");
		set.add("가,10");
		set.add("나,1000");
		set.add("나,10");
//		set.forEach(e -> System.out.println(e));
		for (Iterator<String> e = set.iterator(); e.hasNext();) {
			System.out.println(e.next());
		}
 
		return null;
	}

	private static List<Stack<Integer>> doDo() {
		final List<Integer> elements = Arrays.asList(9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2);
		Stack<Integer> stack = new Stack<>();
		List<Stack<Integer>> result = new ArrayList<>();
		int compare = 0;
		for(Integer item : elements) {
			if(compare+item > 20) {
				result.add(stack);
				stack = new Stack<>();
				stack.push(item);
				compare = item;
			}else {
				stack.push(item);
				compare = compare + item;
			}
		}
		
		result.add(stack);
		return result;
	}
	
	public static int countBits(int number){
		String binary = Integer.toBinaryString(number);
		String[] binaryList = binary.split("");
		
		int count = 0;
		for(String item : binaryList){
			if("1".equals(item))
			count++;
		}
		
		return count;

	}
	
	static int diagonalDifference(int[][] arr) {
        int left = 0;
        int right = 0;
        for(int i = 0; i < arr.length; i++) {
        	int[] subArr = arr[i];
        	for(int j = 0; j < subArr.length; j++) {
        		if(i == j) {
        			left += arr[i][j];
        		} 
        		if ((i+j) == (arr.length -1)) {
					right += arr[i][j];
				}
        	}
        }
        
        return Math.abs(left - right);

    }
	
	static void plusMinus(int[] arr) {
		double size = arr.length;
		double pos = 0;
		double neg = 0;
		double zero = 0;
		
		for(int a : arr) {
			if(a == 0) {
				zero ++;
			}else if (a > 0) {
				pos ++;
			}else {
				neg ++;
			}
		}
		System.out.println(String.format("%.6f", (pos/size)));
		System.out.println(String.format("%.6f", (neg/size)));
		System.out.println(String.format("%.6f", (zero/size)));
    }
	
	static void staircase(int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if ((i+j) > (n -2)) {
					System.out.print("#");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
	
	static void miniMaxSum(int[] arr) {

		long min = 0;
		long max = 0;
		
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			if(i > 0) {
				max += arr[i];
			}
			if (i < arr.length-1) {
				min += arr[i];
			}
			
		}
		
		System.out.print(min);
		System.out.print(" ");
		System.out.print(max);

    }
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int aResult = 0;
		int bResult = 0;
		
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i) > b.get(i)) {
				aResult++;
			}
			if(a.get(i) < b.get(i)) {
				bResult++;
			}
		}
		
		return Arrays.asList(aResult,bResult);
    }
	
	static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		
		int result = 0;
		int temp = 0;
		int key = ar[0];
		
		for(int a : ar) {
			if(key == a) {
				temp++;
			}else {
				if(temp > result) {
					result = temp;
				}
				key = a;
				temp = 1;
			}
		}
		
		return result > temp ? result : temp;
    }
	
	static String timeConversion(String s) {
		String result = "";
		if(s.contains("A")) {
			int hour = Integer.parseInt(s.substring(0, 2));
			hour = hour%12;
			String hourS = String.valueOf(hour);
			if (hourS.length() == 1) {
				hourS = "0"+hourS;
			}
			result = hourS + s.substring(2, 8);
		}else {
			int hour = Integer.parseInt(s.substring(0, 2));
			hour = (hour+12)%24;
			String hourS = String.valueOf(hour);
			if (hourS.length() == 1) {
				hourS = "12";
			}
			result = hourS + s.substring(2, 8);
		}
		return result;
    }
	
	static int[] kNumber(int[] array, int[][] commands) {
		return array;
        
    }
	
	
	
	

}
