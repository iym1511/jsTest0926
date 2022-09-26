import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 80;
		if(90 <= score) {
			System.out.println("장학금 + 합격");
		}else if(60 <= score){
			System.out.println("합격");
		}else {
			System.out.println("재시험");
		}
		
		System.out.println("------------------------------------");
		
		// 숫자를 입력받아서, 합과 평균구하기
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while(true) {
			System.out.print("숫자 0을 입력하면 모든 수와 합과 평균을 출력합니다");
			int num = input.nextInt();
			sum += num;		
			if(num ==0) {
				break;
			}
			count++; // 카운트를 아래로 해줘야 0출력도 카운트포함x(break로 빠져나와서)
		}
		System.out.println("합 : "+sum+"평균 : "+sum/count);
		
		
		System.out.println("------------------------------------");
		
		// (int)(Math.random()*100)를 이용한 더하기 문제(5번 반복)
		int num1;
		for(int i = 0; i<5; i++) {
			int random = (int)(Math.random()*100);
			int random1 = (int)(Math.random()*100);
			System.out.println(random+"+"+random1+"=");//문제출력
			num1 = input.nextInt();//정답받아오기
			if(num1 == random+random1) { // 정답비교
			System.out.println("정답입니다!");
			}else {
				System.out.println("땡!");
			}
		}
		
		System.out.println("------------------------------------");
		
		// 배열

		String fu[] = {"망고", "복숭아", "자두", "포도", "사과"};
		for(int i = 0; i<fu.length; i++) {
			System.out.println(fu[i]+"가 있습니다.");
		}
		
		for(String n:fu) { // foreach문으로 간단하게
			System.out.println(n+"가 있습니다.");
		}
		System.out.println("------------------------------------");
		

		// 3의 배수와 5의 배수가 아닌 수 출력하기.
		for(int i = 1; i<=100; i++) {
			if(i%3 != 0 && i%5 != 0) {
				System.out.print(i+" ");

			}if(i%10==0) {
				System.out.println();
			}

		}

		System.out.println("------------------------------------");

		// 배열 평균
		/*int score1[] = {40,60,80,100,70};
		int avg = 0;
		int count1 = 0;
		int sum1 = 0;
		for(int i =0; i<score1.length; i++) {
			avg += score1[i];
			count1++;
			sum1 = avg/count1;
			if(70	< score1[i]) {
				System.out.println("평균 보다 큰 수 : " + score1[i]);
			}
		}			System.out.println("평균 : "+sum1);
		*/
		int[] num = { 40, 60, 80, 100, 70 };
		int sum1=0;
		int avrg = 0;
		for ( int a: num) {
			sum1+=a; // 매열 안에꺼 다더함
		}
		avrg = sum1/num.length; // 배열길이랑 다더한값 나눔 = 평균
		
		System.out.print("평균보다 큰 수 : ");
		for ( int a: num) {
			if(a > avrg) { // 평균보다 높은 배열안의 값 출력
				System.out.print(a+" ");
			}
		}
	
		
		System.out.println("------------------------------------");
		
		
	}

}
