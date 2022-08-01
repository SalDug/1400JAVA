package Ch19Exception;

public class C01NullPointer {

	public static void main(String[] args) {
		
		try {
//		String data = null;
//		System.out.println(data.toString());
		} catch(NullPointerException e) {
			//System.out.println("예외발생");
			System.out.println(e.getCause()); //원인
			System.out.println(e.toString()); //예외객체
			System.out.println(e.getStackTrace()); //
			//e.getStackTrace();
		}
		
		System.out.println("실행되어야할 코드 1");
		System.out.println("실행되어야할 코드 2");
	}

}
