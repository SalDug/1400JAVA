package Ch09ClassBasic;

public class C02Main {

	public static void main(String[] args) {
		C02Car MyCar = new C02Car();
		MyCar.owner = "홍길동";
		MyCar.speed = 0;
		MyCar.fuel = 100;
		System.out.printf("%s %d %d\n", MyCar.owner, MyCar.speed, MyCar.fuel);

	}

}
