package Ch09ClassBasic;

//지역변수 : 블록 내 생성, 벗어나면 소멸

class LocalTest{
	int num = 10; 	//맴버변수
	void Func1(){
		System.out.println("num = " + num);	//멤버변수 num
		int num = 100;  //지역변수 num
		num++;
		System.out.println("num = " + num);	//지역변수 num
	}
	void Func2(){
		System.out.println("num = " + num);	//멤버변수 num
		if(num == 10) {
			int num = 55;
			System.out.println("num = " + num); //지역변수 num
		}
	}
	void Func3(){
		System.out.println("전역변수 num = " + num);
		for(int num = 1;num<=10;num++) {
			System.out.println("지역변수 num : " + num);
		}
		System.out.println("전역변수 num = " + num);
	}
}

public class C08LocalVar {

	public static void main(String[] args) {
		
		LocalTest LC = new LocalTest();
		LC.Func1();
		LC.Func2();
		LC.Func3();

	}

}
