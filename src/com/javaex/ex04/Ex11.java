package com.javaex.ex04;

public class Ex11 {

	public static void main(String[] args) {
		//1~20 정수 중 2의 배수 출력 x 3의 배수 출력 x
		for(int i=1;i<=20;i++) {
			if(i % 2 == 0 || i % 3 == 0) { 		// 2의 배수이거나 3의 배수
				continue;	// 다음 반복으로
			}
			System.out.println(i);
		}
		System.out.println();System.out.println();
		
		for(int i=1;i<=20;i++) {
			if(i % 2 == 0 || i % 3 == 0) { 		// 2의 배수이거나 3의 배수
				// 아무것도 안 한다
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println();System.out.println();
		
		
		for(int i=1;i<=20;i++) {
			if( !(i % 2 == 0 || i % 3 == 0)) { 		// 2의 배수 아니고 3의 배수 아니면
				System.out.println(i);
			}
			
		}
		
	}

}
