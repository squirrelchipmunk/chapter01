package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		// 자동 형변환
		System.out.println(2+3.4);
		double var01 = 2+3.4;
		System.out.println(var01);
		
		// 자동 형변환
		long var02 = 12345L;
		float var03 = 1.1F;
		
		System.out.println(var02+var03);
		float result=var02+var03;
		System.out.println(result);
		///////////////
		
		// 강제 형변환
		int i= (int)11112.3232322;
		System.out.println(i);

		float f01 = 12.5f;
		int i01 = (int)f01;
		System.out.println(i01);
		
		//강제 형변한 > 확대 형변환
		byte v01 = 10;
		int v02 = (int)v01;
		System.out.println(v01);
		System.out.println(v02);
		
		//강제 형변한 > 축소 형변환
		int v03 = 10;
		byte v04 = (byte)v03;
		System.out.println(v03);
		System.out.println(v04);
	
		//강제 형변한 > 축소 형변환 (비정상)
		int v05 = 34324324;
		byte v06 = (byte)v05;
		System.out.println(v05);
		System.out.println(v06);
		
		//강제 형변환 > 실수 → 정수 : 소수부분 없애기
		double v07 = 53342.5745646546;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 --> 실수 : .0 붙이기
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
	}

}
