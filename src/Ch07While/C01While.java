package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

		
		//기본
		//탈출용 변수 지정
		//탈출용 조건식
		//조건식이 false가 되도록하는 연산식
		
//		int i=1;
//		while(i<=10) {
//			System.out.println("Hello world!");
//			i++;
//		}
//		int i = 1, sum = 0;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
		Scanner sc = new Scanner(System.in);
		System.out.print("N : ");
		int N = sc.nextInt();
		System.out.println(N*(N+1)/2);
		
		int n, m;
		System.out.print("n : ");
		n = sc.nextInt();
		System.out.print("m : ");
		m = sc.nextInt();
		System.out.println(((m*(m+1))/2)-((n*(n-1))/2));
		
		sc.close();
		
	}

}
