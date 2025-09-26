class ReturnDay{
	String day(int dayNo){
		switch(dayNo)
		{
			case 1: return "Monday";
			case 2: return "Tuesday";
			case 3: return "Wednesday";
			case 4: return "Thursday";
			case 5: return "Friday";
			case 6: return "Saturday";
			case 7: return "Sunday";
			default : return "Enter a digit between 1 to 7";
			}	
	}
	public static void main(String[] args){
		ReturnDay rd=new ReturnDay();
		System.out.println(rd.day(5));
	}
}