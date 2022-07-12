package Ch04Scanner;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		//System.out : System이 관리하는 출력장치 
		//System.in : System이 관리하는 입력장치로 스트림형성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 : ");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		System.out.println("SUM : " + sum);
		
		sc.close();
	}

}
