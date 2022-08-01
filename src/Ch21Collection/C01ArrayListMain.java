package Ch21Collection;

import java.util.ArrayList;
import java.util.List;

public class C01ArrayListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("JSP");
		list.add("Servlet");
		list.add("Spring framework");
		list.add("Spring boot");
		list.add(1, "TEST"); //1번에 넣어짐
		
		System.out.println("저장개수" +  list.size());
		for(String str : list) {
			System.out.println(str);
		}
		list.remove(4); //index 4번째 것 삭제
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
