package ������;

import com.sun.jdi.ArrayReference;

public class �޼���5���� {

	public static void main(String[] args) {
		int[] arr = new int[] {9, 1, 4, 6, 7, 3, 2, 8, 5, 6, 0};
		System.out.print("�迭�� �� : ");
		printArray(arr);
		System.out.println();
		System.out.print("�������� �� : ");
		sortArray(arr);
		printArray(arr);
	}
	
	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static void sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

}
