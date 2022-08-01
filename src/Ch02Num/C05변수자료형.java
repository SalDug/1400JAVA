package Ch02Num;

public class C05변수자료형 {

	public static void main(String[] args) {
		
		int num1; //4byte정수공간형성, 이름 부여
		num1 = 10; //= 대입연산자(공간 = 값), 값부터 먼저 처리
				   //10이라는 상수값을 특정공간에 먼저 저장한뒤 변수공간에 대입
		int num2 = 4; //4리터럴을 먼저 저장한뒤 정수공간인 변수공간 초기값으로 대입
		int num3 = num1+num2; //num1 값과 num2 값의 합을 num3 공간에 초기화
		System.out.println(num3); //num3값을 콘솔창에 출력
		
	}

}
