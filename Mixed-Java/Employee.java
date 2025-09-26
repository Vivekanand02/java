class Employee{
	static String companyName="Google";
	int employeeId=1;
	String name="Vivekanand";
	static void details()
	{
		System.out.println(companyName);
		System.out.println(new Employee().employeeId);
		System.out.println(new Employee().name);
	} 
	static void staticPDetails(int employeeId,String name)
	{
		System.out.println(companyName);
		System.out.println(employeeId);
		System.out.println(name);
	} 
	void nonStaticDetails()
	{
		System.out.println(new Employee().companyName);
		System.out.println(employeeId);
		System.out.println(name);
	} 
	void nonStaticPDetails(int employeeId,String name)
	{
		System.out.println(new Employee().companyName);
		System.out.println(employeeId);
		System.out.println(name);
	} 
	public static void main(String[] args){
		details();
		staticPDetails(2,"Vivi");
		new Employee().nonStaticDetails();
		new Employee().nonStaticPDetails(3,"vivek");
	}
}