package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) {
		//반복문 연습
		int tail = 0;// 증가하는 값
		int i=0;	// 반복횟수 제어
		while(i<5) { // 조건식
			//System.out.println("i like Java"+i);  --> 결과는 같지만 경우에 따라 복잡해짐
			System.out.println("i like Java"+tail);
			i++;
			tail++;
		}
	}

}
