package Ch17Interface;

interface Tire{
//	void FL();
//	void FR();
//	void BL();
//	void BR();
	void run();
}
class KumhoTire implements Tire{

	@Override
	public void run() {
		System.out.println("금호작동");
	}
	
} 
class HankookTire implements Tire{

	@Override
	public void run() {
		System.out.println("한국작동");
	}
	
} 
class car{
	Tire FR;
	Tire FL;
	Tire BR;
	Tire BL;
	car(){
		FR = new KumhoTire();
		FL = new KumhoTire();
		BR = new KumhoTire();
		BL = new KumhoTire();
	}
	void carstart() {
		FR.run();
		FL.run();
		BR.run(); 
		BL.run();  
	}
}

public class C02InterfaceMain {

	public static void main(String[] args) {
		car mycar = new car();

		
		mycar.FL = new HankookTire();
		mycar.BL = new HankookTire();
		mycar.carstart();
	}

}
