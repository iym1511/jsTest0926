package Book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Book book1 = new Book("홍길동전", "허균", 100);
		System.out.println(book1.getCheckOut());
		book1.isCheckOut();
		book1.printBook();  확인용*/
		Book[] booklist = new Book[100];
		for(int i = 0; i<Book.getBookCount(); i++) {
			booklist[i] = new Book();
		}
	
		// 기능 추가 및 반복하기.
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1. 전체 책 개수 확인 2. 전체 책정보 출력 3. 인덱스를 입력하여 책 대여/반납 4. 책 추가 0. 종료 : ");
			int bookchose = input.nextInt();
			
			if(bookchose == 1) {
				System.out.println("현재 책 개수는"+Book.getBookCount()+"권 입니다.");
			}else if(bookchose == 2) {
				for(int i = 0; i<Book.getBookCount(); i++) {
					booklist[i].printBook();
				}
			}
			else if(bookchose == 3) {
				System.out.println("책을 대여/반납할 인덱스를 적어주세요 : ");
				int index=input.nextInt();
				if (index >= 0 && index < Book.getBookCount()) {
					booklist[index].isCheckOut();
				}else {
					System.out.println("존재하지 않는 인덱스 입니다.");
				}
				
			}else if(bookchose == 4) {
				System.out.println("책 제목과 저자, 쪽수를 작성하세요 : ");
				String title = input.next();
				String author = input.next();
				int page = input.nextInt();
				
				// 배열의 인덱스에 객체 생성
				// Count 배열에 입력값 추가
				booklist[Book.getBookCount()]= new Book(title,author,page);
				System.out.println("작성이 완료되었습니다.");
			}else if (bookchose == 0) {
				System.out.println("도서정리 프로그램을 종료합니다.");
				break;
			}
		}
		
		
		
	}

}


