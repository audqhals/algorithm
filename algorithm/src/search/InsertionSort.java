package search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InsertionSort {

	public static void main(String[] args) {
		int size = 20;
		int range = 100;
		int[] arr = init(size, range);
		System.out.println(Arrays.toString(arr));
		sort(arr);
	}
	
	private static void sort(int[] arr) {
		int size = arr.length;
		
		for(int i=0; i<size-1; i++) {
			int j=i;
			while(j>=0 && arr[j] > arr[j+1]) {
				swap(arr, j, j+1);
				j--;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
	}
	
	private static void swap(int[] arr, int i, int minIdx) {
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
