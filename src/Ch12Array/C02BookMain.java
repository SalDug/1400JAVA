package Ch12Array;

import java.util.Scanner;

class BookInfo{
	String bookCode;
	String bookTitle;
	String Publisher;
	@Override
	public String toString() {
		return "BookInfo [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", Publisher=" + Publisher + "]";
	}
	
}




public class C02BookMain {

	public static void main(String[] args) {
		BookInfo list [] = new BookInfo[3];
		Scanner sc = new Scanner(System.in);
		list[0] = new BookInfo();
		list[1] = new BookInfo();
		list[2] = new BookInfo();
		
		for(BookInfo book : list) {
			System.out.println("코드|제목|출판사 입력 : ");
			book.bookCode = sc.next();
			book.bookTitle = sc.next();
			book.Publisher = sc.next();
		}
		for(BookInfo book : list) {			
			System.out.println(book.toString());

		}
		
		sc.close();
	}

}
