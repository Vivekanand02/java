package encapsulation;

public class Car {
	private String companyName;
	private String modelName;
	private Integer year;
	private Double mileage;
	public Car(Double mileage) {
		this.mileage=mileage;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	public void setModelName(String modelName) {
		this.modelName=modelName;
	}
	public void setYear(Integer year) {
		this.year=year;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getModelName() {
		return modelName;
	}
	public Integer getYear() {
		return year;
	}
	public Double getMileage() {
		return mileage;
	}
	class Run{
		public static void main(String[] args) {
			Car car=new Car(42.36);
			car.setCompanyName("Toyota");
			car.setModelName("Fortuner");
			car.setYear(2020);
			System.out.println(car.getCompanyName());
			System.out.println(car.getModelName());
			System.out.println(car.getYear());
			System.out.println(car.getMileage());
			System.out.println();
			System.out.println("| UPDATED DETAILS | ");
			System.out.println();
		    car.setCompanyName("Toyota");
		    car.setModelName("Fortuner");
		    car.setYear(2024);
		    System.out.println(car.getCompanyName());
			System.out.println(car.getModelName());
			System.out.println(car.getYear());
			System.out.println(car.getMileage());
		    
		}
	}

}
