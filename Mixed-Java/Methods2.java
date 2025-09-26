class Methods2
{
	static String college="GITAM";
	static String subject1st="java";
	static String subject2nd="SQL";
	static String subject3rd="Web-Tech";
	static final int totalMarks=300;
	double sDetails(int id,String name,int marksOf1stSub,int marksOf2ndSub,int marksOf3rdSub){
		double percentage=(marksOf1stSub+marksOf2ndSub+marksOf3rdSub)*100/totalMarks;
		System.out.println("---------------------------------------------------------------");
		System.out.println(college+" | "+id+" | "+name+" | "+subject1st+" | "+subject2nd+" | "+subject3rd+" | "+marksOf1stSub+" | "+marksOf2ndSub+" | "+marksOf3rdSub+" | "+percentage+"%");
		System.out.println("---------------------------------------------------------------");
		return percentage;
	}
	static void grade(double percentage){
	 if (percentage >= 90) {
            System.out.println("Grade: Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade: Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: Average");
        } else {
            System.out.println("Grade: Needs Improvement");
        }
        System.out.println();
	}
	public static void main(String[] args)
	{
		 Methods2 methods = new Methods2();

        double p1 = methods.sDetails(1, "Vivi", 85, 90, 95);
		
        grade(p1);

        double p2 = methods.sDetails(2, "Anupam", 86, 91, 94);
        grade(p2);

        double p3 = methods.sDetails(3, "Aditya", 85, 91, 90);
        grade(p3);

        double p4 = methods.sDetails(4, "Gopal", 89, 92, 93);
        grade(p4);

        double p5 = methods.sDetails(5, "Rakesh", 88, 80, 97);
        grade(p5);

        double p6 = methods.sDetails(6, "Akshay", 90, 81, 90);
        grade(p6);

        double p7 = methods.sDetails(7, "Deepak", 98, 91, 94);
        grade(p7);
	}
}