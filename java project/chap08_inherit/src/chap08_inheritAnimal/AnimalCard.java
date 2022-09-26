package chap08_inheritAnimal;

public class AnimalCard {
	// 필드 선언
	private String animal;
	private String name;
	private int month;
	
	// 정적 변수 cardCount; - private ■
	private static int cardCount = 0;
	
	// 정적 변수로 만든 상수 MAX_CARD; - public
	public static int MAX_CARD = 100;
	
	// 정적 메소드 getCardCount - public
	public static int getCardCount() { // 자료형메소드 리턴
		return cardCount;
	}
	
	
	// 생성자
	public AnimalCard(){
		// 필드변수 초기화
		this.animal = "";
		this.name = "";
		this.month = 0;
		
		cardCount++;
	}
	
	// 생성자 오버로딩
	public AnimalCard(String Animal, String Name, int Month){
		// 매개값 이용 필드변수 초기화
		this.animal = Animal;
		this.name = Name;
		this.month = Month;
		
		cardCount++;
	}
	
	// 접근자 선언 - 초기화된 필드값 읽음
	public String getAnimal() {
		return this.animal;	// 입력받은거 출력
	}
	
	// 설정자 선언 - 초기화된 필드값 변경
	public void setAnimal(String a) {
		this.animal = a; // 메인클래스에서 입력받음
	}
	
	public String getName() {
		return this.name; 
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setMonth(int m) {
		this.month = m;
	}
	
	// 실습 동물종류와 이름과 개월수를 출력하는 메소드
	// ! get 메소드를 이용해서 이름값을 가져오자
	// 출력내용 :   동물종류 : animal, 이름 : name , month개월
	// 메소드안에서 메소드 부르는거확인
	public void printAnimalCard() {
		String animal = getAnimal();
		String name = getName();
		int month = getMonth();
		//this.getAnimal();
		//this.getName();
		//this.getMonth();
		System.out.println("동물종류:"+getAnimal()+" | 이름:"+getName()+" | "+getMonth()+"개월");
	}
	
	
}
