package com.kh.array;

public class Exam_SortInsertion {
	public static void main(String [] args) {
		// 삽입정렬
		// 정렬 알고리즘 중에 하나이면서 가장 간단하고 기본이 되는 알고리즘
		// 배열의 n번 인덱스값을 0번 ~ n-1번 인덱스까지 비교
		// {2, 5, 4, 1, 3 } -> {1, 2, 3, 4, 5}
		/*
		 * i = 1
		 * 2, 5, 4, 1, 3
		 * i = 2
		 * 2, 4, 5, 1, 3
		 * i = 3
		 * 1, 2, 4, 5, 3
		 * i = 4
		 * 1, 2, 3, 4, 5
		 */
		int [] arrs = {2, 5, 4, 1, 3};
		for(int i = 1; i < arrs.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arrs[j-1] > arrs[j]) { // 왼쪽값과 비교하는구나
					// 참이면 바꾼다
					int temp = arrs[j-1];
					arrs[j-1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
}



