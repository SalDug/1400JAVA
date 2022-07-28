package Ch15UpdownCasting;

class Bookstore{
	static int scount = 100; //샤프 재고량
	static int pcount = 100; //연필 재고량
	
	protected void write() {}
}
class sharp extends Bookstore{
	@SuppressWarnings("static-access")
	sharp(){
		super.scount--; //샤프객체 생성시 재고량 감소
	}
	protected void write() {
		System.out.println("샤프");
	}
}
class pencil extends Bookstore{
	@SuppressWarnings("static-access")
	pencil(){
		super.pcount--; //연필객체 생성시 재고량 감소
	}
	protected void write() {
		System.out.println("연필");
	}
}

public class C05BookstoreMain {
	public static Bookstore ReqBS(String thing) {
		if(thing.equals("샤프")) {
			return new sharp();
		}
		else if(thing.equals("연필")) {
			return new pencil();
		}
		else {
			return null;
		}
	}
	public static void ShowInfo() {
		System.out.printf("샤프재고량 : %d 연필 재고량 : %d", Bookstore.scount, Bookstore.pcount);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		sharp ob1 = (sharp)ReqBS("샤프"); //다운캐스팅
		sharp ob2 = (sharp)ReqBS("샤프");
		pencil ob3 = (pencil)ReqBS("연필");
		ob1.write();
		ShowInfo();
	}

}
