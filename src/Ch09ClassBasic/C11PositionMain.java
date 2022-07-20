package Ch09ClassBasic;

class Position{
	int xpos;
	int ypos;
	void setpos(int a) {
		this.xpos = a;
		this.ypos = 0;
	}
	void setpos(int a, int b) {
		this.xpos = a;
		this.ypos = b;
	}
	void showInfo(){
		System.out.printf("%d %d\n", this.xpos, this.ypos);
	}
	Position(){
		xpos = 100;
		ypos = 100;
	}
	
}

public class C11PositionMain {

	public static void main(String[] args) {
		Position obj = new Position();
		obj.setpos(10);
		obj.setpos(10, 20);
	}

}
