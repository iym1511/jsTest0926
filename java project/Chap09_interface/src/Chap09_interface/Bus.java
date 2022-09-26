package Chap09_interface;

public class Bus implements CarOptionInterface{
	// 인터페이스의 추상메소드를 추가하고싶을때는
	// 상속을 통해서 새로운 인터페이스에 추가하는 것이 안전하다
	@Override
	public void printCar() { // CarInterface에 있는 추상메소드
		// TODO Auto-generated method stub
		// CarOptionInterface 가 CarInterface에 상속을 받음
		System.out.println("CarOptionInterface를 Bus에서 구현했습니다");
	}

	@Override
	public void carDrive() { // CarOptionIntercafe에서 작성한 추상메소드
		// TODO Auto-generated method stub
		
	}



}
