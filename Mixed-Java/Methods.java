class Methods
{
	static String college="GITAM";
	static String subject1st="java";
	static String subject2nd="SQL";
	static String subject3rd="Web-Tech";
	static final int totalMarks=300;
	void sDetails(int id,String name,int marksOf1stSub,int marksOf2ndSub,int marksOf3rdSub){
		int percentage=(marksOf1stSub+marksOf2ndSub+marksOf3rdSub)*100/totalMarks;
		System.out.println("---------------------------------------------------------------");
		System.out.println(college+" | "+id+" | "+name+" | "+subject1st+" | "+subject2nd+" | "+subject3rd+" | "+marksOf1stSub+" | "+marksOf2ndSub+" | "+marksOf3rdSub+" | "+percentage+"%");
		System.out.println("---------------------------------------------------------------");
	}
	public static void main(String[] args)
	{
		Methods methods=new Methods();
		methods.sDetails(1,"vivi",85,90,95);
		
		Methods methods2=new Methods();
		methods2.sDetails(2,"Anupam",86,91,94);
		
		Methods methods3=new Methods();
		methods3.sDetails(3,"Aditya",85,91,90);
		
		Methods methods4=new Methods();
		methods4.sDetails(4,"Gopal",89,92,93);
		
		Methods methods5=new Methods();
		methods5.sDetails(5,"Rakesh",88,80,97);
		
		Methods methods6=new Methods();
		methods6.sDetails(6,"Akshay",90,81,90);
		
		Methods methods7=new Methods();
		methods7.sDetails(7,"Deepak",88,91,94);	
	}
}