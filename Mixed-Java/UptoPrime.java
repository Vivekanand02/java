class UptoPrime{
	static void prime(int num){
		
	for(int i=2;i<=num;i++){
		boolean isPrime=true;
		for(int j=2;j<=Math.sqrt(num);j++){
		if(i%j==0 && i!=j){
			isPrime=false;
			break;
		}
		}
		 if (isPrime) 
                System.out.print( i+ " ");
	}
	}
	public static void main(String[] args){
		prime(100);
	}
}