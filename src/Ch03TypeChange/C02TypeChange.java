package Ch03TypeChange;

public class C02TypeChange {
	public static void main(String[] args) {
		//강제 형변환
		int intval = '가';
		char charval = (char)intval;
		System.out.println(charval);
		
		long longval = 1000;
		intval = (int)longval;
		System.out.println(intval);
		
		double doubleval  = 3.14;
		intval = (int)doubleval; //데이터손실
		System.out.println(intval);
		
		
		
	}
}
