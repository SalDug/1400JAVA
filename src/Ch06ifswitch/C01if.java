package Ch06ifswitch;

import java.util.Scanner;

public class C01if {

	public static void main(String[] args) {
		//단순 if문
		//if(조건식){
		//	참인 경우 실행하는 코드
		//}
		
//		int age = 7;
//		if (age >= 8){
//			System.out.println("취학 아동입니다.");
//		}
//		System.out.println("if문 탈출1");
//		if (age < 8){
//			System.out.println("미취학 아동입니다.");
//		}
//		System.out.println("if문 탈출2");
//		System.out.println("종료");
//      if else 문
//      if(조건식){
		//	참인 경우 실행하는 코드
		//}
//	     else {
//		 거짓인 경우 실행되는 코드
//	     }
				
//		int age = 7;
//		if (age >= 8){
//			System.out.println("취학 아동입니다.");
//		}
//		else {
//			System.out.println("미취학 아동입니다.");
//		}
//		System.out.println("종료");
		
//		int a = sc.nextInt();
//		if(a%2 ==0 ) {
//			System.out.println("짝수입니다");
//		}
//		else {
//			System.out.println("홀수입니다");
//		}
//		Scanner sc  = new Scanner(System.in);
//		int b = sc.nextInt();
//		if(b%3 ==0 && b%4 == 0) {
//			System.out.println("3, 4의 배수입니다.");
//		}
//		else if (b%3 == 0 && b%5 != 0) {
//			System.out.println("3의 배수이지만 5의배수는 아닙니다.");
//		}
//		sc.close();
//		int c = sc.nextInt();
//		int d = sc.nextInt();
//		if(c>d) {
//			System.out.println(c);
//		}
//		else {
//			System.out.println(d);
//		}
//		int e = sc.nextInt();
//		int f = sc.nextInt();
//		int g = sc.nextInt();
		
		//int sol = (((e > f) ? e : f) > g ? ((e > f) ? e : f) : g );
		//System.out.println(sol);
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		if(kor >= 40) {
			if(eng >= 40) {
				if(math >= 40) {
					if(kor + eng + math >= 180) {
						System.out.println("합격");
					}
					else {
						System.out.println("불합격");
					}	
				}
				else {
					System.out.println("불합격");
				}	
			}
			else {
				System.out.println("불합격");
			}	
		}
		else {
			System.out.println("불합격");
		}	
//		int a, b, c;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
		
		
		
		sc.close();
		
		
	}

}
