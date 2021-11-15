package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println("산술연산자");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);   // 3.5 or 몫 3 나머지 1
		System.out.println(a % b);  // 나머지 연산자
		
		//산술연산자 / % 자세히
		System.out.println("산술연산자 자세히");
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0);

		//부호연산자
		System.out.println("부호연산자");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		System.out.println(pVar);
		System.out.println(mVar);
		
		// 증감연산자
		System.out.println("증감연산자");
		System.out.println(a); 		// 7
		System.out.println(++a); 	// a를 1올린다, a를 출력한다
		System.out.println(a); 		// 7
		
		System.out.println(b);
		System.out.println(--b); 	// b를 1내린다. b를 출력한다
		System.out.println(b); 		// 1
		
		
		System.out.println(a);		//8
		System.out.println(a++);	//a 출력. a를 1올린다
		System.out.println(a);		//9
		
		System.out.println(b); 		// 1
		System.out.println(b--); 	// b를 출력한다. b를 1내린다
		System.out.println(b); 		// 0
		
	}

}
