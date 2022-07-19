package Ch09ClassBasic;

public class C02Main {

	public static void main(String[] args) {
		C02Car MyCar = new C02Car();
		MyCar.owner = "홍길동";
		MyCar.speed = 0;
		MyCar.fuel = 100;
		MyCar.Break();
		MyCar.Accel();
		MyCar.Accel();
		MyCar.showInfo();

	}

}
