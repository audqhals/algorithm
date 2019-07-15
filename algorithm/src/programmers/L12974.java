package programmers;

public class L12974 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] rectangles = {{0, 1, 4, 4}, {3, 1, 5, 3}};
		L12974 solution = new L12974();
		System.out.println(solution.solution(rectangles));
	}
	
	public long solution(int[][] rectangles) {
		long answer = 0;
		
		int[] map = getMap(rectangles); //x1,y1,x2,y2
		
		for(int i=map[0]; i<map[2]; i++) {
			for(int j=map[1]; j<map[3]; j++) {
				if(isInRectangle(rectangles,i,j)) {
					answer++;
				}
			}
		}
		return answer;
	}

	private boolean isInRectangle(int[][] rectangles, int i, int j) {
		for(int[] item : rectangles) {
			if(item[0] <= i && item[2] >= i+1 
					&& item[1] <= j && item[3] >= j+1) {
				return true;
			}
		}
		return false;
	}

	private int[] getMap(int[][] rectangles) {
		int[] map = {Integer.MAX_VALUE,Integer.MAX_VALUE,0,0};
		for(int[] item : rectangles) {
			if(item[0] < map[0]) {
				map[0] = item[0];
			}
			if(item[1] < map[1]) {
				map[1] = item[1];
			}
			if(item[2] > map[2]) {
				map[2] = item[2];
			}
			if(item[3] > map[3]) {
				map[3] = item[3];
			}
		}
		return map;
	}

}
