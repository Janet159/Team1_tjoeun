package Java_Mission_Yoon.ClassRoom_11_Bank;


public class Account {

	private String accountN;
	private String accountName;
	private int accountMoney;
	
	public Account() {
		this.accountN = "계좌번호 없음";
		this.accountName = "이름 없음";
		this.accountMoney = 0;
	}

	public Account(String accountN, String accountName, int accountMoney) {
		this.accountN = accountN;
		this.accountName = accountName;
		this.accountMoney = accountMoney;
	}

	public String getAccountN() {
		return accountN;
	}

	public void setAccountN(String accountN) {
		this.accountN = accountN;
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

	@Override
	public String toString() {
		return "Account [accountN=" + accountN + ", accountName=" + accountName + ", accountMoney=" + accountMoney
				+ "]";
	}
	
	
}
