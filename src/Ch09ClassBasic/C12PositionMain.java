package Ch09ClassBasic;

class C12Position{
	
	//속성
	int x;
	int y;
	int z;
	//생성자
	C12Position(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	C12Position(int x){
		this.x = x;
		this.y = 0;
		this.z = 0;
	}
	C12Position(int x, int y){
		this.x = x;
		this.y = y;
		this.z = 0;
	}
	C12Position(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	//기능
	void showInfo() {
		System.out.printf("x=%d y=%d z=%d\n000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", this.x, this.y, this.z);
	}
}



public class C12PositionMain {

	public static void main(String[] args) {
		C12Position ob1 = new C12Position();
		C12Position ob2 = new C12Position(10);
		C12Position ob3 = new C12Position(10, 20);
		C12Position ob4 = new C12Position(10, 20, 30);
		ob1.showInfo();
		ob2.showInfo();
		ob3.showInfo();
		ob4.showInfo();
	}

}
