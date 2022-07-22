package Ch10ClassBasic;

//this : 만들어진 객체의 위치값
//this.멤버변수 : 멤버변수와 매개변수명이 동일할 경우에 구별할 수 있다. 
//this() : 다른 생성자 호출 가능

class C06Simple {
	int x;
	int y;
	int z;
	
	C06Simple(){
//		x = 10;
//		y = 10;
//		z = 10;
		this(10, 10, 10);
	}
	C06Simple(int x){
//		this.x = x;
//		y = 10;
//		z = 10;
		this(x, 10, 10);
	}
	C06Simple(int x, int y){
//		this.x = x;
//		this.y = y;
//		z = 10;
		this(x, y, 10);
	}
	C06Simple(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;

	}
	
}

//class TestThis{
//	
//	TestThis getThis() {
//		return this;
//	}
//	
//}

public class C06This {

	public static void main(String[] args) {

		//1. this 확인
//		TestThis ob1 = new TestThis();
//		System.out.println("ob1 = "+ob1);
//		System.out.println("ob1 = "+ob1.getThis());
		
		//2. this 확인
//		C06Simple ob1 = new C06Simple();
//		C06Simple ob2 = new C06Simple(100);
//		C06Simple ob3 = new C06Simple(100, 200);
//		C06Simple ob4 = new C06Simple(100, 200, 300);
		
	}

}
