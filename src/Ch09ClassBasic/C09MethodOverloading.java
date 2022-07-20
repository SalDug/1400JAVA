package Ch09ClassBasic;

class Calc{
	int sum(int x, int y) {
		System.out.println("Sum(x+y) 호출!");
		return (x+y);
	}
	int sum(int x, int y, int z) {
		System.out.println("Sum(x+y+z) 호출!");
		return (x+y+z);
	}
	
	
}


public class C09MethodOverloading {

	public static void main(String[] args) {
		Calc obj = new Calc();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(10, 20, 30));
	}

}
