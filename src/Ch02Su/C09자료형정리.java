package Ch02Su;

public class C09자료형정리 {

	public static void main(String[] args) {
		
		//--------------------
		//1.정수
		//--------------------
		//int : 4byte 정수(음수 O)
		//어떤 진수던 간에 2진수로 저장된다
		int var1 = 0b1111; //2
		int var2 = 0206;   //8
		int var3 = 345;	   //10
		int var4 = 0x83;   //16
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		
		//byte : 1byte 정수(음수 O)
		//byte var5 = 127; 
		//byte var6 = 128;
		//byte var7 = -129;
		//System.out.println("var7 : " + var7);
		
		//short : 2byte 정수(음수지원 O)
		//char : 2byte 정수(음수지원 X, 1문자 저장용도)
		
		//short : -32768 ~ 32767
		//char : 0 ~ 65535
		
		char ndata1 = 60000;
		short ndata2 = (short)ndata1;
		
		//long : 8byte 정수(음수지원 O)
		//리터럴 접미사 : l, L
		
		//--------------------
		//2.실수
		//--------------------
		//double : 8byte 실수. default자료형
		//소수점 유효범위 약 14-18
		
		//float : 4byte 실수 
		//소수점 유효범위 약 6
		//리터럴 접미사 : f, F
		
		
		//지수형 표현
		double num1 = 3e6;
		System.out.println(num1);
		double num2 = 3e-2;
		System.out.println(num2);
			
		//--------------------
		//3.단일문자
		//--------------------
		char c1 = 'a';
		char c2 = 'b';
		System.out.printf("%d %c\n", (int)c1, c2);
		
		//--------------------
		//4.문자열(클래스 자료형 String)		
		//--------------------
		//클래스 자료형으로 만든 변수 : 참조변수
		//Data의 위치값을 저장
		//Data의 처리는 위치값을 이용해서 해당위치로 접근하여 확인 변경 처리
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name + "," + job);
		
		//--------------------
		//5.boolean형(T/F)		
		//--------------------
		boolean flag1 = true;
		boolean flag2 = false;
		
	}

}
