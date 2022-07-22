package Ch11Array;

import java.util.Scanner;

public class C04Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 : ");
		int y = sc.nextInt();
		System.out.print("열 : ");
		int x = sc.nextInt();
		int [][] arr = new int[y][x];
		
		for(int i = 0;i<y;i++){
			for(int j = 0;j<x;j++) {
				System.out.printf("[%d][%d]항 값 : ", i, j);
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0;i<y;i++) {
			int sum = 0;
			for(int j = 0;j<x;j++) {
				sum += arr[i][j];
			}	
			System.out.printf("%d행의 합 : %d\n", i, sum);
			
		}
	
		for(int i = 0;i<x;i++) {
			int sum = 0;
			for(int j = 0;j<y;j++) {
				sum += arr[j][i];
			}	
			System.out.printf("%d열의 합 : %d\n", i, sum);
		}
		int sum = 0;
		for(int i = 0;i<y;i++) {
			for(int j = 0;j<x;j++) {
				sum += arr[i][j];
			}	
		}
		System.out.printf("전체 합 : %d\n", sum);
		
		sc.close();
	}
	//112
}
