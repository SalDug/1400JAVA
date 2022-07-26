package Ch14inheritance;

//오버라이딩
//상속관계를 전제로 하여 상위 클래스의 메서드를 하위 클래스에서 고쳐 사용하는 문법
//메서드의 헤더부분은 그대로 두고 메서드의 본체를 수정한다.

//vs 오버로딩
//단일 클래스 내에서(상속관계여도 됨) 메서드명을 그대로, 파라미터를 다양하게 허용하는 문법

class animal{ 
	public void sound() {
		System.out.println("갈");
	}
}
class dog extends animal{
	public void sound() {
		System.out.println("멍");
	}
}

class cat extends animal{
	public void sound() {
		System.out.println("냥");
	}
}


public class C04Overriding {

	public static void main(String[] args) {
		dog doggy = new dog();
		cat catty = new cat();
		doggy.sound();
		catty.sound();
	}

}
