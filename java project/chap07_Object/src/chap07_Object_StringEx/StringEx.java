package chap07_Object_StringEx;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String 클래스의 메소드 length(), charAt()
		// 문자열을 작성하고, for문을 통해서 줄력하기
		
		String date = new String("2022-08-05");
		for(int i = 0; i<date.length(); i++) {
			if(date.charAt(i) == '-') {
				// 메소드는 필드값이 아니기에
				// 대입연산자를 이용해서 값을 수정할 수 없다.
				// date.charAt(i) = "."; - 오류
				System.out.println(".");
				continue; // 여기서 햇던 결과물 - 를 없애주고 .만 남겨서 출력
			}
			System.out.println(date.charAt(i));
		}
		
	/*	2
		0
		2
		2
		.
		0
		8
		.
		0
		5   */
		
		System.out.println("----------------------------------------------------");
		
		// String 클래스의 메소드 concat()
		// While문을 통해 입력 받은 문자열 allWord에 저장하기
		

		Scanner input = new Scanner(System.in);
		String allWord = "";
		String inputWord = "";
		while(!inputWord.equals("종료")) { // 종료가 아닐때도 실행되야하기때문에  !
			System.out.println("단어를 입력하시오 (반복을 멈추려면 종료) : ");
			inputWord = input.next();
			// allWord = allWord + inputWord 와 동일한 결과
			allWord = allWord.concat(inputWord); // concat으로 추가한 값을 allWord에 대입함으로써 유지
		}			
		System.out.println(allWord);
		

		System.out.println("----------------------------------------------------");
		
		// String 클래스의 메소드 replace()
		// 실습 . 이름을 입력받고 *로 대치하는 프로그램
		
		String s ="홍길동";
		System.out.println("이름을 입력하세요");
		s = input.next();
		char middle = s.charAt(1);
		// System.out.println(middle);
		System.out.println(s.replace(middle,'*' )); // '' "" 구분하자 ''이 char랑 같이쓰인다
		

		System.out.println("----------------------------------------------------");
		
		// 실습 Integer.parseInt()
		String birthDay = "0108";
		int  birthDayNum = Integer.parseInt(birthDay);
		// 전체를 숫자로 바꿈
		System.out.println(birthDay); // 0101
		System.out.println(birthDayNum); // 101 정수로 바꼇기때문에 앞의 0 표시안됨
		
		// 달과 일을 잘라서 숫자로 바꿈
		// substring을 이용하여 글자를 자름
		String month = birthDay.substring(0, 2);
		// 자른 글자를 숫자로 바꿔줌
		int birthDayMonth = Integer.parseInt(month); // 정수로 출력
		System.out.println(birthDayMonth); // 0,1,2,3칸 중에 0,1까지 잘렷기 때문에 1출력
		
		
		String day = birthDay.substring(2);
		// 자른 글자를 숫자로 바꿔줌
		int birthDayDay = Integer.parseInt(day);
		System.out.println(birthDayDay);
		// day 에서 birthDay에서 0,1을 잘라내 가져온문자열을 
		// int birthDayDay에서 parseInt를 사용해 정수형으로 변경
		
		

	}

}
