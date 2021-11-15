package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		/* 1.0 : 정수 나누기는 정수. 5/4=1를 실수로 변환해서 1.0 */
		double v01 = 5/4;
		System.out.println(v01); 
		
		
		/* 1.25 : 실수가 하나라도 포함되면 실수 계산 */
		double v02 = (double)5 / 4 ; 
		System.out.println(v02); 
		
		double v03 = 5 / (double)4 ; 
		System.out.println(v03); 
		
		double v04 = (double)5 / (double)4 ; 
		System.out.println(v04); 
		
		/* 2 : int(1.3)=1 + int(1.8)=1 */
		int v05 = (int)1.3 + (int)1.8 ; 
		System.out.println(v05); 
		
		/* 3 : int(1.3+1.8=3.1)=3 */
		int v06 = (int)(1.3 +1.8); 
		System.out.println(v06);
		
		
	}

}
