package com.kh.array;

public class Exam_SortSelection {
	public static void main(String [] args) {
		// 선택정렬
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 특징 : 데이터 양이 적을 때 좋은 성능을 보여주는 정렬
		//      데이터 양이 많을 때 급격한 성능 저하르 보임
		// 배열의 n번 인덕스값을 n+1번 ~ 마지막 인덱스까지 비교
		int [] arrs = {2, 5, 4, 1, 3};
		int min;
		/* i = 0;
		 * 1, 5, 4, 2, 3
		 * i = 1,
		 * 1, 2, 4, 5, 3
		 * i = 2,
		 * 1, 2, 3, 5, 4
		 * i = 3,
		 * 1, 2, 3, 4, 5
		 */
		for(int i = 0; i < arrs.length; i++) {
			min = i;
			for(int j = i+1; j < arrs.length; j++) { // 안에 포문 횟수 감소, i가 증가하니까
				if(arrs[min] > arrs[j]) {
					min = j;	// 가장 작을 때의 인덱스값을 저장해서 비교를 시작한 위치와 교환
				}
			}
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}
}
