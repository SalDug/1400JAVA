package Ch04Scanner;

import java.util.Scanner;

public class a13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 수 : ");
		String strNum1=next();

		System.out.print("두번째 수 : ");
		String strNum2=next();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		
		scanner.close();

	}

	private static String next() {
		// TODO Auto-generated method stub
		return null;
	}

}
