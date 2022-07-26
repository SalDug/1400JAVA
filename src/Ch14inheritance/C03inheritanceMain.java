package Ch14inheritance;

class Employee{
	String name;
	int age;
	int work_time;
	Employee(String name, int age, int work_time){
		this.age = age;
		this.name = name;
		this.work_time = work_time;
	}
}
class Partimer extends Employee{
	int hour_wage;
	int term;
	Partimer(String name,int age, int work_time, int hour_wage, int term){
		super(name, age, work_time);
		this.hour_wage = hour_wage;
		this.term = term;
	}
	@Override
	public String toString() {
		return "Partimer [hour_wage=" + hour_wage + ", term=" + term + ", name=" + name + ", age=" + age
				+ ", work_time=" + work_time + "]";
	}
	
	
}
class Regular extends Employee{
	int year_wage;
	String position;
	Regular(String name,int age, int work_time, int year_wage, String position){
		super(name, age, work_time);
		this.year_wage = year_wage;
		this.position = position;
	}
	@Override
	public String toString() {
		return "Regular [year_wage=" + year_wage + ", position=" + position + ", name=" + name + ", age=" + age
				+ ", work_time=" + work_time + "]";
	}
	
}

public class C03inheritanceMain {

	public static void main(String[] args) {
		Partimer hong = new Partimer("홍길동", 55, 4, 20000, 90);
									//이름 나이 근무시간 시급 계약일수 
		Regular kim = new Regular("김상중", 44, 8, 3800, "대리");
									//이름 나이 근무시간 연봉 직책
		System.out.println(hong.toString());
		System.out.println(kim.toString());
	}

}
