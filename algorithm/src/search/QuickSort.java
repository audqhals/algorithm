package search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class QuickSort {
	
	public static void  main(String[] args) {
		int size = 20;
		int range = 100;
		int[] arr = init(size, range);
		System.out.println(Arrays.toString(arr));
		sort(arr, 0, size-1);
		
	}
	
	private static void sort(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start+1;
		int j = end;
		int temp;
		
		while(i <= j) {
			while(i <= end && arr[i] <= arr[key]) {
				i++;
			}
			while(j > start && arr[j] >= arr[key]) {
				j--;
			}
			if(i > j) {
				swap(arr, j, key);
			}else {
				swap(arr, i, j);
			}
		}
		System.out.println(Arrays.toString(arr));
		sort(arr, start, j-1);
		sort(arr, j+1, end);
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
