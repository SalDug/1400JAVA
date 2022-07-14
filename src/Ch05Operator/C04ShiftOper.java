package Ch05Operator;

public class C04ShiftOper {
	public static void main(String[] args) {
		
		int num1 = 15;          //00000000 00000000 00000000 00001111 - 4바이트 공간에서
		int num2 = 20;          //00000000 00000000 00000000 00010100
		int num3 = num1<<2;     //00000000 00000000 00000000 00111100 - 왼쪽으로 2만큼 밈 -> 2^2 만큼 곱해짐
		int num4 = num2>>2;     //00000000 00000000 00000000 00000101 - 오른쪽으로 2만큼 밈 -> 2^-2만큼 곱해짐
		
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
	}
}
