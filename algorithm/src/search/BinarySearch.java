package search;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BinarySearch {
	
	public static void main(String[] args) {
		int size = 200;
		int range = 1000;
		int[] arr = init(size, range);
		int key = arr[random(size)];
		System.out.println("Arr :" + Arrays.toString(arr));
		System.out.println("Key :" + key);
		search(key, arr);
	}

	

	private static void search(int key, int[] arr) {
		int mid = arr.length/2;
		System.out.println("arr.length : " + arr.length);
		System.out.println("mid : " + mid);
		if(key > arr[mid]) {
			search(key, Arrays.copyOfRange(arr, mid+1, arr.length));
		}else if (key < arr[mid]) {
			search(key, Arrays.copyOfRange(arr, 0, mid));			
		}else {
			System.out.println("End :" + arr[mid]);
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
		Arrays.sort(arr);
		return arr;		
	}
	
	private static int random(int i) {
		return (int) (Math.random() * i);
	}
	
}
