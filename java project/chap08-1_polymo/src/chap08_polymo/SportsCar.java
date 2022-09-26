package chap08_polymo; // 서브클래스

// Car 를 상속받는 서브 클래스 SportsCar
// extends를 사용하면 Car에 있는 필드와 메소드를 바로 사용할수있다.

public class SportsCar extends Car{
	// 서브 클래스의 필드
	private boolean turbo;
	
	// 서브 클래스의 생성자
	public SportsCar() {
		// 묵시적 명시 > 슈퍼클래스의 생성자를 작성하지않았을때
		// Car 꺼 필드값 자동호출(항상 디폴드생성자를 호출)
		this.turbo = false;
	}
	
	public SportsCar(int speed, int gear, String color, boolean turbo) {
		// 명시적 호출 > 슈퍼클래스의 생성자를 작성
		// main클래스 에서 입력한 값을 출력
		super(speed, gear, color);
		this.turbo = turbo;
	}
	
	
	// 서브 클래스의 메소드
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	// 메소드 오버라이딩
	// 슈퍼클래스의 메소드를 수정해서 사용
	public int speedUp(int speed) {
		// this는 객체를 생성한 후에, 그 객체 자기 자신을 의미.
		// car1.speed 로 필드값에 접근.
		// car1대신에 this를 써서 모든 객체의 이름이 들어올수 있도록함.★
		
		// 객체에 있는 값에 접근을 하기 때문에,
		// 슈퍼클래스에서 가지고 있는 값을 확인하고 접근할수 있다.
		this.speed+=speed;
		
		// 서브클래스와 동일한 이름의 메소드(오버라이트)가 되어있지않다면
		// 이름 또는 this를 통해서 불러올 수 있다.
		speedDown(5);
		
		// super를 통해 super 클래스에 있는 메소드에 접근
		// super.speedUp(speed);
		System.out.println("속도가 증가하였습니다.");
		return this.speed;
	}
}
