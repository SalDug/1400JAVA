package Ch10ClassBasic;

//한정자
//public : 모든 클래스에서 접근가능
//protected : 동일 패키지에 속한 클래스 or 상속과게에서 하위클래스만 접근가능
//default : 동일 패키지에 속한 클래스에서만 사용가능(기본 한정자)
//private : 현재 클래스에서만 접근가능

class C01person{
	
	public String name;
	private int age;
	private float weight;
	private double height;
	
	//생성자
	public C01person(String name, int age, float weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	
	//Getter(가져오기) and Setter(저장하기)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "C01person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
	}
	
	//toString() 재정의
	
		
}


public class C01InfoHide {

	public static void main(String[] args) {
//		C01person kim = new C01person();
//		kim.name = "김상중";
//		kim.setAge(11);
//		System.out.println(kim.getAge());
		
		C01person tmp = new C01person("홍길동", 55, 56.8f, 177.5);
		System.out.println(tmp.toString());
		
		
	}

}
