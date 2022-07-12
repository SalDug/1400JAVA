package Ch04Scanner;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		//System.out : APP에서 표준 출력장치 방향으로 스트림 형성
		//System.in : 표준 입력장치에서 APP방향으로 스트림 형성
		
		//new Scanner(System.in)
		//->표준 입력 스트림을 Scanner 객체에 연결
		//->Scanner 객체는 다양한 형태의 값을 스트림으로부터 받아올 수 있는 기능을 가지는 단위
		
		//Scanner sc = new Scanner(System.in)
		//->생성된 스캐너 객체의 위치값을 sc참조변수에 담아 제어함
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		//sc스캐너 객체의 정수값하나를 받아 num1공간에 초기화
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 : ");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		System.out.println("SUM : " + sum);
		
		sc.close();
	}

}
