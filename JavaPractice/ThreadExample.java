class Thread1 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			System.out.print(e);
		}
		
		}
		
	}
}
class ThreadExample{
	public static void main(String[] args){
		Thread1 t=new Thread1();
		Thread1 t2=new Thread1();
		t.start();
		t2.start();
	}
}