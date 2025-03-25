package Java_Mission_Yoon.ClassRoom._11_Bank;

public class Account {

	// 계좌번호, 예금주, 잔액, 비밀번호
	private String accountNum;		// 계좌번호
	private String accountName;		// 계좌명
	private int accountMoney;		// 입금
	private int accountPw;			// 계좌비밀번호
	
	public Account() {
		this.accountNum = "계좌없음";
		this.accountName = "이름없음";
		this.accountMoney = 0;
	}

	public Account(String accountNum, String accountName, int accountMoney, int accountRest, int accountPw) {
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.accountMoney = accountMoney;
		this.accountPw = accountPw;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountMoney() {
		return accountMoney;
	}

	public void setAccountMoney(int accountMoney) {
		this.accountMoney = accountMoney;
	}


	public int getAccountPw() {
		return accountPw;
	}

	public void setAccountPw(int accountPw) {
		this.accountPw = accountPw;
	}

	@Override
	public String toString() {
		return "Account [accountNum=" + accountNum + ", accountName=" + accountName + ", accountMoney=" + accountMoney
				+ ", accountRest=" + ", accountPw=" + accountPw + "]";
	}

	


	
	
	

	
	
	
	
}
