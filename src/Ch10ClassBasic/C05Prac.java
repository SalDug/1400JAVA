package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(str.length());
		System.out.println(str.substring(2, 5));
		String temp = sc.nextLine();
		System.out.println(str.contains(temp));
		String same = sc.nextLine();
		System.out.println(str.equals(same));
		System.out.println(str.substring(3, str.length()));
		
		
		sc.close();
	}
}
