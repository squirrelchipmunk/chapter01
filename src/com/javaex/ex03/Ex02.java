package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수:");
		int score = sc.nextInt();
		if(score>=60) {
			// 점수 60이상일 때
			System.out.println("합격입니다.");
		}
		else {
			// 점수 60미만일 때
			System.out.println("불합격입니다.");
		}

		sc.close();
	}

}
