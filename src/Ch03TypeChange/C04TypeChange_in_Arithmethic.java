package Ch03TypeChange;

public class C04TypeChange_in_Arithmethic {

	public static void main(String[] args) {
		//정수 연산식(int보다 작은자료형(short, char, byte)포함시)
		//->int로 자동형변환
		
		byte x = 10;
		char y = 30;
		short z = 40;
		
		int result = x+y+z;
		
		System.out.println("result : " + result);
		
		//정수연산식(int 보다 큰 자료형(long) 포함시)
		//->큰 자료형으로 자동 형변환
		
		byte a = 10;
		char b = 20;
		long c = 30;
		
		long result2 = a + b + c;
		System.out.println("result2 : " + result2);
		
		//실수 연산식
		int p = 10;
		float q = 3.3f;
		double r = 5.5;
		double result3 = p+q+r;
		System.out.println("result3 : " + result3);	
		
		
		
		
		
	}

}
