package Ch08For;

import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
		//n, m
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
		for(int i = n;i<=m;i++) {
			if(i%3 !=0) {
				sum += i;
			}
		}
		System.out.printf("%d\n", sum);
		//구구단
		for(int i = 2;i<=9;i++) {
			for(int j= 1;j<9;j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
		
		sc.close();
	}

}
