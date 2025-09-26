class Bank{
	private int balance=50000;
		synchronized void withdraw(int amount){
			if(balance>=amount){
				System.out.println(Thread.currentThread().getName()+" "+amount);
			balance-=amount;
			System.out.println("available balance :"+balance);
			}
			else{
				System.out.print("Insufficient balance "+Thread.currentThread().getName());
			}
		}
}
class ThreadExample2{
	public static void main(String[] args){
		Bank bank=new Bank();
		Runnable task =() -> bank.withdraw(24000);
		Thread thread=new Thread(task,"user 1");
				Thread thread1=new Thread(task,"user 2");
				thread.start();
				thread1.start();

	}
}