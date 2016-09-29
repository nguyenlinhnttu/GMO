package TinhTruuTuong;
class Salary extends Employee
{
   private double salary; 
   
   public Salary(String name, String address, int number, double
      salary){
       super(name, address, number);
       setSalary(salary);
   }
   public void mailCheck()
   {
       System.out.println("Gửi mail tới  " + getName()
       + " salary là: " + salary);
   }
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	  
}