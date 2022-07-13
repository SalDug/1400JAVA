package Ch04Scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println("확인 :" + num);
		System.out.print("문자열 : ");
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("확인 :" + str);
	
		
		//nextline() 쓸 때의 주의점
		//nextline만 사용하는 것이 아닌 다른 next()류 함수와 혼용해서 사용하는 경우
		//중간에 nextline()한번더 실행해서 버퍼공간의 개행문자를 처리한다.
		
		sc.close();
	}
}
