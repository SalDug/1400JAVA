package Ch04Scanner;

import java.util.Scanner;

//import 단축키
//모든 임폴트 경로 설정 : ctrl shift o
//모든 임폴트 경로 설정 : ctrl shift m
public class C02Scanner {

	public static void main(String[] args) {
		//국어, 영어, 수학 점수를 입력받아 총점, 평균 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int Korean = sc.nextInt();
		System.out.print("영어점수 : ");
		int English = sc.nextInt();
		System.out.print("수학점수 : ");
		int Math = sc.nextInt();
		int sum =  Korean+English+Math;
		double average = (double)sum/3;
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %.2f\n", average);
		
		sc.close();
		
	}

}
