package Ch15UpdownCasting;
//멤버메서드 동작방식
//멤버메서드는 최초객체 생성시 정의부분이 클래스 영역(공유 메모리)에 저장된다
//일반 멤버메서드는 객체 1회이상 생성시 클래스 영역에 저장된다(재사용성을 위함)

//Upcasting
//상위클래스의 참조변수 = 하위클래스 객체
//상위 클래스의 참조변수로 하위객체연결하는 형태
//상속관계의 모든 하위객체를 연결할 수 있는 형태
//확장된 하위객체의 멤버에는 접근이 불가능 -> Downcasting 작업 -> 접근

//Downcasting
//하위클래스의 참조변수 = 상위클래스 참조변수(객체)
//일반적으로 업캐스팅 된 상태에서 확장된 멤버에 접근하기 위해서
//해당 자료형으로 강제형변환하는 작업


class animal{
	String kind;
	public void sound() {
		System.out.println("소리");
	}
	
}
class dog extends animal{
	String name;
	public void move() {
		System.out.println("이동");
	}
	public void sound() {
		System.out.println("이동");
	}
}
class cat extends animal{
	String catname;
	public void catmove() {
		System.out.println("고양이동");
	}
	
}


public class C01MethodInfo {
	public static void main(String[] args) {
		System.out.println("---------");
		//animal a1 = new animal();
		//animal a2 = new animal();
		//System.out.println("---------");
		//dog d1 = new dog();
		//dog d2 = new dog();
		System.out.println("---------");
		animal a3 = new dog(); //Upcasting(상위 클래스 참조변수 = 하위객체)
		a3.kind = "포메라니안";
		//a3.name = "뽀삐"; // 업캐스팅된 상태에서는 하위객체의 확장된 멤버에 접근이 불가능
		dog down = (dog)a3; //downcasting : 컴파일 에러 - 자료형 불일치, 문제소지 -> 강제 형변환 필요
		down.name = "뽀삐";
		down.move();
		
		//상위클래스 instanceof 하위클래스 - 상속관계여부 T/F로 확인
		animal a4 = new cat(); //Upcasting
		if(a4 instanceof cat) {
			//cat down2 = (cat)a4;   //정상 downcasting
		}
		else {
			System.out.println("잘못된 다운캐스팅");
		}
		if(a4 instanceof dog) {
			//dog down3 = (dog)a4;   //정상 downcasting
		}
		else {
			System.out.println("잘못된 다운캐스팅");
		}
		
		
		
	}
	

}
