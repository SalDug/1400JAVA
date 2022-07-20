package Ch09ClassBasic;

//생성자
//생성자는 클래스명과 동일하며 반환자료형은 생략한다.
//객체 생성에 필요한 초기값을 지정하는데 필요한 메서드
//객체 생성시 한번만호출되고 객체 생성 이후에는 사용이 불가능하다.
//클래스내에세 생성자 메서드를 명시하지 않았을때 기본적으로 주입되는
//생성자가 있다. 이를 디폴트 생성자라 한다.
//디폴트 생성자는 클래스명과 동일하며, 매개변수를 가지지 않는다

class C09Car{
	String owner;
	int speed;
	int fuel;
	//디폴트생성자
	C09Car(){
		owner = "소유자없음";
		speed = 10;
		fuel = 10;
	}
}

public class C09CarMain {

	public static void main(String[] args) {
		C09Car car = new C09Car();
		System.out.printf("%s %d %d\n", car.owner, car.speed, car.fuel);
		

	}

}
