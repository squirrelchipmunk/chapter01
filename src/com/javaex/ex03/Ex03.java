package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자:");
		int no = sc.nextInt();
		if(no>0) {
			//입력한 숫자가 0보다 클 때  
			System.out.println("양수입니다.");
		}
		else if(no<0){
			//입력한 숫자가 0보다 작을 때  
			System.out.println("음수입니다.");
		}
		else{
			// 그 외에는 0
			System.out.println("0 입니다.");
		}

		sc.close();
	}
}
