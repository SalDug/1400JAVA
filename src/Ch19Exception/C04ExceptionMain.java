package Ch19Exception;

public class C04ExceptionMain {
	public static void main(String[] args) {
		
		try {
		//String data = null;
		//System.out.println(data.toString());
		System.out.println(10/0);
		
		int [] arr = new int[3];
		arr[3] = 1; 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외처리와 무관하게 실행되는 코드");
		}
		
		
		System.out.println("실행코드1");
		
	}
}
