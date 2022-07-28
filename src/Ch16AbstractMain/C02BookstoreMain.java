package Ch16AbstractMain;

//추상클래스
//추상메서드를 하나이상 포함하고 있는 클래스
//추상클래스 자체로 객체 생성이 불가능하다(추상메서드 때문)
//상속 관계의 하위클래스는 미완성된 함수(추상메서드)를 반드시 재정의해야지만 객체생성이 가능하다
//일반적으로 추상클래스는 참조변수로써 Upcasting용으로 사용된다

//추상 클래스 사용이유
//1 규격의 동일성
//2 기획되지 않은 로직은 후 순위로 미뤄서 처리




abstract class Bookstore{
	static int scount = 100; //샤프 재고량
	static int pcount = 100; //연필 재고량
	
	abstract protected void write();
}
class sharp extends Bookstore{
	@SuppressWarnings("static-access")
	sharp(){
		super.scount--; //샤프객체 생성시 재고량 감소
	}
	//강제 재정의
	protected void write() {
		System.out.println("샤프");
	}
}
class pencil extends Bookstore{
	@SuppressWarnings("static-access")
	pencil(){
		super.pcount--; //연필객체 생성시 재고량 감소
	}
	//강제 재정의
	protected void write() {
		System.out.println("연필");
	}
}

public class C02BookstoreMain {
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
