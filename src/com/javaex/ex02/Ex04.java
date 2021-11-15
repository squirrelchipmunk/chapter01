package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요\n이름:");
		String name = sc.nextLine();
		System.out.print("나이를 입력해주세요\n나이:");
		int age = sc.nextInt();
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 입니다.");
		
		sc.close();
		
	}
}