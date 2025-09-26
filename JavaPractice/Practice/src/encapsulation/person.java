package encapsulation;

public class person {
	private String name;
	private Integer age;
	private String country;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(Integer age) {
		this.age=age;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	class Run
	{
	public static void main(String[] args) 
	{
		person person1=new person();
		person1.setAge(23);
		System.out.println("Person"+"'"+"s"+" age     :"+person1.getAge());
		person1.setName("Vivi");
		System.out.println("Person"+"'"+"s"+" name    :"+person1.getName());
		person1.setCountry("India");
		System.out.println("Person"+"'"+"s"+" address :"+person1.getCountry());

	   }
	}
}
