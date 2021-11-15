package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간:");
		int hour = sc.nextInt();
		int wage;
		if(hour<=8) {
			wage = hour*10000;
		}
		else {
			wage = 8*10000+(hour-8)*12000;
		}
		System.out.println("임금은 "+wage+" 원 입니다.");
		

		sc.close();
	}

}
