package Bank;

public class BankAcc {
	public String bankNum;
	private int money;
	
	public BankAcc(String s) {
		this.money = 0;
		this.bankNum = s;
	}
	
	public int getMoney() {
		return this.money;
	}
	public void inMoney(int a) {
		this.money +=a; // 입금받음
	}
	public void outMoney(int a) {
		if(money < a) {
			System.out.println("금액이 부족합니다");
		}else {
			this.money -=a; // 인출함
		}

	}

		
	
		
	
}
