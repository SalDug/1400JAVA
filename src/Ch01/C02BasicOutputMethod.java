package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {

		//System.out : 표준 출력 스트림(해석 : 표준출력장치(모니터)에 데이터 전달)
		
		//System.out.print(): 콘솔화면에 내용 출력
		//Escape 문자 사용을 통한 개행(줄바꿈)
		//Escape : 탈출하다, 벗어나다
		//Escape문자: 기존의 문자용도를 벗어나 특정한 기능 수행에 사용되는 문자  
		//  \n: 줄바꿈(개행)
		//  \b:한 문자 삭제
		//  \t: 탭(8칸)
		/*
		 * System.out.print("   *   \n"); System.out.print("  ***  \n");
		 * System.out.print(" ***** \n"); System.out.print("*******\n");
		 */
		
		//System.out.printf()
		//f = format
		//format : 형식, 서식
		//서식 : 서류를 꾸미는 일정한 양식
		
		//%d : 10진수 정수 서식문자
		//%f : 실수 서식문자
		//%c : 한문자 서식문자
		//%s : 문자열 서식문자
		/*
		 * System.out.printf("%d\n", 10); System.out.printf("%d + %d = %d\n", 10 , 20,
		 * 10+20); System.out.printf("%f + %f = %f\n", 10.23 , 20.75, 10.23+20.75);
		 * System.out.printf("%c %c %c\n", 'A', 'B', 'C');
		 * System.out.printf("%s %s %s\n", "This is", "String", "Test");
		 * System.out.printf("%d.%s: %d\n", 1,"성적", 100);
		 * 
		 * System.out.printf("나의 이름은 %s 입니다.\n", "함형민");
		 * System.out.printf("나의 나이는 %d 입니다.\n", 20);
		 * System.out.printf("나의 성별은 %c 입니다.\n", '남');
		 */
		
		//서식문자 정렬/자리수지정
		//%10d : 10칸 확보 후 오른쪽 정렬
		//%-10d : 10칸 확보 후 왼쪽 정렬
		/*
		 * System.out.printf("%10d%d\n", 1234, 5678); System.out.printf("%10.2f\n",
		 * 12.345678);
		 */
		//주의!
//		System.out.print("I say \"hello?\"");
		
		//System.out.println() - 자동줄바꿈, 서식문자열 못씀
		
		/*
		 * System.out.println("Hello world"); System.out.println("Hello world");
		 * System.out.println("Hello world"); System.out.println("Hello world");
		 */
		
		System.out.printf("%-10s%-10s%-10s%-10s\n", "no", "이름", "나이", "주소");
		System.out.printf("%-10d%-10s%-10d%-10s\n", 1, "동상건", 20, "대구");
		System.out.printf("%-10d%-10s%-10d%-10s\n", 2, "서하곤", 30, "서울");
		System.out.printf("%-10d%-10s%-10d%-10s\n", 3, "남좌감", 40, "울산");
		System.out.printf("%-10d%-10s%-10d%-10s\n", 4, "북우리", 50, "김해");
		System.out.println();
		System.out.println();
		System.out.printf("%-10s%-10s%-13s%-10s\n", "Code", "Title", "Publisher", "Price");
		System.out.printf("%-10d%-10s%-12s%-10d\n", 1010, "DoltJava", "00미디어", 29000);
		System.out.printf("%-10d%-9s%-11s%-10d\n", 2020, "윤성우C", "오렌지미디어", 25000);
		System.out.println();
		System.out.println();
		System.out.print("   *   \n"); 
		System.out.print("  ***  \n");
		System.out.print(" ***** \n"); 
		System.out.print("*******\n");
		System.out.print(" ***** \n"); 
		System.out.print("  ***  \n");
		System.out.print("   *   \n"); 
		
	}

}
