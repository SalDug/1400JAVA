package Ch15UpdownCasting;

class Person{
	String name;
}
class Employee extends Person{
	String dept;
}
class Partimer extends Employee{
	String hourlyPay;

	@Override
	public String toString() {
		return "Partimer [hourlyPay=" + hourlyPay + ", dept=" + dept + ", name=" + name + "]";
	}
	
}
class Regular extends Employee{
	String salary;

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", dept=" + dept + ", name=" + name + "]";
	}
	
}

public class C02UpdowncastingMain {
	
	public static void ShowInfo(Person person) //상속관계의 상위 클래스, 하위 객체를 연결할 수 있는 매개변수
											   //Person person = ob1;->업캐스팅
	   										   //Person person = ob2;->업캐스팅
	{
		System.out.println(person.name); //Person 클래스에서 물려준 멤버 -> 접근 가능
		//System.out.println(person.dept); //Employee 클래스에서 물려준 멤버 -> 접근 불가
		
		if(person instanceof Partimer) {
			Partimer pp = (Partimer)person;
			System.out.println(pp.toString());
		}
		if(person instanceof Regular) {
			Regular pp = (Regular)person;
			System.out.println(pp.toString());
		}
	}

	public static void main(String[] args) {
		Partimer ob1 = new Partimer();
		ob1.name = "홍길동"; ob1.dept = "인사부"; ob1.hourlyPay = "20000";
		ShowInfo(ob1);
		Regular ob2 = new Regular();
		ob2.name = "김상중"; ob2.dept = "총무부"; ob2.salary = "4000";
		ShowInfo(ob2);

	}

}
