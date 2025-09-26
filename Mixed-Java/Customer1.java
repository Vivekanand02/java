class Customer1
{
	static String companyName="Google";
	int customerId=1;
	String name="Vivekanand";
	static void details()
	{
		System.out.println(companyName);
		System.out.println(new Customer1().customerId);
		System.out.println(new Customer1().name);
	} 
	static void staticPDetails(int customerId,String name)
	{
		System.out.println(companyName);
		System.out.println(customerId);
		System.out.println(name);
	} 
	void nonStaticDetails()
	{
		System.out.println(new Customer1().companyName);
		System.out.println(customerId);
		System.out.println(name);
	} 
	void nonStaticPDetails(int customerId,String name)
	{
		System.out.println(new Customer1().companyName);
		System.out.println(customerId);
		System.out.println(name);
	} 
	
	public static void main(String[] args){
		details();
		staticPDetails(2,"Vivi");
		new Customer1().nonStaticDetails();
		new Customer1().nonStaticPDetails(3,"vivek");
	}
}