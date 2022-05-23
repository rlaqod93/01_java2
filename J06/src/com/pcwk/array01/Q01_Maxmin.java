package com.pcwk.array01;

public class Q01_Maxmin {

	public static void main(String[] args) {
//		Q2. 최대값과 최소값 구하기.
//		배열의 요소중 제일 큰 값과 제일 작은 값을 찾는다.
//		int[] score = {79,88,91,33,100,55,95}
//		1. 최대값 변수 , 최소값 변수 잡기
//		2. 배열요소를 1개씩 비교해 최대 값을 찾는다.
//		   배열이 최대 값보다 더크면 max=비교한 배열을 할당

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];// 최대 값
		int min = score[0];// 최소 값

		for (int i = 1; i < score.length; i++) {
			// 최대갑
			if (max < score[i]) {
				max = score[i];
			}

			// 최소값
			if (min > score[i]) {
				min = score[i];
			}

		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);

	}
}