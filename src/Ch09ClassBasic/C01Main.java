package Ch09ClassBasic;

public class C01Main {

	public static void main(String[] args) {
		C01Person ham = new C01Person();
		ham.name = "함형민";
		ham.age = 02;
		ham.height = 173.5f;
		ham.weight = 64.5;
		System.out.printf("%s %d %f %f\n", ham.name,ham.age,ham.height,ham.weight);
	}

}
