package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dirs = "ULURRDLLU";
//		dirs = "LULLLLLLU";
//		dirs = "LLLLLRRRRRUUUUUDDDDDDDDDD";
		System.out.println(solution(dirs));

	}
	
	public static int solution(String dirs) {
		int wPosition = 0;
		int hPosition = 0;
		
		Set<String> set = new HashSet<String>();
		
		char[] charArr = dirs.toCharArray();
		for(int i=0; i<charArr.length; i++) {
			String before = getPosition(wPosition,hPosition);
			
			if("U".equals(Character.toString(charArr[i]))) {
				if(Math.abs(hPosition+1) <= 5) {
					hPosition++;					
				}else {
					continue;
				}
			}
			if("D".equals(Character.toString(charArr[i]))) {
				if(Math.abs(hPosition-1) <= 5) {
					hPosition--;					
				}else {
					continue;
				}
			}
			if("L".equals(Character.toString(charArr[i]))) {
				if(Math.abs(wPosition-1) <= 5) {
					wPosition--;					
				}else {
					continue;
				}
			}
			if("R".equals(Character.toString(charArr[i]))) {
				if(Math.abs(wPosition+1) <= 5) {
					wPosition++;					
				}else {
					continue;
				}
			}
			String after = getPosition(wPosition,hPosition);
			String[] positionInfo = {before,after};
			Arrays.sort(positionInfo);
			
			String path = new StringBuffer().append(positionInfo[0]).append(positionInfo[1]).toString();
			set.add(path);
		}
		
        return set.size();
	}

	private static String getPosition(int wPosition, int hPosition) {
		StringBuilder sb = new StringBuilder();
		sb.append(wPosition);
		sb.append(",");
		sb.append(hPosition);
		return sb.toString();
	}

}
