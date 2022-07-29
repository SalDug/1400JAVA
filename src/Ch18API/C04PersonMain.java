package Ch18API;

class Person{
	private String name;
	private String id;
	private String addr;
	Person(String name, String id, String addr){
		this.addr = addr;
		this.id = id;
		this.name = name;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person down = (Person)obj;
			
			return this.id == down.id && this.addr == down.addr;
		}
		
		return false;
	}
	public String toString() {
		return "name:" + name + " addr:" + addr;
	}
	
	
}


public class C04PersonMain {

	public static void main(String[] args) {
		Person hong1 = new Person("홍길동", "888-888", "대구");
		Person hong2 = new Person("홍길동", "888-888", "대구");
		Person hong3 = new Person("김상중", "123-456", "울산");
		System.out.println(hong1);
		System.out.println(hong1.equals(hong2));
		System.out.println(hong1.equals(hong3));

	}

}
