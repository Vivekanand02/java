package encapsulation;

class employee {
	private Integer empNo;
	private String empName;
	private Double empSal;
	
	public void setEmpNo(Integer empNo) {
		this.empNo=empNo;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setEmpSal(Double empSal) {
		this.empSal=empSal;
	}
	public Integer getEmpNo(){
		return empNo;
	}
	public String getEmpName(){
		return empName;
	}
	public Double getEmpSal(){
		return empSal;
	}

	public static void main(String[] args) {
		employee employee=new employee();
		employee.setEmpNo(100);
		System.out.println("Employee number :"+ employee.getEmpNo());
		employee.setEmpName("Vivekanand Sharma");
		System.out.println("Employee name   :"+ employee.getEmpName());
		employee.setEmpSal(500000.25);
		System.out.println("Employee salary :"+ employee.getEmpSal());
    }
}

  

