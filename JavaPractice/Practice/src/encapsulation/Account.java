package encapsulation;

public class Account {

	private Integer accountNumber;
	private String accountHolder;
	private Double balance;
	
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber=accountNumber;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder=accountHolder;
	}
	public void setBalance(Double balance) {
		this.balance=balance;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public Double getBalance() {
		return balance;
	}
	public void deposit(Double addBalance) {
		System.out.println("Balance added : "+addBalance);
		balance+=addBalance;
		System.out.println("New increased balance is   : "+ balance);
	}
	public void withdraw(Double withdraw) {
		System.out.println("Balance decreased : "+withdraw);
		balance-=withdraw;
		System.out.println("New decreased balance is   : "+ balance);
	}
	class Run{
	public static void main(String[] args) {
		Account account=new Account();
		account.setAccountNumber(201504626);
		account.setAccountHolder("Vivi");
		account.setBalance(5420163.25);
		System.out.println("Account number is          : "+ account.getAccountNumber());
		System.out.println("Account holder name is     : "+ account.getAccountHolder());
		System.out.println("Current bank balance is    : "+ account.getBalance());
		account.deposit(542163.25);
		account.withdraw(254163.25);

	  }
	}
  }
