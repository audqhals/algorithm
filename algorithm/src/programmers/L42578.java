package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L42578 {
	
	public static void main(String[] args) {
//		String[][] clothes =  {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes =  {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}, {"green_turba", "headgear"}, {"green_turban", "headgea"}};
		System.out.println(solution(clothes));
	}
	
	public static int solution(String[][] clothes) {
		int answer = 1;
		Map<String, Set<String>> compare =  new HashMap<String, Set<String>>();
		for(String[] item : clothes) {
			if(compare.containsKey(item[1])) {
				compare.get(item[1]).add(item[0]);
			}else {
				compare.put(item[1], new HashSet<String>(Arrays.asList(item[0])));				
			}
//			System.out.println(Arrays.toString(item));
		}
		
		for(Set<String> item : compare.values()) {
			answer = answer * (item.size() + 1);
			
		}
		return answer-1;
		
	}

}
