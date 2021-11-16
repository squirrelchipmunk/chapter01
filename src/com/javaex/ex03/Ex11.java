package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 선택하세요");
		int month = sc.nextInt();
		switch(month){
			case 1 :
			case 3 :
			case 5 :
			case 7 :
			case 8 :
			case 10 :
			case 12 :
				System.out.println("31일 입니다");
				break;
			case 4: 
			case 6:
			case 9:
			case 11:
				System.out.println("30일 입니다.");
				break;
			case 2 :
				System.out.println("28일 입니다.");
				break;
			default :
				System.out.println("1~12사이의 정수로 입력해주세요.");
		}

		sc.close();
	}

}
