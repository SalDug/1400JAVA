package Ch20Generic;

class simple<T,S>{
	T x;
	S y;
}


public class C02Generic {

	public static void main(String[] args) {
		simple<String, String> ob1 = new simple<String, String>();
		ob1.x = "문자열1";
		ob1.y = "문자열2";
		
		simple<Integer, Double> ob2 = new simple<Integer, Double>();
		ob2.x = 10;
		ob2.y = 10.5;

	}

}
