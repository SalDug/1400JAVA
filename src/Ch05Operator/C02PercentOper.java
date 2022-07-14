package Ch05Operator;

import java.util.Scanner;

public class C02PercentOper {

	public static void main(String[] args) {
		//%나머지 연산자
		Scanner sc = new Scanner(System.in);
		
		//1 짝홀수 구분
//		System.out.println("확인 : " + (10%2));
//		System.out.println("확인 : " + (11%2));
//		System.out.println("확인 : " + (12%2));
//		System.out.println("확인 : " + (13%2));
//		System.out.println("확인 : " + (14%2));
//		int a = sc.nextInt();
//		String result = (a%2 == 0) ? "짝수" : "홀수";
//		System.out.println(result);
		
		//2 배수구분
		//수1%수2 = 0 -> 수1은 수2의 배수다.
//		System.out.println("확인 : " + (10%3));
//		System.out.println("확인 : " + (11%3));
//		System.out.println("확인 : " + (12%3));
//		System.out.println("확인 : " + (13%3));
//		System.out.println("확인 : " + (14%3));
//		System.out.println("확인 : " + (15%3));
		
		//3 자릿수 확인
//		System.out.println(123456789);
//		System.out.println(123456789 % 10);
//		System.out.println(123456789 % 100);
//		System.out.println(123456789 % 1000);
//		System.out.println(123456789 % 10000);
//		System.out.println(123456789/100000000);
		
		//4 범위 제한
		//N%2 = 0,1
		//N%3 = 0,1,2
		//N&M = 1~M-1
		
		sc.close();
	}

}
