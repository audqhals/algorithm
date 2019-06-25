package search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SelectionSort {
	
	public static void  main(String[] args) {
		int size = 20;
		int range = 100;
		int[] arr = init(size, range);
		System.out.println(Arrays.toString(arr));
		sort(0, arr);
		
	}
	
	private static void sort(int idx, int[] arr) {
		int minValue = arr[idx];
		int minIdx = idx;
		for(int i = idx; i < arr.length; i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
				minIdx = i;
			}
		}
		swap(arr, idx, minIdx);
		System.out.println(Arrays.toString(arr));
		if(idx < arr.length-1) {
			sort(idx+1, arr);
		}
	}

	private static void swap(int[] arr, int i, int minIdx) {
		System.out.println("swap  : " +i+ "," + minIdx);
		int temp = arr[i];
		arr[i] = arr[minIdx];
		arr[minIdx] = temp;
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

}
