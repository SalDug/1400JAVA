package Ch09ClassBasic;

public class C02Car {
	String owner;
	int speed;
	int fuel;
	void Accel() {
		System.out.println(owner + "님의 차가 가속합니다.");
		speed += 10;
	}
	void Break() {
		
		if(speed>=10) {
			System.out.println(owner + "님의 차가 감속합니다.");
			speed -= 10;
		}
		else if (speed > 0) {
			System.out.println(owner + "님의 차가 감속합니다.");
			speed = 0;
		}
		else {
			System.out.println(owner + "님의 차가 더 감속할 수 없습니다.");
		}
	}
	void showInfo() {
		System.out.printf("%s %d %d\n", owner, speed, fuel);
	}
}
