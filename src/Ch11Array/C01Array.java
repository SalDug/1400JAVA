package Ch11Array;

public class C01Array {

	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		double arr2[] = new double[7];
		
		float arr3[];
		arr3 = new float[6];
		
		System.out.println("arr1 length = " + arr1.length);
		System.out.println("arr2 length = " + arr2.length);
		System.out.println("arr3 length = " + arr3.length);
		for(int i = 0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//개량 for문
		for(int i:arr1) {
			System.out.println(i);
		}

	}

}
