package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		if(score%3==0) {
			System.out.println(score+"은(는) 3의 배수 입니다.");
		}
		else {
			System.out.println(score+"은(는) 3의 배수가 아닙니다.");
		}
		
		
		
		sc.close();
	}

}
