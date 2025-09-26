class LargerbTwo{
      int large(int num1,int num2){
		if(num1>num2)
			return num1;
		else
			return num2;
	  }
	  public static void main(String[] args){
		  LargerbTwo l=new LargerbTwo();
		 System.out.println(l.large(25,20));
	  }
}