package Ch09ClassBasic;
class C04Person{
	//속성
	String name;
	int age;
	float height;
	double weight;
	//기능(함수, 메서드)
	void talk() {
		System.out.println(name + "님이 말합니다.");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다.");
	}
	void showInfo() {
		System.out.printf("%s %d %f %f\n", name, age, height, weight);
	}
}


public class C04Personmain {
	public static void main(String[] args) {
		C04Person hong = new C04Person();
		hong.name = "홍길동"; hong.age  = 55; hong.height = 177.6f; hong.weight = 66.6;
		hong.talk();
		hong.walk();
		hong.showInfo();
		
		
	}
	
	
}
