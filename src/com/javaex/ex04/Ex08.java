package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		int i=1; // 비교할 정수 초기값

		while(true) {
			if(i%6==0 && i%14==0) {
				// 6의 배수이면서 14의 배수
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
