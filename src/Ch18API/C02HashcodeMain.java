package Ch18API;

class C02simple{

	@Override
	public int hashCode() {
		System.out.println("해시코드 함수 호출");
		return 1;
	}
	
}

public class C02HashcodeMain {

	public static void main(String[] args) {
		C02simple ob = new C02simple();

		System.out.println(ob);
		//System.out.printf("%x", ob.hashCode());
	}

}
