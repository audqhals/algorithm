package search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BubbleSort {

	public static void main(String[] args) {
		int size = 10;
		int range = 20;
		int[] arr = init(size, range);
		System.out.println(Arrays.toString(arr));
		long start = System.currentTimeMillis();
		sort(arr);
//		System.out.println("process_time : " + (System.currentTimeMillis() - start));
	}
	
	private static void sort(int[] arr) {
		int size = arr.length;
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	private static int[] init(int size,int seed) {
		Set<Integer> set = new HashSet<>();
		while (set.size() < size) {
			set.add((int) (Math.random()*seed));
			System.out.println("set size : " + set.size());
		}
		System.out.println();
		
		int[] arr = new int[size];
		int idx = 0;
		for(Integer item : set) {
			arr[idx] = item;
			idx++;
			System.out.println("set item : " +item);
		}
		System.out.println();
		return arr;		
	}
	
	private static void swap(int[] arr, int i, int minIdx) {
//		System.out.println("swap  : " +i+ "," + minIdx);
		int temp = arr[i];
		arr[i] = arr[minIdx];
		arr[minIdx] = temp;
	}

}
