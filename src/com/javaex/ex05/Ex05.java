package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {

		int[] arrA = new int[3];

		arrA[0]=3;
		arrA[1]=6;
		arrA[2]=9;


		int[] arrB = new int[3];


		/*
		arrB[0] = arrA[0];
		arrB[1] = arrA[1];
		arrB[2] = arrA[2];
		 */
		for(int i=0;i<arrB.length;i++) {
			arrB[i]=arrA[i];
		}

		arrB[1] = 100;

		for(int i=0;i<arrA.length;i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("------------------");

		for(int i=0;i<arrB.length;i++) {
			System.out.println(arrB[i]);
		}



	}

}
