class Armstrong{
	static void armstrong(int num){
		for(int i=1;i<=num;i++){
			int sum=0;
			int temp=i;
			while(temp>0){
				int digit=temp%10;
				sum=sum+(digit*digit*digit);
				temp/=10;
			}
			if(sum==i)System.out.println(i);
		}
	}
	public static void main(String[] args){
		armstrong(2000);
	}
	
}

