package Ch13Static;

//메모리 영역 비교
//스택 영역 : 블럭 내의 지역변수 공간 생성, 블럭 내에서 벗어나면 공간 소멸
//힙 영역 : 객체 저장공간, new 예약어 사용시 공간 형성, 참조변수 연결해제시 JVM의 GC에 의해서 소멸
//클래스 영역 : 공유 메모리 영역, static변수, 일반 메서드, static메서드, 생성자 - 프로그램 시작과 동시에 형성, 종료시 소멸


class C01Simple{
	static int num1 = 0;
	int num2;
	@Override
	public String toString() {
		return "C01Simple [num1 = " + num1 + " num2=" + num2 + "]";
	}
	
	
}

public class C01StaticMain {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//static에 접근하기 위해서 클래스.static 멤버
		C01Simple.num1 = 1010;
		
		
		C01Simple ob1 = new C01Simple();
		C01Simple ob2 = new C01Simple();
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		ob1.num1 = 10;
		ob1.num2 = 20;
		System.out.println(ob2.toString());
		ob2.num1 = 100;
		ob2.num2 = 200;
		System.out.println(ob1.toString());

	}

}
