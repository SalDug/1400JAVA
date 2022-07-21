package Ch10ClassBasic;

class Employee{
	
	public int id;
	public String name;
	public String dept;
	public String title;
	private int salary;
	private String addr;
	
	
	
	public Employee(int id, String name, String dept, String title, int salary, String adde) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.title = title;
		this.salary = salary;
		this.addr = adde;
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String adde) {
		this.addr = adde;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", title=" + title + ", salary=" + salary
				+ ", addr=" + addr + "]";
	}
	
	
	
}

public class C02PracMain {
	public static void main(String[] args) {
		Employee hong = new Employee(1010,"홍길동", "인사부", "대리", 4500, "대구");
		hong.setSalary(6000);
		hong.setAddr("울산");
		System.out.println(hong.toString());
	}
}
