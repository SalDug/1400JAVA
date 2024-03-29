package Ch17Interface;

interface Controller{
	void on();
	void off();
}
interface Search{
	void SearchURL(String url);
}

class TV implements Controller{
	public void on() {
		System.out.println("TV를 켭니다");
	}
	public void off() {
		System.out.println("TV를 끕니다");
	}
		
}
class Radio implements Controller{
	public void on() {
		System.out.println("Radio를 켭니다");
	}
	public void off() {
		System.out.println("Radio를 끕니다");
	}
	
}
class SmartTV extends TV implements Search{

	@Override
	public void SearchURL(String url) {
		System.out.println(url + "로 접속");
	}
}

public class C01InterfaceMain {
	public static void TurnON(Controller remocon) {
		remocon.on();
	}
	public static void TurnOff(Controller remocon) {
		remocon.off();
	}

	public static void main(String[] args) {
//		TV myTV = new TV();
//		Radio myRadio = new Radio();
//		
//		TurnON(myTV);
//		TurnON(myRadio);
		
//		Controller remocon = null;
//		remocon = myTV; //Upcasting
//		remocon.on();
//		remocon.off();
//		remocon = myRadio;
//		remocon.on();
//		remocon.off();
		SmartTV ST = new SmartTV();
		ST.on();
		ST.off();
		ST.SearchURL("www.naver.com");
		
	}

}
