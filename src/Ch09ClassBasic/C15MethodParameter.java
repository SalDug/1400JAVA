package Ch09ClassBasic;

class simple{
	
	int x;
	int y;
	
}
class test{
	
	void setsimplexy(simple ob, int x, int y) {
		ob.x = x;
		ob.y = y;
	}
	
}

public class C15MethodParameter {

	public static void main(String[] args) {
			test tmp = new test();
			simple ob1 = new simple();
			
			tmp.setsimplexy(ob1, 100, 200);
			System.out.printf("ob1.x = %d, ob1.y = %d\n", ob1.x, ob1.y);

	}

}
