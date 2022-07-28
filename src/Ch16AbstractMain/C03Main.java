package Ch16AbstractMain;

import java.util.Scanner;
abstract class Converter {
   abstract protected double convert(double src); // 추상 메소드
   abstract protected String getSrcString(); // 추상 메소드
   abstract protected String getDestString(); // 추상 메소드
   protected double ratio; // 비율
   public void run() {
      Scanner scanner = new Scanner(System.in);
      System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
      System.out.print(getSrcString()+"을 입력하세요>> ");
      double val = scanner.nextDouble();
      double res = convert(val);
      System.out.println("변환 결과: "+res+getDestString()+"입니다");
      scanner.close();
   }
}
class Won2Dollar extends Converter {
	int won;
	int dollar;
	protected double convert(double src) {
		return src/won;
	}

	protected String getSrcString() {
		return "원";
	}

	protected String getDestString() {
		return "달러";
	}
	Won2Dollar (int won) { 
		this.won = won;
	}
}

//문제
//Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하라. 
 
public class C03Main {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
//		출력 결과
//		원을 달러로 바꿉니다.
//		원을 입력하세요>> 24000
//		변환 결과: 20.0달러입니다
	}

}