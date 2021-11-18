package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i % 2 == 0 && i % 3 == 0) { 		// 2의 배수이면서 3의 배수
				//break;    // --> 반복문 종료
				continue;	// 다음 반복으로
			}
			System.out.println(i);
		} // for문의 끝


	}

}
