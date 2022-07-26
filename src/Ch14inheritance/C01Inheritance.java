package Ch14inheritance;

class test{
	test(){
		System.out.println("T생성자호출");
	}
}

class point2D extends test{
	
	public int x;
	public int y;
	point2D(){
		System.out.println("2생성자호출");
	}
	public void ShowXY() {
		System.out.println("X : " + x + " Y : " + y);
	}
	
}

class point3D extends point2D // point2D를 상속받는 하위클래스
{
	public int z;
	point3D(){
		System.out.println("3생성자호출");
	}
	
	public void ShowXYZ(){
		ShowXY();
		System.out.println("Z : " + z);
	}
}





public class C01Inheritance {

	public static void main(String[] args) {
		point3D ob = new point3D();
		ob.x = 1;
		ob.y = 2;
		ob.z = 3;
		ob.ShowXYZ();
	}

}
