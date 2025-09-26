package encapsulation;

class SmartPhone {

	private String brand;
	private String model;
	private Integer storageCapacity;
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity=storageCapacity;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	
	public void increaseStorage(Integer storageCapacity) {
		this.storageCapacity=storageCapacity;
		System.out.println(storageCapacity+" gb");
	}
}
class Run36{

public static void main(String[] args) 
{
	SmartPhone smartPhone=new SmartPhone();
	smartPhone.setBrand("Nokia");
	smartPhone.setModel("5233");
	smartPhone.setStorageCapacity(64);
	System.out.println(smartPhone.getBrand());
	System.out.println(smartPhone.getModel());
	smartPhone.increaseStorage(64);
	}
  }

