package chap08_inheritAnimal;

public class AnimalCardNew extends AnimalCard{
	// 필드값
	private String personName;
	
	
	// 생성자
	// 디폴트 생성자
	public AnimalCardNew() {
		this.personName = "";
	}
	// 매개변수를 갖는 생성자 / 오버로딩 해줄려고
	public AnimalCardNew(String animal, String name, int month, String personName) {
		super(animal, name, month);
		this.personName = personName;
	}
	// 메소드 오버라이딩
	@Override // 같은 메소드를 중복 정의 / 여기서 PrintAnimalCard에 추가한다
	public void printAnimalCard() {
		System.out.println("보호자 : "+this.personName);
		super.printAnimalCard();
	}
}
