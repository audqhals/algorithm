package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class L42579 {

	public static void main(String[] args) {
		Map<Integer, Integer> test = new HashMap<Integer, Integer>(1,1);
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		System.out.println(Arrays.toString(solution(genres, plays)));

	}
	
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		Map<String, Map<Integer, Integer>> compare = new HashMap<String, Map<Integer,Integer>>(); //장르 / cnt/ index
		Map<String, Integer> playCnt = new HashMap<String, Integer>(); // 장르 / cnt
		for(int i=0; i<genres.length; i++) {
			if(compare.containsKey(genres[i])) {
				if(!compare.get(genres[i]).containsKey(plays[i])) {
					compare.get(genres[i]).put(plays[i], i);
				}
				Integer temp = playCnt.get(genres[i]);
				temp = temp + plays[i];
				playCnt.put(genres[i], temp);
			}else {
				compare.put(genres[i], new HashMap<Integer, Integer>());
				compare.get(genres[i]).put(plays[i],i);
				playCnt.put(genres[i], plays[i]);
			}
		}
		ArrayList<String> sorted = new ArrayList<String>();
		sorted.addAll(playCnt.keySet());
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if(playCnt.get(o1) > playCnt.get(o2)) {
					return -1;
				}else {
					return 1;
				}
			}
		};
		sorted.sort(c);
		answer = new int[sorted.size()*2];
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (String item : sorted) {
			Object[] songCnt = compare.get(item).keySet().toArray();
			Arrays.sort(songCnt);
			compare.get(item).size();
			for(int i=0; i<2; i++) {
				result.add(compare.get(item).get(songCnt[songCnt.length-1-i]));
			}
		}
		for(int i=0; i<answer.length; i++) {
			answer[i] = result.get(i);
		}
		return answer;
	}

}
