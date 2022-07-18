package Ch07While;

import java.util.Scanner;

public class C03BreakContinue {
	public static void main(String[] args) {
//		int sum = 0;
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			int a = sc.nextInt();
//			if(a == -1) {
//				break;
//			}
//			else {
//				sum += a;
//			}
//			
//		}
//		System.out.printf("%d", sum);
		int N = sc.nextInt();
		int sum = 0;
		int a = 0;
		for (int i = 1;i<=N;i++) {
			if(i%4 == 0) {
				continue;
			}
			a++;
			sum+=i;
		}
		System.out.printf("합 : %d, 평균 : %.3f", sum, (double)sum/(double)a );
		sc.close();
	}
}
