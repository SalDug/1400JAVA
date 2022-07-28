package Ch15UpdownCasting;

class C04Animal{
	public void sound() {
		System.out.println("소리");
	}
}
class C04Dog extends C04Animal{
	public void sound(){
		System.out.println("멍");
	}
	public void move() {
		System.out.println("이동");
	}
} 



public class C04UpdownCastingMain {

	public static void main(String[] args) {
		C04Animal ob = new C04Animal();
		C04Animal ani = new C04Dog(); //업캐스팅
		ani.sound();
		ob.sound();
		C04Dog down = (C04Dog)ani; //다운캐스팅
		down.move();

	}

}
