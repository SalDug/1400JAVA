package Ch16AbstractMain;

//일반 클래스 상속관계
class par1{
	
	void func() {} //일반 메서드
}
class son1 extends par1{
	
	void func() {
		System.out.println("Son1 재정의 함수");
	}
}
//추상 클래스 상속관계
abstract class par2{
	abstract void func(); //추상메서드 {}생략
}
class son2 extends par2{
	//강제 재정의된 메서드
	void func() {
		System.out.println("Son2 재정의 함수");
	}
}

public class C01Main {

	public static void main(String[] args) {
		//일반 클래스
		par1 ob1 = new par1();	//상위클래스로 객체 생성가능
		son1 ob2 = new son1();  //하위클래스로 객체 생성가능
		ob1 = ob2;		        //Upcasting
		ob1.func();				//재정의된 함수 접근가능	
		//추상 클래스
		//par2 ob3 = new par2();	//상위클래스로 객체 불가능(추상메서드 포함하기 때문)
		par2 ob3 = null;
		son2 ob4 = new son2();  //하위클래스로 객체 생성가능(추상메서드 강제 재정의해야 가능)
		ob3 = ob4;		        //Upcasting
		ob3.func();				//재정의된 함수 접근가능	
		
	}

}
