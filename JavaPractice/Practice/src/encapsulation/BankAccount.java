package encapsulation;

public class BankAccount {

	private Integer accountNumber;
	private Double balance;
	
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber=accountNumber;
	}
	public void setBalance(Double balance) {
		this.balance=balance;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	class Run{
		
	public static void main(String[] args) {
	BankAccount bankAccount=new BankAccount();
	bankAccount.setAccountNumber(2041895032);
	System.out.println("Your bank account number is :"+bankAccount.getAccountNumber());
	bankAccount.setBalance(25321460.32);
	System.out.println("your balance is :"+bankAccount.getBalance());

	}
	}
}
