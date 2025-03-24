package Java_Mission_Yoon.ClassRoom._11_Bank;

public class Account {

	// 계좌번호, 예금주, 잔액, 비밀번호
	private String accountNew;		// 계좌번호
	private String accountName;		// 계좌명
	private int accountInput;		// 입금
	private int accountOutput;		// 출금
	private int accountRest;		// 잔금
	private int accountPw;			// 계좌비밀번호
	
	
	
	public Account() {
	}



	public Account(String accountNew, String accountName, int accountInput, int accountOutput, int accountRest,
			int accountPw) {
		this.accountNew = accountNew;
		this.accountName = accountName;
		this.accountInput = accountInput;
		this.accountOutput = accountOutput;
		this.accountRest = accountRest;
		this.accountPw = accountPw;
	}



	public String getAccountNew() {
		return accountNew;
	}



	public void setAccountNew(String accountNew) {
		this.accountNew = accountNew;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public int getAccountInput() {
		return accountInput;
	}



	public void setAccountInput(int accountInput) {
		this.accountInput = accountInput;
	}



	public int getAccountOutput() {
		return accountOutput;
	}



	public void setAccountOutput(int accountOutput) {
		this.accountOutput = accountOutput;
	}



	public int getAccountRest() {
		return accountRest;
	}



	public void setAccountRest(int accountRest) {
		this.accountRest = accountRest;
	}



	public int getAccountPw() {
		return accountPw;
	}



	public void setAccountPw(int accountPw) {
		this.accountPw = accountPw;
	}



	@Override
	public String toString() {
		return "Account [accountNew=" + accountNew + ", accountName=" + accountName + ", accountInput=" + accountInput
				+ ", accountOutput=" + accountOutput + ", accountRest=" + accountRest + ", accountPw=" + accountPw
				+ "]";
	}
	
	
	
	
	
	
	
	

	
	
	
	
}
