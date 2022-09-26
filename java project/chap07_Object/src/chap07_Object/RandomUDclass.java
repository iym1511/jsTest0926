package chap07_Object;

import java.util.Scanner;

public class RandomUDclass {
	// ★★★★★★★★★★★★★
	// 필드 - private : 직접접근해서 값을 수정하는것을 막기위함
	private int num; // 랜덤한 수
	private int usernum; // 유저입력 수
	public int count = 1; // 시도횟수
	
	// public - 객체를 통해서 사용되는 메소드 ★★★★
	// private - 클래스 안에서만 사용되는 메소드 ★★★★
	//			내용이 길어지거나, 반복되는 내용을 메소드로 쓰기 위함
	// 메소드 > RandomUD에서 작성한 내용을 그대로 들고옴
	public void start() { // 이거는 지금이 클래스안에서 실행시킨거
		System.out.println("start메소드에서 진행되는 내용입니다.");
		
		// 1. 랜덤한 수 만듦
		this.num = (int) (Math.random() * 100) + 1;
		System.out.println(num);

		// 2. 수를 입력받음
		// int usernum; > 필드에 있는 usernum으로 접근 이미선언되있음
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("숫자값을 입력해주세요 : ");
			usernum = input.nextInt();

			// 3. 입력받은 수와 랜덤한 수를 비교하고 결과 출력
			if (this.usernum > this.num) {
				// 4. 결과 출력
				System.out.println("입력한 숫자가 더 큽니다");
			} else if (this.usernum < this.num) {
				System.out.println("입력하 숫자가 더 작습니다");
			} else {
				// usernum과 num이 같을때 while문을 빠져나옴
				break;
			}
		}
		System.out.println("정답");
		
	}
	
	
	// 밖의 메인클래스에서 작동시키는용(수업니즈에 맞는건 이거)★★★
	// 랜덤한 숫자값을 할당
	private void getRandomNum() {
		this.num = (int)(Math.random()*100)+1;
	}
	private int checkUserGuess() {
		Scanner input = new Scanner(System.in);
		System.out.println("값을 입력해주세요 : ");
		this.usernum = input.nextInt();
		return usernum; // 입력받은값 반환
	}
	
	// Num 값이 큰지 작은지 같은지 확인.
	private void checkNum() {
		if (this.num < this.usernum) {
			System.out.println("입력한값이 더 큽니다");
		}else if(this.num > this.usernum) {
			System.out.println("입력한값이 더 작습니다");
		}else {
			System.out.println("같습니다");
		}
		System.out.println("시도횟수"+count);
		count++;
	}
	
	// 앞에 만든 메소드를 조립해서 실행 ★★★★★★★★★★★★★
	public void startPlay() { // startPlay를 통해서 실행을 해야하기 때문에 public ★★★★
		this.getRandomNum(); // 렌덤한 수를 할당
		while(true) { // 여기서한번에 와일문써서 반복가능
			this.checkUserGuess(); // 값을 입력받아옴
			this.checkNum(); // 비교하여 결과 출력
			if(this.num == this.usernum) { //두개가 같으면 멈춤
				break;
			}
		}
	}
	
	
}
