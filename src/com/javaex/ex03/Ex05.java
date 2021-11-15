package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간:");
		int hour = sc.nextInt();
		double wage;
		if(hour<=8) {
			wage = hour*10000;
		}
		else {
			wage = 8*10000+(hour-8)*10000*1.5;
		}
		System.out.println("임금은 "+(int)wage+" 원 입니다.");
		
		
		sc.close();
	}

}
