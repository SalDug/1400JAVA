package Ch14inheritance;

class Parent{
	int x;
	Parent(){
		System.out.println("parent호출");
	}
	Parent(int x){
		this.x = x;
		System.out.println("parent(x)호출");
	}
}

class Son extends Parent{
	int y;
	Son(){
		super(); //상위클래스의 디폴트생성자 호출
		System.out.println("son호출");
	}
	Son(int x){
		super(x);   //상위 클래스위 Parent(int x) 생성자 호출 - > x멤버의 초기값 설정
		this.y = 0; //하위 클래스 y멤버에 0으로 초기화
		System.out.println("son(x)호출");
	}
	Son(int x, int y){
		super(x);  
		this.y = y;
		System.out.println("son(x, y)호출");
	}
}

public class C02inheritanceMain {

	public static void main(String[] args) {
		//Son ob1 = new Son();
		//Son ob2 = new Son(10);
		//System.out.println(ob2.x + ", " + ob2.y);
		Son ob3 = new Son(10, 20);
		System.out.println(ob3.x + ", " + ob3.y);
	}

}
