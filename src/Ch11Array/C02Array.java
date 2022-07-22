package Ch11Array;

import java.util.Scanner;

class C02Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int arr[] = new int[len];
		for(int i = 0;i<len;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i:arr) {
			sum += i;
		}
		System.out.printf("합 : %d 평균 : %.2f\n", sum, (double)sum/len);
		sort(arr);
		
//		for(int i:arr) {
//			System.out.println(i);
//			
//		}
//		int max = -2147483648;
//		int min = 2147483647;

		
//		for(int i:arr) {
//			if(i>max) {
//				max = i;
//			}
//			if(i<min) {
//				min = i;
//			}
//		}
		System.out.printf("최대 : %d, 최소 : %d\n", arr[0], arr[4]);
		
		sc.close();
	}
	
	public static void sort(int[] ar) {
		for(int i = 0;i<ar.length-1;i++) {
			for(int j = i+1;j<ar.length;j++) {
				if(ar[i] > ar[j]) {
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		
		
		
	}
	
	

}
