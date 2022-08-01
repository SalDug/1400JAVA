package Ch18API;

public class C05WrapperMain {

	public static void main(String[] args) {
		
		//Boxing
		Integer ob1 = new Integer(100);
		Integer ob2 = new Integer("200");
		Integer ob3 = Integer.valueOf("300");
		
	
		
		//unBoxing
		int val1 = ob1.intValue();
		int val2 = ob2.intValue();
		int val3 = ob3.intValue();
		
		System.out.printf("%d %d %d\n", val1, val2, val3);
	}

}
