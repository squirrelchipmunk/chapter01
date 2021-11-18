package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		while(true) {
			System.out.println("숫자를 입력하세요");
			num = sc.nextInt();
			if(num==0) { // 0이면 종료	
				System.out.println("종료");
				break;
			}
			if(num%3==0) // 3의 배수이면
				System.out.println("3의 배수입니다.");
			else
				System.out.println("3의 배수가 아닙니다.");

		}


		sc.close();


	}

}
