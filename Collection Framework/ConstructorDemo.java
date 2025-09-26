class ConstructorDemo{
	public static void main(String[] args){
		Car c=new Car(" "," ");
		}
}
	class Car{
		String model;
		String year;
		Car(String model,String year){
			if(model==null || model.isEmpty())
				System.out.print(this.model);
			if(year==null || year.isEmpty())
				System.out.print(this.year);
			this.model=model;
			this.year=year;
			System.out.print(model+" "+year);
		}
	}
