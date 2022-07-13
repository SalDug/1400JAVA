package Ch05Operator;

public class C01Basic {

	public static void main(String[] args) {
		//산술 연산자
//		int a = 10, b =20, c;
//		System.out.println("a+b = " + (a+b));
//		System.out.println("a-b = " + (a-b));
//		System.out.println("a*b = " + (a*b));
//		System.out.println("a/b = " + (a/b));  //몫
//		System.out.println("a%b = " + (a%b));  //나머지
//											   //1)짝홀수 2)배수 3)끝자리 4)수 범위 제한
//		System.out.println("-a = " + (-a));    //a = -a와 혼동주의!
//		
		//복합 대입연산자
		// += -= *= /= %=
//		int a = 10;
//		a += 10;
//		System.out.println("a = " + a);
//		a -= 5;
//		System.out.println("a = " + a);
//		a *= 7;
//		System.out.println("a = " + a);
//		a /= 7;
//		System.out.println("a = " + a);
		
		//비교연산자
		// > >= == <= < !=
//		int a = 10, b = 20;
//		System.out.println("a == b ? " + (a==b));
//		System.out.println("a >= b ? " + (a>=b));
//		System.out.println("a > b ? " + (a>b));
//		System.out.println("a =< b ? " + (a<=b));
//		System.out.println("a < b ? " + (a<b));
//		System.out.println("a != b ? " + (a!=b));
		
		//논리연산자
		//and(&&) : 둘 다 참일시에만 참
		//or(||) : 둘 다 거짓일시에만 거짓
		//! : 부정연산자 : True -> False, False -> True
//		System.out.println("True && True ? " + (true && true));
//		System.out.println("True && False ? " + (true && false));
//		System.out.println("False && True ? " + (false && true));
//		System.out.println("False && False ? " + (false && false));
		
		
//		int a = 10, b = 20, c = 15;
//		System.out.println("True && True ? " + (a>=b && a>=c)); 
//		System.out.println("True && False ? " + (b>=c && b>=a));
//		System.out.println("False && True ? " + (false && true));
//		System.out.println("False && False ? " + (false && false));
		
//		
//		System.out.println("True || True ? " + (true || true));
//		System.out.println("True || False ? " + (true || false));
//		System.out.println("False || True ? " + (false || true));
//		System.out.println("False || False ? " + (false || false));
		
//		boolean flag = true;
//		System.out.println(!flag);
		
		//증감연산자(++, --)
		//전치연산자 : ++a, --a  변수값을 증감후 연산
		//후치연산자 : a++, a--  연산 후 증감
//		int a = 10, b = 20, c, d;
//		c = --a + b--;
//		d = a-- + --b;
//		System.out.printf("%d %d %d %d", a, b, c, d);
		
		//삼향연산자
		int score = 86;
		char grade = (score > 90) ? 'a' : 'b';
		System.out.println(score);
		
		
		

	}

}
